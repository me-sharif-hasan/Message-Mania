package com.iishanto.msgmania;

import android.content.Context;
import android.content.Intent;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

public class Util extends AppCompatActivity {
    private static Util util=null;

    public Context getContext() {
        return context;
    }
    public void RStartActivity(Intent i){
        Util.getInstance().getContext().startActivity(i);
        finish();
    }
    public void setContext(Context context) {
        this.context = context;
    }

    private Context context;
    private Util(){}

    public static Util getInstance(){
        if(util==null) util=new Util();
        return util;
    }
}
