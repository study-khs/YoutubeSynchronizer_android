package khs.study.youtubesynchronizer_android.activity.channel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelModel;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelModelImpl;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelActivity extends Activity implements ChannelPresenter {
    ChannelModel channelModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);

        setModel(new ChannelModelImpl());
        channelModel.setPresenter(this);
        loadChannels();
    }

    @Override
    public void attachView(ChannelView channelView) {
        // todo attach ViewGroup
    }

    @Override
    public void detachView(ChannelView channelView) {

    }

    @Override
    public void setModel(ChannelModel channelModel) {
        this.channelModel = channelModel;
    }

    @Override
    public void fromViewListener() {
        //todo Refresh Button Click -> loadChannels
    }

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
    public void reDrawView() {

    }

    @Override
    public List<Channel> loadChannels() {
        Log.d("JYP/Model", "loadChannels");
        return channelModel.loadItems();
    }

    @Override
    public void postChannel() {

    }

    @Override
    public void putChannel() {

    }

    @Override
    public void deleteChannel() {

    }

    @Override
    public void onLoadItemsSuccess(List<Channel> channelList) {
        // channelList
        Log.d("JYP/Presenter", "onLoadItemsSuccess");
        // todo updateView
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
