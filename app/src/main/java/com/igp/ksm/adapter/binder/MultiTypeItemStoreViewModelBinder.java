package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeStoreBinderBinding;
import com.igp.ksm.model.viewmodel.ItemStoreViewModel;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeItemStoreViewModelBinder extends ItemViewBinder<ItemStoreViewModel,BaseViewHolder<ItemMultitypeStoreBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeStoreBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeStoreBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_store_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeStoreBinderBinding> holder, @NonNull ItemStoreViewModel item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
