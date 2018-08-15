package com.igp.ksm.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.igp.ksm.MainActivity;
import com.igp.ksm.R;
import com.igp.ksm.adapter.binder.MultiTypeBannerBinder;
import com.igp.ksm.adapter.binder.MultiTypeProductBinder;
import com.igp.ksm.adapter.binder.MultiTypeSectionStoreBinder;
import com.igp.ksm.adapter.binder.MultiTypeStringBinder;
import com.igp.ksm.adapter.binder.MultiTypeSuperTextViewBinder;
import com.igp.ksm.adapter.binder.MultiTypeTitleHvProductBinder;
import com.igp.ksm.databinding.ActivityHomeBinding;
import com.igp.ksm.model.bean.Menu;
import com.igp.ksm.model.bean.Product;
import com.igp.ksm.model.bean.TitleHvProduct;
import com.igp.ksm.model.viewmodel.BannerViewModel;
import com.igp.ksm.model.viewmodel.ItemStoreViewModel;
import com.igp.ksm.model.viewmodel.SectionStoreViewModel;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by qiu on 2018/7/25.
 */

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding activityHomeBinding;
    private boolean sIsScrolling = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);

        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(String.class, new MultiTypeStringBinder());
        adapter.register(Product.class,new MultiTypeProductBinder());
        adapter.register(Menu.class,new MultiTypeSuperTextViewBinder());
        adapter.register(TitleHvProduct.class,new MultiTypeTitleHvProductBinder());
        adapter.register(BannerViewModel.class,new MultiTypeBannerBinder());
        adapter.register(SectionStoreViewModel.class,new MultiTypeSectionStoreBinder());

        RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        activityHomeBinding.recyclerView.setRecycledViewPool(viewPool);
        viewPool.setMaxRecycledViews(0, 100);

        activityHomeBinding.recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (newState == RecyclerView.SCROLL_STATE_DRAGGING || newState == RecyclerView.SCROLL_STATE_SETTLING) {
                    sIsScrolling = true;
                    Glide.with(HomeActivity.this).pauseRequests();
                } else if (newState == RecyclerView.SCROLL_STATE_IDLE) {
                    if (sIsScrolling == true) {
                        Glide.with(HomeActivity.this).resumeRequests();
                    }
                    sIsScrolling = false;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
        activityHomeBinding.recyclerView.setAdapter(adapter);
        activityHomeBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        Items items = new Items();


        List<String> images2 = new ArrayList<>();
        images2.add("http://img.hb.aicdn.com/44411d8a84da7458817f432b8741cd10ad980235b127a-qnFZq9_fw658");
        images2.add("http://img.hb.aicdn.com/c7d84131d82266e21c96fdcccf102c8402383d8516186-3aXubR_fw658");
        images2.add("http://img.hb.aicdn.com/c9f19a004f87e8b462ba9cea794b8f8e82b876c5d7d1-dttLvR_fw658");
        images2.add("http://img.hb.aicdn.com/a99c36f07e591205bc60ef11c081766ae45f0a7f14eb2-DnjEIb_fw658");
        items.add(new BannerViewModel(images2));

        //添加Make Your Own
        List<Product> products = new ArrayList<>();
        products.add(new Product("Teddy Bear Stuffed Animal","价格","https://kusdom.com/image/cache/catalog/201701/CA3125_3053-250x250.png"));
        products.add(new Product("Beach Towel 58\"x28\"","价格","https://kusdom.com/image/cache/catalog/HS3145%20COVER-250x250.png"));
        products.add(new Product("iPhone X TPU Dual Layer Bump","价格","https://kusdom.com/image/cache/catalog/201612/HS3113-black-02_5552-250x250.jpg"));
        products.add(new Product("Leaf Shaped Luggage Tag","价格","https://kusdom.com/image/cache/catalog/201703/31-01_5705-250x250.png"));
        products.add(new Product("Framed Puzzle (120 Pieces)","价格","https://kusdom.com/image/cache/catalog/201612/-01_8366-250x250.png"));
        products.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/catalog/201712/HS3103_4916-250x250.png"));
        products.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/catalog/201701/CA3125_3053-250x250.png"));
        products.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/catalog/201703/EN2403-160901-catalog_2733-250x250.jpg"));
        products.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/catalog/201711/newnewnew_9530-250x250.png"));
        TitleHvProduct titleHvProduct = new TitleHvProduct("Make Your Own",products);
        items.add(titleHvProduct);

        //添加Custom Text
        List<Product> CustomTextProducts = new ArrayList<>();
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/03/design-front-preview-0-0-15254063921264542603-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/15/design-front-preview-0-0-15263706511449609841-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/07/design-front-preview-0-0-1525688009990474049-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/03/design-front-preview-0-0-1525403822971115247-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/06/design-front-preview-0-0-15256656631248345713-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/15/design-front-preview-0-0-152637099869105877-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/15/design-front-preview-0-0-1526371302156385289-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/03/design-front-preview-0-0-15254047871719469570-250x250.png"));
        CustomTextProducts.add(new Product("20oz Stainless Steel Tumbler","价格","https://kusdom.com/image/cache/uploaded/2018/05/08/design-front-preview-0-0-1525767264743362975-250x250.png"));
        TitleHvProduct titleHvProduct2 = new TitleHvProduct("Custom Text",CustomTextProducts);
        items.add(titleHvProduct2);

        //添加店铺
        List<ItemStoreViewModel> itemStoreViewModelList = new ArrayList<>();
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201707/1500341627kshop-logo_3847-180x180.png","店铺1",true));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201707/1500662433kshop-logo_8597-180x180.png","店铺2",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201806/1528113497-logo-180x180.png"          ,"店铺3",true));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        itemStoreViewModelList.add(new ItemStoreViewModel("https://kusdom.com/image/cache/uploaded/kshop/logo/201709/1505752761kshop-logo_2450-180x180.png","店铺4",false));
        SectionStoreViewModel sectionStoreViewModel = new SectionStoreViewModel("推荐店铺",itemStoreViewModelList);
        items.add(sectionStoreViewModel);

        /*
        List<String> images = new ArrayList<>();
        images.add("https://kusdom.com/image/catalog/revslider_media_folder/d02s.png");
        images.add("http://img.hb.aicdn.com/722bb794da7662cd89fc2981a39c80559c9feb655e3dd7-8B7iFF_fw658");
        images.add("http://img.hb.aicdn.com/0c6dcf8216222c6bef64a31c26ada1c56dce1a40a08443-eBVv3k_fw658");
        images.add("http://img.hb.aicdn.com/f7539fda778bef117ace4cde7e4638eae598675b3e0d4b-7UhB9e_fw658");
        //广告
        BannerViewModel bannerViewModel = new BannerViewModel(images);
        items.add(bannerViewModel);

        items.add(new String("美食"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/7396bc5d73dd0194d45eabfa821d7a7427304de0c7888-cUUuGO_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/eb9935011e086ca0da6629386140f52b04bfb800909eb-V3E970_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/570d9d679df4482f859e1df00bafb2ae739b57d413ad03-aPdShr_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/742bd8a6d0b5bb57ffa0be4b3cbb14e79483ca7b6cdbe-ZLRRpj_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/a0bc25bbd4ac73ee5194641e79222f00c85d9b89cc35-stC6l6_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/b8254fe0c692997e987243dcccb401a998158fc577331-TY1jAc_fw658"));
        items.add(new Product("20oz Stainless Steel Tumbler","价格","http://img.hb.aicdn.com/4f9059b7a6ccf5010806cbe59ce3fec2e96f2c8031bc8-eqToFO_fw658"));
        for (int i = 0; i < 5; i++) {
            items.add(new String("Songs"));
            for (int i1 = 0; i1 < 3; i1++) {
                items.add(new Product("20oz Stainless Steel Tumbler","价格"+i,"http://img.hb.aicdn.com/d489cc3ffad3819108391e1bbc6bdd85baad570d2ce8b-jzOyJ8_fw658"));
            }
        }*/
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }


}
