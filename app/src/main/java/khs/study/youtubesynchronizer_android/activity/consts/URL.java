package khs.study.youtubesynchronizer_android.activity.consts;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class URL {
    final String url = "http://13.124.12.120:8081/";

    private static final URL ourInstance = new URL();

    static URL getInstance() {
        return ourInstance;
    }

    public String getUrl() {
        return url;
    }

}
