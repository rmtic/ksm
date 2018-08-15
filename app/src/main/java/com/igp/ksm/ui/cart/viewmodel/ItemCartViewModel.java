package com.igp.ksm.ui.cart.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.igp.ksm.BR;
import com.igp.ksm.R;
import com.igp.ksm.adapter.base.IMulTypeBindingBean;
import com.igp.ksm.model.bean.Product;

/**
 * Created by qiu on 2018/7/26.
 */

public class ItemCartViewModel extends BaseObservable implements IMulTypeBindingBean {

    private Product product;
    private boolean isChecked;


    public ItemCartViewModel(Product product, boolean isChecked) {
        this.product = product;
        this.isChecked = isChecked;
    }

    @Bindable
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        notifyPropertyChanged(BR.product);
        this.product = product;
    }

    @Bindable
    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        notifyPropertyChanged(BR.checked);
        isChecked = checked;
    }


    @Override
    public int getLayoutResouse() {
        return R.layout.item_multitype_cart_product_binder;
    }
}
