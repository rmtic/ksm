package com.igp.ksm.model.viewmodel;

import java.util.List;

/**
 * Created by qiu on 2018/7/25.
 */

public class SectionStoreViewModel {

    private String sectionTitle;
    private List<ItemStoreViewModel> storeViewModelList;


    public SectionStoreViewModel(String sectionTitle, List<ItemStoreViewModel> storeViewModelList) {
        this.sectionTitle = sectionTitle;
        this.storeViewModelList = storeViewModelList;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public List<ItemStoreViewModel> getStoreViewModelList() {
        return storeViewModelList;
    }

    public void setStoreViewModelList(List<ItemStoreViewModel> storeViewModelList) {
        this.storeViewModelList = storeViewModelList;
    }
}
