package khs.study.youtubesynchronizer_android.activity.channel.model;

import android.util.Log;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.domain.ChannelPageDto;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;
import khs.study.youtubesynchronizer_android.activity.utils.RestClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelServiceImpl implements ChannelService {
    ChannelPresenter mChannelPresenter;

    ChannelDao mChannelDao;
    RestClient<ChannelDao> mRestClient;

    Channel mChannel;
    ChannelPageDto<Channel> mChannelDto;
    List<Channel> mChannelList;

    public ChannelServiceImpl() {
        mRestClient = new RestClient<ChannelDao>();
        mChannelDao = mRestClient.getClient(ChannelDao.class);
    }

    @Override
    public void setPresenter(ChannelPresenter channelPresenter) {
        mChannelPresenter = channelPresenter;
    }

    // ------------------------------------- PresenterListener -------------------------------

    @Override
    public void loadChannelList() {
        Log.d("JYP/Service", "loadItems");

        Call<ChannelPageDto<Channel>> call = mChannelDao.getMessageList();
        call.enqueue(new Callback<ChannelPageDto<Channel>>() {
            @Override
            public void onResponse(Call<ChannelPageDto<Channel>> call, Response<ChannelPageDto<Channel>> response) {
                if (response.isSuccessful()) {
                    mChannelDto = response.body();
                    Log.d("JYP/Service", mChannelDto.getContent().toString());
                } else {
                    Log.d("JYP/Service", "Unexpected response");
                }
            }

            @Override
            public void onFailure(Call<ChannelPageDto<Channel>> call, Throwable t) {
                Log.d("JYP/Service", "Failure");
            }
        });
    }
    @Override
    public void newChannel(Channel channel) {

    }

    @Override
    public void updateChannel(Channel channel) {

    }

    @Override
    public void deleteChannel(Channel channel) {

    }

    // ------------------------------------- PresenterCommander -------------------------------

    @Override
    public void onLoadChannelListSuccess(List<Channel> channelList) {
        Log.d("JYP/Service", "onLoadChannelListSuccess");
        mChannelPresenter.onLoadChannelListSuccess(channelList);
    }

    @Override
    public void onNewChannelSuccess() {

    }

    @Override
    public void onUpdateChannelSuccess() {

    }

    @Override
    public void onDeleteChannelSuccess() {

    }
}
