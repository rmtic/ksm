package com.igp.ksm.ui.shopping;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Toast;

import com.igp.ksm.R;
import com.igp.ksm.adapter.MulTypeBindAdapter;
import com.igp.ksm.adapter.base.IBaseBindingPresenter;
import com.igp.ksm.adapter.binder.MultiTypeShoppingItemBinder;
import com.igp.ksm.databinding.ActivityShoppingBinding;
import com.igp.ksm.ui.shopping.viewmodel.ShoppingItemViewModel;

import java.util.ArrayList;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by qiu on 2018/7/25.
 */

public class ShoppingActivity extends AppCompatActivity {

    private int[] image_en = {
            R.drawable.shop_64_en_new,
            R.drawable.shop_58_en_new,
            R.drawable.shop_65_en_new,
            R.drawable.shop_82_en_new,
            R.drawable.shop_80_en_new,
            R.drawable.shop_125_en_new,
            R.drawable.shop_84_en_new,
            R.drawable.shop_75_en_new,
            R.drawable.shop_94_en_new,
            R.drawable.shop_126_en_new
    };

    private int[] image_zh_tw = {
            R.drawable.shop_64_zh_tw_new,
            R.drawable.shop_58_zh_tw_new,
            R.drawable.shop_65_zh_tw_new,
            R.drawable.shop_82_zh_tw_new,
            R.drawable.shop_80_zh_tw_new,
            R.drawable.shop_125_zh_tw_new,
            R.drawable.shop_84_zh_tw_new,
            R.drawable.shop_75_zh_tw_new,
            R.drawable.shop_94_zh_tw_new,
            R.drawable.shop_126_zh_tw_new
    };

    ActivityShoppingBinding activityShoppingBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityShoppingBinding = DataBindingUtil.setContentView(this, R.layout.activity_shopping);

        ArrayList<ShoppingItemViewModel> items = new ArrayList<>();
        for (int i : image_en) {
            items.add(new ShoppingItemViewModel(i));
        }
        MulTypeBindAdapter adapter = new MulTypeBindAdapter(items);
        adapter.setItemPresenter(new RecyclerBindPresenter());
        activityShoppingBinding.recyclerView.setAdapter(adapter);
        activityShoppingBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter.notifyDataSetChanged();
    }



    public class RecyclerBindPresenter implements IBaseBindingPresenter {

        public void onNameClick(ShoppingItemViewModel shoppingItemViewModel) {
            ToastUtils.showLong("点击了"+shoppingItemViewModel.getImage_cover());
        }

    }
}
