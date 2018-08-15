package com.igp.ksm.model.viewmodel;

import java.util.List;

/**
 * Created by qiu on 2018/7/25.
 */

public class BannerViewModel {
    public List<String> urls;

    public BannerViewModel(List<String> urls) {
        this.urls = urls;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
