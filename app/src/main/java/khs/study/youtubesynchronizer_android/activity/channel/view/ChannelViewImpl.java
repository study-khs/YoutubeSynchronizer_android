package khs.study.youtubesynchronizer_android.activity.channel.view;

import android.app.Activity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.channel.domain.Channel;
import khs.study.youtubesynchronizer_android.activity.channel.presenter.ChannelPresenter;

/**
 * Created by jaeyoung on 2017. 3. 24..
 */

public class ChannelViewImpl implements ChannelView {
    ChannelPresenter channelPresenter;
    Activity mActivity;

    ToggleButton mBtnGoToChannelDetailActivity;

    //todo singleton

    @Override
    public void setActivity(Activity activity) {
        mActivity = activity;
        Log.d("JYP/ChannelView", "SetActivity");

        mBtnGoToChannelDetailActivity = (ToggleButton) mActivity.findViewById(R.id.toggleButton);
        mBtnGoToChannelDetailActivity.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(mActivity, "토글 "+isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        Log.d("JYP/ChannelView", "SetOnClickListener");
    }


    @Override
    public void setPresenter(ChannelPresenter channelPresenter) {
        this.channelPresenter = channelPresenter;
        setActivity((Activity)channelPresenter);
    }
    // ------------------------------------- PresenterListener -------------------------------

    @Override
    public void goToChannelDetailActivity() {

    }

    @Override
    public void showNewChannelDialog() {

    }

    @Override
    public void showChannelDetailDialog() {

    }

    @Override
    public void updateList(List<Channel> channelList) {
        //todo
    }

    // ------------------------------------- PresenterCommander -------------------------------


    @Override
    public void onGoToChannelDetailButtonClick() {
        channelPresenter.onGoToChannelDetailButtonClick();
    }

    @Override
    public void onNewChannelDialogButtonClick() {
        channelPresenter.onNewChannelDialogButtonClick();
    }

    @Override
    public void onChannelDetailDialog() {
        channelPresenter.onChannelDetailDialog();
    }

    @Override
    public void onUpdateListButtonClick() {
        channelPresenter.onUpdateListButtonClick();
    }
}
