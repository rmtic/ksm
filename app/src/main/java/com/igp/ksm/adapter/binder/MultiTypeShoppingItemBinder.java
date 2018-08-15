package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeShoppingitemBinderBinding;
import com.igp.ksm.ui.shopping.viewmodel.ShoppingItemViewModel;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeShoppingItemBinder extends ItemViewBinder<ShoppingItemViewModel,BaseViewHolder<ItemMultitypeShoppingitemBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeShoppingitemBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeShoppingitemBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_shoppingitem_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeShoppingitemBinderBinding> holder, @NonNull ShoppingItemViewModel item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
