package com.igp.ksm.model.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.igp.ksm.BR;

/**
 * 店铺单个
 * Created by qiu on 2018/7/25.
 */

public class ItemStoreViewModel extends BaseObservable {

    public String  image_cover;
    public String  storeName;

    public boolean isFollow;

    public ItemStoreViewModel(String image_cover, String storeName, boolean isFollow) {
        this.image_cover = image_cover;
        this.storeName = storeName;
        this.isFollow = isFollow;
    }

    public String getImage_cover() {
        return image_cover;
    }

    public void setImage_cover(String image_cover) {
        this.image_cover = image_cover;
    }

    @Bindable
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        notifyPropertyChanged(BR.storeName);
        this.storeName = storeName;
    }
    @Bindable
    public boolean isFollow() {
        return isFollow;
    }

    public void setFollow(boolean follow) {
        notifyPropertyChanged(BR.follow);
        isFollow = follow;
    }

    public void follow(){
        setFollow(!isFollow);
    }
}
