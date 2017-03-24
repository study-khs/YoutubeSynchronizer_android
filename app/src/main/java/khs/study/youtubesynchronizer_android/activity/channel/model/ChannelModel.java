package khs.study.youtubesynchronizer_android.activity.channel.model;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelModel {
    List<Channel> loadItems();
    void addItem(Channel channel);
    void updateItem(Channel channel);
    void delItem(Channel channel);
}