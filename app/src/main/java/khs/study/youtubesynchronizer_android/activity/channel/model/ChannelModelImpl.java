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

public class ChannelModelImpl implements ChannelModel {
    ChannelPresenter mChannelPresenter;

    ChannelService mChannelService;
    RestClient<ChannelService> mRestClient;

    Channel mChannel;
    ChannelPageDto<Channel> mChannelDto;
    List<Channel> mChannelList;

    public ChannelModelImpl() {
        mRestClient = new RestClient<ChannelService>();
        mChannelService = mRestClient.getClient(ChannelService.class);
    }

    @Override
    public List<Channel> loadItems() {
        Call<ChannelPageDto<Channel>> call = mChannelService.getMessageList();
        call.enqueue(new Callback<ChannelPageDto<Channel>>() {
            @Override
            public void onResponse(Call<ChannelPageDto<Channel>> call, Response<ChannelPageDto<Channel>> response) {
                if (response.isSuccessful()) {
                    mChannelDto = response.body();
                    Log.d("JYP", mChannelDto.getContent().toString());
                } else {
                    Log.d("JYP", "Unexpected response");
                }
            }

            @Override
            public void onFailure(Call<ChannelPageDto<Channel>> call, Throwable t) {
                Log.d("JYP", "Failure");
            }
        });

        return null;
    }

    @Override
    public void addItem(Channel channel) {

    }

    @Override
    public void updateItem(Channel channel) {

    }

    @Override
    public void delItem(Channel channel) {

    }

    @Override
    public void setPresenter(ChannelPresenter channelPresenter) {
        mChannelPresenter = channelPresenter;
    }

    @Override
    public void onLoadItemsSuccess() {
        mChannelPresenter.onLoadItemsSuccess(mChannelList);
    }

    @Override
    public void onAddItemSuccess() {

    }

    @Override
    public void onUpdateItemSuccess() {

    }

    @Override
    public void onDelItemSuccess() {

    }
}
