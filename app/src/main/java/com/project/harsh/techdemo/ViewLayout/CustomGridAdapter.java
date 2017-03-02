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
 * Created by harsh on 28/2/17.
 */
public class CustomGridAdapter extends BaseAdapter{

    Context context;
    ArrayList<MainCat> maincategory;

    public CustomGridAdapter(Context context, ArrayList<MainCat> maincategory) {
        this.context = context;
        this.maincategory = maincategory;
    };
    @Override
    public int getCount() {
        return maincategory.size();
    }

    @Override
    public Object getItem(int position) {
        return maincategory.get(position);
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
        ViewHolder holder = new ViewHolder();
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.single_grid, parent, false);
            holder.image = (ImageView) convertView.findViewById(R.id.imageView1);
            holder.name = (TextView) convertView.findViewById(R.id.textView1);
            convertView.setTag(holder);
        }else

        {
            holder = (ViewHolder) convertView.getTag();
        }
            holder.image.setImageResource(maincategory.get(position).getImg());
            holder.name.setText(maincategory.get(position).getTitle());
//        convertView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (position == 1){
//                    Intent gridintent = new Intent(context,ListActivity.class);
//                    gridintent.putExtra("listevent1",maincategory.get(position).getImg());
//                    context.startActivity(gridintent);
//                }
//                if (position == 2){
////                Activity activitycontext =(Activity)context;
////                Intent gridintent = new Intent(context,ListActivity.class);
//                Intent gridintent1 = new Intent(context,Help.class);
////                gridintent.putExtra("listevent1",maincategory.get(position).getImg());
//                gridintent1.putExtra("listevent2",maincategory.get(position).getTitle());
////                context.startActivity(gridintent);
//                context.startActivity(gridintent1);
//                }
//           }
//        });
            return convertView;
    }
}
