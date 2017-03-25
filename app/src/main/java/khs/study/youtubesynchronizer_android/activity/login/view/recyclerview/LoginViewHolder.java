package khs.study.youtubesynchronizer_android.activity.login.view.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import khs.study.youtubesynchronizer_android.R;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public class LoginViewHolder extends RecyclerView.ViewHolder {
    public final View mView;
    public final TextView tvId;
    public final TextView tvType;

    public LoginViewHolder(View v) {
        super(v);
        this.mView = v;

        this.tvId = (TextView)v.findViewById(R.id.tvId);
        this.tvType = (TextView)v.findViewById(R.id.tvType);

    }
}
