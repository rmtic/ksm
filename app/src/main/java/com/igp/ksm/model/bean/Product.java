package com.igp.ksm.model.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.igp.ksm.BR;

import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by qiu on 2018/7/24.
 */

public class Product extends BaseObservable {

    public String name;
    public String price;
    public String image_cover;

    public Product(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, String price, String image_cover) {
        this.name = name;
        this.price = price;
        this.image_cover = image_cover;
    }

    public String getImage_cover() {
        return image_cover;
    }

    public void setImage_cover(String image_cover) {
        this.image_cover = image_cover;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        notifyPropertyChanged(BR.name);
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void cc(){
        //调整到商品明细
        ARouter.getInstance().build("/test/activity").navigation();
    }
}
