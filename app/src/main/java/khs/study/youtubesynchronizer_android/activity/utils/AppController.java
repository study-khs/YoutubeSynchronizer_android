package khs.study.youtubesynchronizer_android.activity.utils;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;

import khs.study.youtubesynchronizer_android.activity.consts.URL;
import khs.study.youtubesynchronizer_android.activity.login.domain.User;
import retrofit2.Retrofit;

/**
 * Created by jaeyoung on 2017. 3. 30..
 */

public class AppController extends Application {
    private final String TAG = "JYP/"+getClass().getSimpleName();
    public final static String PREF_NAME = "PrefYoutubeSynchronizer";

    public static String USER_ID = null;
    public static String USER_TYPE = null;
    public static String USER_NAME = null;
    public static String USER_TOKEN = null;

    @Override
    public void onCreate() {
        super.onCreate();

        if (USER_ID == null) {
            Log.d(TAG, "onCreate: getSharedPreferences");
            setUserId(getSharedPreferences(PREF_NAME, MODE_PRIVATE).getString("user_id", null));
            setUserType(getSharedPreferences(PREF_NAME, MODE_PRIVATE).getString("user_type", null));
            setUserName(USER_NAME = getSharedPreferences(PREF_NAME, MODE_PRIVATE).getString("user_name", null));
            setUserToken(USER_TOKEN = getSharedPreferences(PREF_NAME, MODE_PRIVATE).getString("user_token", null));
        }
    }

    public static boolean isLogin() {
        return (USER_ID != null);
    }

    public static String getUserId() {
        return USER_ID;
    }

    public static void setUserId(String userId) {
        USER_ID = userId;
    }

    public static String getUserType() {
        return USER_TYPE;
    }

    public static void setUserType(String userType) {
        USER_TYPE = userType;
    }

    public static String getUserName() {
        return USER_NAME;
    }

    public static void setUserName(String userName) {
        USER_NAME = userName;
    }

    public static String getUserToken() {
        return USER_TOKEN;
    }

    public static void setUserToken(String userToken) {
        USER_TOKEN = userToken;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
