package khs.study.youtubesynchronizer_android.activity.login.view;

import java.util.List;

import khs.study.youtubesynchronizer_android.activity.common.view.BaseView;
import khs.study.youtubesynchronizer_android.activity.login.domain.User;
import khs.study.youtubesynchronizer_android.activity.login.presenter.LoginPresenter;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public interface LoginView extends BaseView<LoginPresenter> {
    void showAccountList(List<User> userList);

    interface onClickListener {
        void onLoginBtnClick();
    }
}
