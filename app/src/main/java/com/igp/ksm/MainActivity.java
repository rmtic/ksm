package com.igp.ksm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.igp.ksm.adapter.binder.MultiTypeBannerBinder;
import com.igp.ksm.adapter.binder.MultiTypeProductBinder;
import com.igp.ksm.adapter.binder.MultiTypeSectionStoreBinder;
import com.igp.ksm.adapter.binder.MultiTypeStringBinder;
import com.igp.ksm.adapter.binder.MultiTypeSuperTextViewBinder;
import com.igp.ksm.adapter.binder.MultiTypeTitleHvProductBinder;
import com.igp.ksm.databinding.ActivityMainBinding;
import com.igp.ksm.model.bean.Menu;
import com.igp.ksm.model.bean.Product;
import com.igp.ksm.model.bean.TitleHvProduct;
import com.igp.ksm.model.viewmodel.BannerViewModel;
import com.igp.ksm.model.viewmodel.ItemStoreViewModel;
import com.igp.ksm.model.viewmodel.SectionStoreViewModel;
import com.igp.ksm.ui.MainViewModel;

import java.util.ArrayList;
import java.util.List;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private boolean sIsScrolling;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ARouter.getInstance().build("/test/activity").navigation();
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainViewModel = new MainViewModel(MainActivity.this);
        activityMainBinding.setMainviewmodel(mainViewModel);


    }

}
