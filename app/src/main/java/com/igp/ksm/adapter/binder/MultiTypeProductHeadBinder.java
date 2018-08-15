package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeProductHeadBinderBinding;
import com.igp.ksm.databinding.ItemMultitypeProductHeadBinderBinding;
import com.igp.ksm.model.viewmodel.BannerViewModel;
import com.igp.ksm.ui.product.productdetail.viewmodel.ProductHead;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeProductHeadBinder extends ItemViewBinder<ProductHead,BaseViewHolder<ItemMultitypeProductHeadBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeProductHeadBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeProductHeadBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_product_head_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeProductHeadBinderBinding> holder, @NonNull ProductHead item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
