package khs.study.youtubesynchronizer_android.activity.login.view;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.login.domain.User;
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
    Button mEnterChnBtn;

    @Override
    public void setActivity(Activity activity) {
        mActivity = activity;
        initView();
        Log.d(TAG, "setActivity: ");
    }

    void initView(){
        Log.d(TAG, "initView: ");
        mEnterChnBtn = (Button) mActivity.findViewById(R.id.loginBtn);
        mEnterChnBtn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                mPresenter.onLoginBtnClick();
                                            }
                                        }
                                    );
        mRecyclerView = (RecyclerView) mActivity.findViewById(R.id.recycler_view);

    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        mPresenter = presenter;
        Log.d(TAG, "setPresenter: ");
    }

    @Override
    public void showAccountList(List<User> userList) {
        mLoginAdapter = new LoginAdapter(userList);
        mRecyclerView.setAdapter(mLoginAdapter);
        Log.d(TAG, "showAccountList: ");
    }
}
