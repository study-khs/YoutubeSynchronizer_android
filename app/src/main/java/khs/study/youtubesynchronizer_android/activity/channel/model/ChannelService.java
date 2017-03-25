package khs.study.youtubesynchronizer_android.activity.channel.model;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelService {
    void setPresenter(ChannelPresenter channelPresenter);

    // ------------------------------------- PresenterListener -------------------------------

    void loadChannelList();

    void newChannel(Channel channel);

    void updateChannel(Channel channel);

    void deleteChannel(Channel channel);


    // ------------------------------------- PresenterCommander -------------------------------

    void onLoadChannelListSuccess(List<Channel> channelList);

    void onNewChannelSuccess();

    void onUpdateChannelSuccess();

    void onDeleteChannelSuccess();
}