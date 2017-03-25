package khs.study.youtubesynchronizer_android.activity.channel.model;

import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.domain.ChannelPageDto;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public interface ChannelDao {
    @GET("api/message/{message_id}")
    Call<Channel> getChannel(@Path("message_id") String id);

    @GET("api/message")
    Call<ChannelPageDto<Channel>> getMessageList();

    @POST("api/message")
    Call<Channel> postChannel(@Body Channel channel);

    @PUT("api/message")
    Call<Channel> putChannel(@Body Channel channel);

    @DELETE("api/message/{message_id}")
    Call<Void> deleteChannel(@Path("message_id") String id);
}