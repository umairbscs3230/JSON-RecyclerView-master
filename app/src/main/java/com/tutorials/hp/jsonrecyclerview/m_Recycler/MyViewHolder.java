package com.tutorials.hp.jsonrecyclerview.m_Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.jsonrecyclerview.R;




public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView nameTxt;


    public MyViewHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);

    }


}
