package com.igp.ksm.ui.me.viewmodel;

import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by qiu on 2018/7/25.
 */

public class LogoutViewModel {

    public String  name;


    public LogoutViewModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void logout(){
        ToastUtils.showLong("执行退出登录"+name);
    }

}
