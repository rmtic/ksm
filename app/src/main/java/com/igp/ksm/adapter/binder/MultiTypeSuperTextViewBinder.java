package com.igp.ksm.adapter.binder;


import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeSupertextviewBinding;
import com.igp.ksm.model.bean.Menu;

import me.drakeet.multitype.ItemViewBinder;

/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeSuperTextViewBinder extends ItemViewBinder<Menu,BaseViewHolder<ItemMultitypeSupertextviewBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeSupertextviewBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeSupertextviewBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_supertextview, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeSupertextviewBinding> holder, @NonNull Menu item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
