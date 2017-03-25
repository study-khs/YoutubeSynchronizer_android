package khs.study.youtubesynchronizer_android.activity.login;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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

        return accountList;
    }
}
