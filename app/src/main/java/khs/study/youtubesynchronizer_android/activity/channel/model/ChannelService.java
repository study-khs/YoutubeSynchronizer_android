package khs.study.youtubesynchronizer_android.activity.channel.model;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelService extends ChannelModel {
    @Override
    void getChannel();

    @Override
    void getChannelPageDto();

    @Override
    void postChannel();

    @Override
    void putChannel();

    @Override
    void deleteChannel();
}
