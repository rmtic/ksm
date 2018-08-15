package com.igp.ksm.ui.me;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.igp.ksm.R;
import com.igp.ksm.adapter.binder.MultiTypeSuperTextViewBinder;
import com.igp.ksm.adapter.binder.MultiTypeLogoutBinder;
import com.igp.ksm.databinding.ActivityMeBinding;
import com.igp.ksm.model.bean.Menu;
import com.igp.ksm.ui.me.viewmodel.LogoutViewModel;

import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by qiu on 2018/7/25.
 */

public class MeActivity extends AppCompatActivity {

    ActivityMeBinding activityMeBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMeBinding = DataBindingUtil.setContentView(this, R.layout.activity_me);
        MultiTypeAdapter adapter = new MultiTypeAdapter();
        adapter.register(Menu.class,new MultiTypeSuperTextViewBinder());
        adapter.register(LogoutViewModel.class,new MultiTypeLogoutBinder());
        activityMeBinding.recyclerView.setAdapter(adapter);
        activityMeBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        Items items = new Items();
        //菜单
        items.addAll(menuListForAfterLogin());

        //设置内容；
        adapter.setItems(items);
        adapter.notifyDataSetChanged();
    }

    /**
     * 登录之前显示的菜单
     * @return
     */
    public Items menuListForBeforLogin(){
        Items items = new Items();
        items.add(new Menu("帮助中心"  ,true));
        items.add(new Menu("退货政策"  ,true));
        items.add(new Menu("配送方式"  ,true));
        items.add(new Menu("联络我们"  ,true));
        items.add(new Menu("关于我们"  ,true));
        items.add(new Menu("私隐政策"  ,true));
        items.add(new Menu("条款与细则",true));
        return items;
    }

    /**
     * 登录之后需要显示的菜单
     * @return
     */
    public Items menuListForAfterLogin(){
        Items items = new Items();
        items.add(new Menu("我的資料"   ,true));
        items.add(new Menu("錢包"      ,true));
        items.add(new Menu("訂單記錄"   ,true));
        items.add(new Menu("我的圖庫"   ,true));
        items.add(new Menu("已存儲設計" ,true));
        items.add(new Menu("收藏的產品" ,true));
        items.add(new Menu("關注的店鋪" ,true));
        items.add(new Menu("收貨地址"   ,true));
        items.add(new Menu("配送方式"   ,true));
        items.add(new Menu("退貨政策"   ,true));
        items.add(new Menu("我的足跡"   ,true));
        items.add(new Menu("其他資訊"   ,true));
        items.add(new LogoutViewModel("退出登錄" ));
        return items;
    }
}
