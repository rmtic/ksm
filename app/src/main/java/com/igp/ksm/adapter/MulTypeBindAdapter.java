package com.igp.ksm.adapter;

import com.igp.ksm.adapter.base.BaseBindingMulTypeAdapter;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeShoppingitemBinderBinding;
import com.igp.ksm.ui.shopping.viewmodel.ShoppingItemViewModel;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 * 多类型列表
 */

public class MulTypeBindAdapter extends BaseBindingMulTypeAdapter<ShoppingItemViewModel, ItemMultitypeShoppingitemBinderBinding> {

    public MulTypeBindAdapter(List<ShoppingItemViewModel> mDatas) {
        super(mDatas);
    }

    /**
     * 如果有特殊需求可以实现在该方法中
     * @param holder
     */
    @Override
    public void onCreateViewHolder(BaseViewHolder<ItemMultitypeShoppingitemBinderBinding> holder) {

    }

}
