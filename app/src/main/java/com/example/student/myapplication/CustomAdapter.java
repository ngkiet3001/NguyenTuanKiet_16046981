package com.example.student.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{

    Context context;
    ArrayList<Custom> customs;

    public CustomAdapter(NTK_Cau1 context, ArrayList<Custom> customs) {
        this.context = context;
        this.customs = customs;
    }

    @Override
    public int getCount() {
        return customs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView avt,country;
        TextView text;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if (view ==null)
        {
            view= LayoutInflater.from(context).inflate(R.layout.layout_custom,null);
            holder=new ViewHolder();
            holder.avt=view.findViewById(R.id.avt);
            holder.text=view.findViewById(R.id.text);
            holder.country=view.findViewById(R.id.country);
            view.setTag(holder);
        }else {
            holder=(ViewHolder)view.getTag();
        }


        Custom ct=(Custom)getItem(i);

        holder.avt.setImageResource(ct.getAvt());
        holder.text.setText(ct.toString());
        holder.avt.setImageResource(ct.getCountry());

        return view;
    }
}
