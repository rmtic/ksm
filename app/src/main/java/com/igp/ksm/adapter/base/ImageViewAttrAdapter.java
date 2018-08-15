package com.igp.ksm.adapter.base;

import android.databinding.BindingAdapter;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.allen.library.SuperTextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.igp.ksm.GlideImageLoader;
import com.igp.ksm.R;
import com.igp.ksm.adapter.binder.MultiTypeItemStoreViewModelBinder;
import com.igp.ksm.adapter.binder.MultiTypeProduct2Binder;
import com.igp.ksm.model.bean.Product;
import com.igp.ksm.model.viewmodel.ItemStoreViewModel;
import com.youth.banner.Banner;
import com.youth.banner.Transformer;

import java.util.List;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by qiu on 2018/7/23.
 */

public class ImageViewAttrAdapter {

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, Bitmap bitmap) {
        view.setImageBitmap(bitmap);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, int resId) {
        view.setImageResource(resId);
    }

    @BindingAdapter("android:src")
    public static void setSrc(ImageView view, String url) {

        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.mipmap.ic_launcher)
                      .override(400,400)
                      .diskCacheStrategy(DiskCacheStrategy.ALL);
        Glide.with(view.getContext())
             .load(url)
             .apply(requestOptions)
             .into(view);
    }

    @BindingAdapter("sLeftTextString")
    public static void sLeftTextString(SuperTextView superTextView, String text) {
        superTextView.setLeftString(text);
    }
    @BindingAdapter("sCenterTextString")
    public static void sCenterTextString(SuperTextView superTextView, String text) {
        superTextView.setCenterString(text);
    }
    @BindingAdapter("sRightTvDrawableRight")
    public static void sRightTvDrawableRight(SuperTextView superTextView, int resId) {
        Drawable drawable = superTextView.getContext().getResources().getDrawable(resId);
        superTextView.setRightTvDrawableRight(drawable);
    }


    @BindingAdapter("data")
    public static void setItemStoreViewModelList(RecyclerView recyclerView, List<ItemStoreViewModel> data){
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(ItemStoreViewModel.class,new MultiTypeItemStoreViewModelBinder());
        Items items = new Items();
        items.addAll(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }


    @BindingAdapter("data")
    public static void setData(RecyclerView recyclerView, List<Product> data){
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(Product.class,new MultiTypeProduct2Binder());
        Items items = new Items();
        items.addAll(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }

    @BindingAdapter("images")
    public static void setImages(Banner banner, List<String> images){
        banner.setBannerAnimation(Transformer.BackgroundToForeground);
        banner.setImageLoader(new GlideImageLoader());
        //设置图片集合
        banner.setImages(images);
        //banner设置方法全部调用完毕时最后调用
        banner.start();
    }


}
