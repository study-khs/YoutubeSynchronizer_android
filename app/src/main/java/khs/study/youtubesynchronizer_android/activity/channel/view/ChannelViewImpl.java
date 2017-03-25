package khs.study.youtubesynchronizer_android.activity.channel.view;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelViewImpl implements ChannelView {
    ChannelPresenter channelPresenter;

    @Override
    public void setPresenter(ChannelPresenter channelPresenter) {
        this.channelPresenter = channelPresenter;
    }
    // ------------------------------------- PresenterListener -------------------------------

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
        //todo
    }

    // ------------------------------------- PresenterCommander -------------------------------


    @Override
    public void onGoToChannelDetailButtonClick() {
        channelPresenter.onGoToChannelDetailButtonClick();
    }

    @Override
    public void onNewChannelDialogButtonClick() {
        channelPresenter.onNewChannelDialogButtonClick();
    }

    @Override
    public void onChannelDetailDialog() {
        channelPresenter.onChannelDetailDialog();
    }

    @Override
    public void onUpdateListButtonClick() {
        channelPresenter.onUpdateListButtonClick();
    }
}
