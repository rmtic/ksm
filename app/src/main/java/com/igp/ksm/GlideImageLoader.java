package com.igp.ksm;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by qiu on 2018/7/25.
 */

public class GlideImageLoader  extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.mipmap.ic_launcher)
                .override(400,400)
                .diskCacheStrategy(DiskCacheStrategy.ALL);
        Glide.with(context)
                .load(path)
                .apply(requestOptions)
                .into(imageView);
    }
}
