package com.iishanto.msgmania.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.iishanto.msgmania.ChatActivity;
import com.iishanto.msgmania.ChatRecycler.ChatAdapter;
import com.iishanto.msgmania.MainActivity;
import com.iishanto.msgmania.R;
import com.iishanto.msgmania.Util;


public class chatFragment extends Fragment {
    RecyclerView recyclerView;
    MainActivity mv;

    public chatFragment(){
        mv=(MainActivity)Util.getInstance().getContext();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_chat,container,false);
        recyclerView=v.findViewById(R.id.chat_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new ChatAdapter(Util.getInstance().getContext()));


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                int[] pos=new int[2];
                recyclerView.getChildAt(0).getLocationInWindow(pos);
                mv.processScroll(pos[0],pos[1]);
            }
        });
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}