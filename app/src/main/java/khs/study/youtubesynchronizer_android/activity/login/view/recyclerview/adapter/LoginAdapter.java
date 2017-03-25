package khs.study.youtubesynchronizer_android.activity.login.view.recyclerview.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import khs.study.youtubesynchronizer_android.R;
import khs.study.youtubesynchronizer_android.activity.login.domain.Account;
import khs.study.youtubesynchronizer_android.activity.login.view.recyclerview.LoginViewHolder;

/**
 * Created by jaeyoung on 2017. 3. 25..
 */

public class LoginAdapter extends RecyclerView.Adapter<LoginViewHolder> {
    List<Account> mAccountList;

    public LoginAdapter(List<Account> accountList) {
        mAccountList = accountList;
    }

    @Override
    public LoginViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_account, parent, false);

        return new LoginViewHolder(v);
    }

    @Override
    public void onBindViewHolder(LoginViewHolder holder, int position) {
        Account account = mAccountList.get(position);
        holder.tvId.setText(account.getId());
        holder.tvType.setText(account.getType());
    }

    @Override
    public int getItemCount() {
        return mAccountList.size();
    }
}
