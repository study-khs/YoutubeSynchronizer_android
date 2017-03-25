package khs.study.youtubesynchronizer_android.activity.channel.view;

import android.app.Activity;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelView {

    void setActivity(Activity activity);
    void setPresenter(ChannelPresenter channelPresenter);

    // ------------------------------------- PresenterListener -------------------------------

    void goToChannelDetailActivity();

    void showNewChannelDialog();

    void showChannelDetailDialog();

    void updateList(List<Channel> channelList); //todo

    // ------------------------------------- PresenterCommander -------------------------------

    void onGoToChannelDetailButtonClick();
    void onNewChannelDialogButtonClick();
    void onChannelDetailDialog();
    void onUpdateListButtonClick(); //todo
}
