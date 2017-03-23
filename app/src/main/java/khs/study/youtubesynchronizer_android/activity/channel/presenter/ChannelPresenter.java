package khs.study.youtubesynchronizer_android.activity.channel.presenter;

import khs.study.youtubesynchronizer_android.activity.channel.model.ChannelModel;
import khs.study.youtubesynchronizer_android.activity.channel.view.ChannelView;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelPresenter {
    void attachView(ChannelView channelView);
    void detachView(ChannelView channelView);
    void setModel(ChannelModel channelModel);
    void fromViewListener();

    void goToChannelDetailActivity();
    void showNewChannelDialog();
    void showChannelDetailDialog();
    void reDrawView();

    void loadChannelPageDto();
    void postChannel();
    void putChannel();
    void deleteChannel();
}
