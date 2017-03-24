package khs.study.youtubesynchronizer_android.activity.channel.presenter;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
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

    List<Channel> loadChannels();
    void postChannel();
    void putChannel();
    void deleteChannel();

    void onLoadItemsSuccess(List<Channel> channelList);
    void onAddItemSuccess();
    void onUpdateItemSuccess();
    void onDelItemSuccess();
}
