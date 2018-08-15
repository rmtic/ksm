package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeStringBinderBinding;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeStringBinder extends ItemViewBinder<String,BaseViewHolder<ItemMultitypeStringBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeStringBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeStringBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_string_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeStringBinderBinding> holder, @NonNull String item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
