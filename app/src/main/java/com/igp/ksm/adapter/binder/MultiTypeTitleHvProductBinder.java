package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeTitlehvproductBinderBinding;
import com.igp.ksm.model.bean.TitleHvProduct;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeTitleHvProductBinder extends ItemViewBinder<TitleHvProduct,BaseViewHolder<ItemMultitypeTitlehvproductBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeTitlehvproductBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeTitlehvproductBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_titlehvproduct_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeTitlehvproductBinderBinding> holder, @NonNull TitleHvProduct item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
