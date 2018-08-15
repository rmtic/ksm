package com.igp.ksm.model.bean;

import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by qiu on 2018/7/25.
 */

public class Menu {

    public String  name;
    public boolean isHasMore;

    public Menu(String name, boolean isHasMore) {
        this.name = name;
        this.isHasMore = isHasMore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasMore() {
        return isHasMore;
    }

    public void setHasMore(boolean hasMore) {
        isHasMore = hasMore;
    }

    public void click(){
        ToastUtils.showLong(""+name);
    }
}
