package khs.study.youtubesynchronizer_android.activity.channel;

import android.app.Activity;
import android.os.Bundle;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelModel;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelActivity extends Activity implements ChannelPresenter {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);
    }

    @Override
    public void attachView(ChannelView channelView) {

    }

    @Override
    public void detachView(ChannelView channelView) {

    }

    @Override
    public void setModel(ChannelModel channelModel) {

    }

    @Override
    public void fromViewListener() {

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
    public void loadChannelPageDto() {

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
}
