package khs.study.youtubesynchronizer_android.activity.channel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelService;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelServiceImpl;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelViewImpl;
import khs.study.youtubesynchronizer_android.activity.channel_detail.ChannelDetailActivity;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelActivity extends Activity implements ChannelPresenter {

    ChannelService mChannelService;
    ChannelView mChannelView;

    List<Channel> mChannelList;

    Button mViewTestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);

        setService(new ChannelServiceImpl());
        mChannelService.setPresenter(this);
        attachView(new ChannelViewImpl());
        mChannelView.setPresenter(this);
        Log.d("JYP/Presenter", "SetPresenterOnView");

        loadChannelList();

        // View test code
        mViewTestBtn = (Button) findViewById(R.id.testBtn);
        mViewTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mChannelView.updateList(mChannelList);
            }
        });
    }

    @Override
    public void attachView(ChannelView channelView) {
        mChannelView = channelView;
        Log.d("JYP/Presenter", "attachView");
    }

    @Override
    public void detachView() {
        mChannelView = null;
    }

    @Override
    public void setService(ChannelService channelService) {
        mChannelService = channelService;
    }

    // ------------------------------------- ModelCommander -------------------------------

    @Override
    public void loadChannelList() {
        mChannelService.loadChannelList();
        Log.d("JYP/Presenter", "loadChannels");
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
        mChannelList = channelList;
        //updateList(channelList);
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
        startActivity(new Intent(this.getApplicationContext(), ChannelDetailActivity.class));
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
        goToChannelDetailActivity();
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
