package khs.study.youtubesynchronizer_android.activity.login.view;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;
import khs.study.youtubesynchronizer_android.activity.login.presenter.LoginPresenter;
import khs.study.youtubesynchronizer_android.activity.login.view.recyclerview.adapter.LoginAdapter;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public class LoginViewImpl implements LoginView {
    private final String TAG = "JYP/"+getClass().getSimpleName();

    LoginPresenter mPresenter;
    Activity mActivity;

    RecyclerView mRecyclerView;
    LoginAdapter mLoginAdapter;

    @Override
    public void setActivity(Activity activity) {
        mActivity = activity;
        initView();
        Log.d(TAG, "setActivity: ");
    }

    void initView(){
        mRecyclerView = (RecyclerView) mActivity.findViewById(R.id.recycler_view);
        Log.d(TAG, "initView: ");
    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        mPresenter = presenter;
        Log.d(TAG, "setPresenter: ");
    }

    @Override
    public void showAccountList(List<Account> accountList) {
        mLoginAdapter = new LoginAdapter(accountList);
        mRecyclerView.setAdapter(mLoginAdapter);
        Log.d(TAG, "showAccountList: ");
    }
}
