package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeProductBinderBinding;
import com.igp.ksm.model.bean.Product;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeProductBinder extends ItemViewBinder<Product,BaseViewHolder<ItemMultitypeProductBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeProductBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeProductBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_product_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeProductBinderBinding> holder, @NonNull Product item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
