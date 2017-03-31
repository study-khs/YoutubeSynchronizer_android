package khs.study.youtubesynchronizer_android.activity.login;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Base64;
import android.util.Log;

import com.facebook.CallbackManager;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import org.json.JSONObject;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.ChannelActivity;
import khs.study.youtubesynchronizer_android.activity.login.domain.User;
import khs.study.youtubesynchronizer_android.activity.login.model.LoginService;
import khs.study.youtubesynchronizer_android.activity.login.presenter.LoginPresenter;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginView;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginViewImpl;
import khs.study.youtubesynchronizer_android.activity.utils.AppController;

public class LoginActivity extends Activity implements LoginPresenter {
    private final String TAG = "JYP/"+getClass().getSimpleName();
    LoginService mService;

    LoginView mLoginView;
    LoginButton mFacebookLoginBtn;

    private SharedPreferences.Editor editor;
    private CallbackManager callbackManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setView(new LoginViewImpl());
        mLoginView.setActivity(this);
        mLoginView.setPresenter(this);

        FacebookSdk.sdkInitialize(getApplicationContext());
        initFacebookLogin();

        if(AppController.isLogin()){ // todo login -> 묻지않고 로그인이아니라, 클릭하면 자동로그인으로 변경
            goToChannelActivity();
        }

        // mLoginView.showAccountList(makeAccountSample()); // todo remove
    }

    void setView(LoginView loginView){
        Log.d(TAG, "setView: ");
        mLoginView = loginView;
    }

    // For test
    List<User> makeAccountSample(){
        List<User> userList = new ArrayList<>();
        User user1 = new User("JYP1", "naver");
        userList.add(user1);
        User user2 = new User("JYP2", "facebook");
        userList.add(user2);
        User user3 = new User("JYP3", "kakao");
        userList.add(user3);
        User user4 = new User("JYP1", "naver");
        userList.add(user4);
        User user5 = new User("JYP2", "facebook");
        userList.add(user5);
        User user6 = new User("JYP3", "kakao");
        userList.add(user6);

        return userList;
    }

    @Override
    public void onLoginBtnClick() {
        Log.d(TAG, "onLoginBtnClick: start ChannelActivity");
        goToChannelActivity();
    }

    private void goToChannelActivity()
    {
        startActivity(new Intent(this.getApplicationContext(), ChannelActivity.class));
    }

    void initFacebookLogin() {
        Log.d(TAG, "initFacebookLogin: ");

        mFacebookLoginBtn = (LoginButton) findViewById(R.id.facebookLoginBtn);
        mFacebookLoginBtn.setReadPermissions(Arrays.asList("public_profile, email"));
        callbackManager = CallbackManager.Factory.create();
        mFacebookLoginBtn.registerCallback(callbackManager, callback);
        mFacebookLoginBtn.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
    }

    private FacebookCallback<LoginResult> callback = new FacebookCallback<LoginResult>() {
        @Override
        public void onSuccess(LoginResult loginResult) {
            Log.d(TAG, "onSuccess: ");
            GraphRequest request = GraphRequest.newMeRequest(
                    loginResult.getAccessToken(),
                    new GraphRequest.GraphJSONObjectCallback() {
                        @Override
                        public void onCompleted(JSONObject object, GraphResponse response) {
                            String facebookId = null, facebookName = null;
                            try {
                                facebookId = object.getString("id");
                                facebookName = object.getString("name");
                            }catch (Exception e){}

                            Log.d(TAG, "onCompleted: "+" Id:"+facebookId+" Name:"+facebookName);
                            onFacebookLoginSuccess(facebookId, facebookName);
                        }
                    });
            Bundle parameters = new Bundle();
            parameters.putString("fields", "id,name");
            request.setParameters(parameters);
            Log.d(TAG, "onSuccess: request.executeAsync");
            request.executeAsync();
        }

        @Override
        public void onCancel() {
            Log.d(TAG, "onCancel: User Cancel");
        }

        @Override
        public void onError(FacebookException error) {
            Log.d(TAG, "onError: Error");
            error.printStackTrace();
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    public void onFacebookLoginSuccess(String id, String name) {
        // mService.login(id, name, 'facebook');

        editor = getSharedPreferences(AppController.PREF_NAME, MODE_PRIVATE).edit();

        Log.d(TAG, "onFacebookLoginSuccess: Save on AppController");
        AppController.USER_ID = id;
        AppController.USER_TYPE = "facebook";
        AppController.USER_TOKEN = "ABC";
        AppController.USER_NAME = name;

        Log.d(TAG, "onFacebookLoginSuccess: Save on SharedPreferences");
        editor.putString("user_id", AppController.USER_ID);
        editor.putString("user_type", AppController.USER_TYPE);
        editor.putString("user_token", AppController.USER_TOKEN);
        editor.putString("user_name", AppController.USER_NAME);
        editor.commit();


        Log.d(TAG, "onFacebookLoginSuccess: Go to ChannelActivity");
        goToChannelActivity();
    }
}
