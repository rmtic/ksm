package com.igp.ksm.ui;

import android.content.Context;
import android.content.Intent;

import com.igp.ksm.ui.cart.CartActivity;
import com.igp.ksm.ui.me.MeActivity;
import com.igp.ksm.ui.shopping.ShoppingActivity;

/**
 * Created by qiu on 2018/7/25.
 */

public class MainViewModel {

    public Context context;

    public MainViewModel(Context context) {
        this.context = context;
    }

    public void home(){
        Intent intent = new Intent(context,HomeActivity.class);
        context.startActivity(intent);
    }

    public void shopping(){
        Intent intent = new Intent(context,ShoppingActivity.class);
        context.startActivity(intent);
    }

    public void cart(){
        Intent intent = new Intent(context,CartActivity.class);
        context.startActivity(intent);
    }

    public void me(){
        Intent intent = new Intent(context,MeActivity.class);
        context.startActivity(intent);
    }
}
