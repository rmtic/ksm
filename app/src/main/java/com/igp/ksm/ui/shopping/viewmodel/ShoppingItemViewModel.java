package com.igp.ksm.ui.shopping.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.igp.ksm.BR;
import com.igp.ksm.R;
import com.igp.ksm.adapter.base.IMulTypeBindingBean;

/**
 * Created by qiu on 2018/7/25.
 */

public class ShoppingItemViewModel extends BaseObservable implements IMulTypeBindingBean {
    private int image_cover;

    public ShoppingItemViewModel(int image_cover) {
        this.image_cover = image_cover;
    }

    @Bindable
    public int getImage_cover() {
        return image_cover;
    }

    public void setImage_cover(int image_cover) {
        notifyPropertyChanged(BR.image_cover);
        this.image_cover = image_cover;
    }

    @Override
    public int getLayoutResouse() {
        return R.layout.item_multitype_shoppingitem_binder;
    }

    public void click(){
        setImage_cover(R.drawable.shop_58_zh_tw_new);
    }
}
