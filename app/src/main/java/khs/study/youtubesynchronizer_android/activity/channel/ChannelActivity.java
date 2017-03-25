package khs.study.youtubesynchronizer_android.activity.channel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelService;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelServiceImpl;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelActivity extends Activity implements ChannelPresenter {

    ChannelService mChannelService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);

        setService(new ChannelServiceImpl());
        mChannelService.setPresenter(this);

        loadChannelList();
    }

    @Override
    public void attachView(ChannelView channelView) {
        // todo attach ViewGroup
    }

    @Override
    public void detachView(ChannelView channelView) {

    }

    @Override
    public void setService(ChannelService channelService) {
        mChannelService = channelService;
    }

    // ------------------------------------- ModelCommander -------------------------------

    @Override
    public void loadChannelList() {
        Log.d("JYP/Presenter", "loadChannels");
        mChannelService.loadChannelList();
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

    // ------------------------------------- ModelListener -------------------------------

    @Override
    public void onLoadChannelListSuccess(List<Channel> channelList) {
        Log.d("JYP/Presenter", "onLoadItemsSuccess");
        updateList(channelList);
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

    // ------------------------------------- ViewCommander -------------------------------

    @Override
    public void goToChannelDetailActivity() {

    }

    @Override
    public void showNewChannelDialog() {

    }

    @Override
    public void showChannelDetailDialog() {

    }

    @Override
    public void updateList(List<Channel> channelList) {

    }

    // ------------------------------------- ViewListener -------------------------------


    @Override
    public void onGoToChannelDetailButtonClick() {

    }

    @Override
    public void onNewChannelDialogButtonClick() {

    }

    @Override
    public void onChannelDetailDialog() {

    }

    @Override
    public void onUpdateListButtonClick() {
        loadChannelList();
    }
}
