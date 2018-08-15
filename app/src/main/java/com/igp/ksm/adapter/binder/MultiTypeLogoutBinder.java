package com.igp.ksm.adapter.binder;


import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeLogoutBinderBinding;
import com.igp.ksm.ui.me.viewmodel.LogoutViewModel;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeLogoutBinder extends ItemViewBinder<LogoutViewModel,BaseViewHolder<ItemMultitypeLogoutBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeLogoutBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeLogoutBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_logout_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeLogoutBinderBinding> holder, @NonNull LogoutViewModel item) {

        /*RelativeLayout.LayoutParams lp = (RelativeLayout.LayoutParams) holder.getBinding().stv.getLayoutParams();
        lp.setMargins(0, 20, 0, 0);
        holder.getBinding().stv.setLayoutParams(lp);*/
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
