package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeCartProductBinderBinding;
import com.igp.ksm.ui.cart.viewmodel.ItemCartViewModel;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeCartProductBinder extends ItemViewBinder<ItemCartViewModel,BaseViewHolder<ItemMultitypeCartProductBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeCartProductBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeCartProductBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_cart_product_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeCartProductBinderBinding> holder, @NonNull ItemCartViewModel item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
