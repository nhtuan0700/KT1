package com.example.kt;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListViewBaseAdapter extends BaseAdapter {
    public ArrayList<DataModel> arrayListListener;
    private List<DataModel> mListenerList;
    Context mcontext;
    public ListViewBaseAdapter(List<DataModel> mListenerList, Context context){
        mcontext = context;
        this.mListenerList = mListenerList;
        this.arrayListListener = new ArrayList<DataModel>();
        this.arrayListListener.addAll(mListenerList);
    }

    public class ViewHolder{
        ImageView mItemPic;
        TextView name;
        TextView subcr;
    }

    @Override
    public int getCount() {
        return mListenerList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return mListenerList.get(position);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if(view == null) {
            view = LayoutInflater.from(mcontext).inflate(R.layout.row_item,null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.image);
            holder.name= (TextView) view.findViewById(R.id.name);
            holder.subcr= (TextView) view.findViewById(R.id.subcr);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        try{
            int image = mListenerList.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.name.setText(mListenerList.get(position).getName());
            holder.subcr.setText(mListenerList.get(position).getSubcr());
        } catch (Exception e) {
        }
        return view;
    }
}