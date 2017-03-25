package khs.study.youtubesynchronizer_android.activity.login.view;

import android.app.Activity;
import android.content.Context;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.common.view.BaseView;
import khs.study.youtubesynchronizer_android.activity.login.LoginActivity;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;
import khs.study.youtubesynchronizer_android.activity.login.presenter.LoginPresenter;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public class LoginViewImpl implements LoginView, BaseView<LoginPresenter> {
    LoginPresenter mPresenter;
    Activity mActivity;

    @Override
    public void setActivity(Activity activity) {
        mActivity = activity;
        initView();
    }

    void initView(){
        // mActivity.findViewById();
    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void showAccountList(List<Account> accountList) {

    }
}
