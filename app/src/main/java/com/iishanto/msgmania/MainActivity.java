package com.iishanto.msgmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.iishanto.msgmania.ChatRecycler.ChatAdapter;
import com.iishanto.msgmania.fragments.CallsFragment;
import com.iishanto.msgmania.fragments.StatusFragmnet;
import com.iishanto.msgmania.fragments.chatFragment;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Util.getInstance().setContext(this);
        Window window=getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        window.setStatusBarColor(this.getResources().getColor(R.color.app_bar_primary));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar=findViewById(R.id.toolbar);

        PagerAdapter pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.add(new chatFragment());
        pagerAdapter.add(new StatusFragmnet());
        pagerAdapter.add(new CallsFragment());

        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(pagerAdapter);

        TabLayout tabLayout=findViewById(R.id.main_nav_tab);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText("CHAT");
        tabLayout.getTabAt(1).setText("STORY");
        tabLayout.getTabAt(2).setText("CALLS");

    }
}