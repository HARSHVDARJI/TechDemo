package com.project.harsh.techdemo.ViewLayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.harsh.techdemo.R;

import java.util.ArrayList;

/**
 * Created by harsh on 1/3/17.
 */

public class CustomListAdapter extends BaseAdapter {
    Context context;
    ArrayList<MainCat> subeve;

    public CustomListAdapter(Context context, ArrayList<MainCat> subeve) {
        this.context = context;
        this.subeve = subeve;
    };
    @Override
    public int getCount() {
        return subeve.size();
    }

    @Override
    public Object getItem(int position) {
        return subeve.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    static class ViewHolder {
        ImageView image;
        TextView name;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        CustomListAdapter.ViewHolder holder = new CustomListAdapter.ViewHolder();
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_list, parent, false);
            holder.image = (ImageView) convertView.findViewById(R.id.subimage);
            holder.name = (TextView) convertView.findViewById(R.id.subtext);
            convertView.setTag(holder);
        }else

        {
            holder = (CustomListAdapter.ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(subeve.get(position).getImg());
        holder.name.setText(subeve.get(position).getTitle());
        return convertView;
    }
}

