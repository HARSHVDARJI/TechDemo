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
public class CustomFinalAdapter extends BaseAdapter {
    Context context;
    ArrayList<FinalDv> finalev;

    public CustomFinalAdapter(Context context, ArrayList<FinalDv> finalev) {
        this.context = context;
        this.finalev = finalev;
    }

    @Override
    public int getCount() {
        return finalev.size();
    }

    @Override
    public Object getItem(int position) {
        return finalev.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }
    static class ViewHolder {
        ImageView image;
        TextView title;
        TextView location;
        TextView time;
        TextView details;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_final, parent, false);
            holder.image = (ImageView) convertView.findViewById(R.id.finalimage);
            holder.title = (TextView) convertView.findViewById(R.id.finaltitle);
            holder.location = (TextView) convertView.findViewById(R.id.finallocation);
            holder.time = (TextView) convertView.findViewById(R.id.finaltime);
//            holder.details = (TextView) convertView.findViewById(R.id.finaldv);
            convertView.setTag(holder);
        }else

        {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.image.setImageResource(finalev.get(position).getImg());
        holder.title.setText(finalev.get(position).getTitle());
        holder.location.setText(finalev.get(position).getLolcation());
        holder.time.setText(finalev.get(position).getTime());
//        holder.details.setText(finalev.get(position).getDetail());
        return convertView;
    }
}
