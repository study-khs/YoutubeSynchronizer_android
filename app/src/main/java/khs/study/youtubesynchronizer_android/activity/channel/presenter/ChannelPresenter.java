package khs.study.youtubesynchronizer_android.activity.channel.presenter;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelService;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelPresenter {
    void attachView(ChannelView channelView);
    void detachView(ChannelView channelView);
    void setService(ChannelService channelService);

    // ------------------------------------- ViewCommander -------------------------------
    void goToChannelDetailActivity();

    void showNewChannelDialog();

    void showChannelDetailDialog();

    void updateList(List<Channel> channelList);

    // ------------------------------------- ViewListener -------------------------------

    void onGoToChannelDetailButtonClick();
    void onNewChannelDialogButtonClick();
    void onChannelDetailDialog();
    void onUpdateListButtonClick();

    // ------------------------------------- ModelCommander -------------------------------

    void loadChannelList();

    void newChannel(Channel channel);

    void updateChannel(Channel channel);

    void deleteChannel(Channel channel);

    // ------------------------------------- ModelListener -------------------------------

    void onLoadChannelListSuccess(List<Channel> channelList);

    void onNewChannelSuccess();

    void onUpdateChannelSuccess();

    void onDeleteChannelSuccess();
}
