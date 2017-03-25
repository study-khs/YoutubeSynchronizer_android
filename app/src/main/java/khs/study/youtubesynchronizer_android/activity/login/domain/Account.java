package khs.study.youtubesynchronizer_android.activity.login.domain;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public class Account {
    String id;
    String type;

    public Account(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
