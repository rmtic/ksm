package com.igp.ksm.model.bean;
import java.util.List;

/**
 * Created by qiu on 2018/7/25.
 */

public class TitleHvProduct {
    private String sectionTitle;
    private List<Product> productList;

    public TitleHvProduct(String sectionTitle, List<Product> productList) {
        this.sectionTitle = sectionTitle;
        this.productList = productList;
    }

    public String getSectionTitle() {
        return sectionTitle;
    }

    public void setSectionTitle(String sectionTitle) {
        this.sectionTitle = sectionTitle;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
