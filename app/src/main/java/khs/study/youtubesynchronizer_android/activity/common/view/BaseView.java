package khs.study.youtubesynchronizer_android.activity.common.view;

import android.app.Activity;
import android.content.Context;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public interface BaseView<T> {
    void setPresenter(T presenter);
    void setActivity(Activity activity);
}
