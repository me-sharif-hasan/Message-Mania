package com.iishanto.msgmania.ChatRecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.iishanto.msgmania.R;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolder> {
    Context context;
    public ChatAdapter(Context c){
        context=c;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater lf=LayoutInflater.from(context);
        View v=lf.inflate(R.layout.chat_row,parent,false);
        return new ChatViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
          holder.setName("Sharif Hasan");
          holder.setDate("02/01/1999");
          holder.setMsg("Kemon asos?");
    }

    @Override
    public int getItemCount() {
        return 30;
    }
}
