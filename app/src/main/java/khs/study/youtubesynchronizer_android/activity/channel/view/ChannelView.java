package khs.study.youtubesynchronizer_android.activity.channel.view;

import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelView {
    void setPresenter(ChannelPresenter channelPresenter);

    void goToChannelDetailActivity();
    void showNewChannelDialog();
    void showChannelDetailDialog();
    void redrawView();
}
