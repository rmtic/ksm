package com.igp.ksm.ui.cart;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import com.igp.ksm.R;
import com.igp.ksm.adapter.MulTypeBind2Adapter;
import com.igp.ksm.adapter.base.IBaseBindingPresenter;
import com.igp.ksm.databinding.ActivityCartBinding;
import com.igp.ksm.model.bean.Product;
import com.igp.ksm.ui.cart.viewmodel.ItemCartViewModel;
import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.utils.ToastUtils;

/**
 * Created by qiu on 2018/7/25.
 */

public class CartActivity extends AppCompatActivity {
    ActivityCartBinding activityCartBinding;
    List<ItemCartViewModel> list;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCartBinding  = DataBindingUtil.setContentView(this, R.layout.activity_cart);
        activityCartBinding.btnAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (ItemCartViewModel itemCartViewModel : list) {
                    itemCartViewModel.setChecked(true);
                }
                int i = 0;
                for (ItemCartViewModel cartViewModel : list) {
                    if (cartViewModel.isChecked()) {
                        i++;
                    }
                }
                activityCartBinding.tvNum.setText("已经选中：【 "+ i +"】");
            }
        });
        activityCartBinding.btnInvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (ItemCartViewModel itemCartViewModel : list) {
                    itemCartViewModel.setChecked(!itemCartViewModel.isChecked());
                }
                int i = 0;
                for (ItemCartViewModel cartViewModel : list) {
                    if (cartViewModel.isChecked()) {
                        i++;
                    }
                }
                activityCartBinding.tvNum.setText("已经选中：【 "+ i +"】");
            }
        });

    list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Product product = new Product("商品"+i,"100","https://upload.jianshu.io/users/upload_avatars/1170012/9351dd4ebede.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120");
            ItemCartViewModel itemCartViewModel = new ItemCartViewModel(product,false);
            list.add(itemCartViewModel);
        }

        MulTypeBind2Adapter adapter = new MulTypeBind2Adapter(list);
        adapter.setItemPresenter(new RecyclerBindPresenter());
        activityCartBinding.recyclerView.setAdapter(adapter);
        activityCartBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        adapter.notifyDataSetChanged();

    }

    public class RecyclerBindPresenter implements IBaseBindingPresenter {

        public void onNameClick(ItemCartViewModel itemCartViewModel) {
            itemCartViewModel.setChecked(!itemCartViewModel.isChecked());
            ToastUtils.showLong("选中了"+itemCartViewModel.getProduct().name);

            int i = 0;
            for (ItemCartViewModel cartViewModel : list) {
                if (cartViewModel.isChecked()) {
                    i++;
                }
            }
            activityCartBinding.tvNum.setText("已经选中：【 "+ i +"】");
        }

    }

}
