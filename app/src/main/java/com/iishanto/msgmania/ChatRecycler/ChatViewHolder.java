package com.iishanto.msgmania.ChatRecycler;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.iishanto.msgmania.ChatActivity;
import com.iishanto.msgmania.R;
import com.iishanto.msgmania.Util;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    TextView name;
    TextView msg;
    TextView date;

    public void setName(String name) {
        if(name==null) return;
        this.name.setText(name);
    }

    public void setMsg(String msg) {
        if(msg==null) return;
        this.msg.setText(msg);
    }

    public void setDate(String date) {
        if(date==null) return;
        this.date.setText(date);
    }

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.user_name);
        System.out.println("ii: Chat view holder contract");
        System.out.println(name);
        msg=itemView.findViewById(R.id.user_msg);
        date=itemView.findViewById(R.id.user_date);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Util.getInstance().getContext(), ChatActivity.class);
                Util.getInstance().RStartActivity(i);
            }
        });
    }
}
