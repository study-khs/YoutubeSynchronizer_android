package khs.study.youtubesynchronizer_android.activity.login.view;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.login.domain.Account;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public interface LoginView {
    void showAccountList(List<Account> accountList);
}
