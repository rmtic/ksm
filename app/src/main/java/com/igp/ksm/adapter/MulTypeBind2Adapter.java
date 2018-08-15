package com.igp.ksm.adapter;

import com.igp.ksm.adapter.base.BaseBindingMulTypeAdapter;
import com.igp.ksm.adapter.base.BaseViewHolder;
import com.igp.ksm.databinding.ItemMultitypeCartProductBinderBinding;
import com.igp.ksm.ui.cart.viewmodel.ItemCartViewModel;

import java.util.List;

/**
 * Created by fcn-mq on 2017/5/26.
 * 多类型列表
 */

public class MulTypeBind2Adapter extends BaseBindingMulTypeAdapter<ItemCartViewModel, ItemMultitypeCartProductBinderBinding> {

    public MulTypeBind2Adapter(List<ItemCartViewModel> mDatas) {
        super(mDatas);
    }

    /**
     * 如果有特殊需求可以实现在该方法中
     * @param holder
     */
    @Override
    public void onCreateViewHolder(BaseViewHolder<ItemMultitypeCartProductBinderBinding> holder) {

    }

}
