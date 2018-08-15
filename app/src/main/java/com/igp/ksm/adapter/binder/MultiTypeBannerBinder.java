package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeBannerBinderBinding;
import com.igp.ksm.model.viewmodel.BannerViewModel;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeBannerBinder extends ItemViewBinder<BannerViewModel,BaseViewHolder<ItemMultitypeBannerBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeBannerBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeBannerBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_banner_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeBannerBinderBinding> holder, @NonNull BannerViewModel item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
