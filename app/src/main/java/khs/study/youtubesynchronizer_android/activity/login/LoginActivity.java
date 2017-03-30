package khs.study.youtubesynchronizer_android.activity.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.ChannelActivity;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;
import khs.study.youtubesynchronizer_android.activity.login.presenter.LoginPresenter;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginView;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginViewImpl;

public class LoginActivity extends Activity implements LoginPresenter {
    private final String TAG = "JYP/"+getClass().getSimpleName();
    LoginView mLoginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setView(new LoginViewImpl());
        mLoginView.setActivity(this);
        mLoginView.setPresenter(this);

        // test showAccountList
        mLoginView.showAccountList(makeAccountSample()); // todo remove
    }

    void setView(LoginView loginView){
        Log.d(TAG, "setView: ");
        mLoginView = loginView;
    }

    // For test
    List<Account> makeAccountSample(){
        List<Account> accountList = new ArrayList<>();
        Account account1 = new Account("JYP1", "naver");
        accountList.add(account1);
        Account account2 = new Account("JYP2", "facebook");
        accountList.add(account2);
        Account account3 = new Account("JYP3", "kakao");
        accountList.add(account3);
        Account account4 = new Account("JYP1", "naver");
        accountList.add(account4);
        Account account5 = new Account("JYP2", "facebook");
        accountList.add(account5);
        Account account6 = new Account("JYP3", "kakao");
        accountList.add(account6);

        return accountList;
    }

    @Override
    public void onLoginBtnClick() {
        Log.d(TAG, "onLoginBtnClick: start ChannelActivity");
        startActivity(new Intent(this.getApplicationContext(), ChannelActivity.class));
    }
}
