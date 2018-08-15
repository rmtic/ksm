package com.igp.ksm.adapter.binder;

import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.igp.ksm.R;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeSectionStoreBinderBinding;
import com.igp.ksm.model.viewmodel.SectionStoreViewModel;

import me.drakeet.multitype.ItemViewBinder;


/**
 * Created by qiu on 2018/7/24.
 */
public class MultiTypeSectionStoreBinder extends ItemViewBinder<SectionStoreViewModel,BaseViewHolder<ItemMultitypeSectionStoreBinderBinding>> {

    @NonNull
    @Override
    protected BaseViewHolder<ItemMultitypeSectionStoreBinderBinding> onCreateViewHolder(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        ItemMultitypeSectionStoreBinderBinding binding = DataBindingUtil.inflate(inflater,R.layout.item_multitype_section_store_binder, parent, false);
        return new BaseViewHolder(binding);
    }

    @Override
    protected void onBindViewHolder(@NonNull BaseViewHolder<ItemMultitypeSectionStoreBinderBinding> holder, @NonNull SectionStoreViewModel item) {
        holder.getBinding().setData(item);
        holder.getBinding().executePendingBindings();
    }
}
