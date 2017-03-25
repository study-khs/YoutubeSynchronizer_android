package khs.study.youtubesynchronizer_android.activity.login;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginView;
import khs.study.youtubesynchronizer_android.activity.login.view.LoginViewImpl;

public class LoginActivity extends Activity {
    private final String TAG = "JYP/"+getClass().getSimpleName();
    LoginView mLoginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setView(new LoginViewImpl());
        // test showAccountList
        mLoginView.showAccountList(makeAccountSample()); // todo remove
        Log.d(TAG, "onCreate: ");
    }

    void setView(LoginView loginView){
        mLoginView = loginView;
        mLoginView.setActivity(this);
        Log.d(TAG, "setView: ");
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
}
