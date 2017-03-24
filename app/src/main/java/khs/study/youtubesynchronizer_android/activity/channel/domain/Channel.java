package khs.study.youtubesynchronizer_android.activity.channel.domain;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class Channel implements Serializable {
    @SerializedName("id")
    private String id;
    @SerializedName("message")
    private String message;

    public Channel(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
