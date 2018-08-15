package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeProduct2BinderBinding;
import com.igp.ksm.model.bean.Product;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeProduct2Binder extends ItemViewBinder<Product,BaseViewHolder<ItemMultitypeProduct2BinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeProduct2BinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeProduct2BinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_product2_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeProduct2BinderBinding> holder, @NonNull Product item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
