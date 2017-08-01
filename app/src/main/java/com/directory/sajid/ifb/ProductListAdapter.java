package com.directory.sajid.ifb;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sajid on 1/8/17.
 */

public class ProductListAdapter extends ArrayAdapter<Product> {
    private Context mContext;
    private int mResource;

    static class ViewHolder {
        TextView model_no;
        TextView time;
    }

    public ProductListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Product> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String model_no = getItem(position).getModel_no();
        String time = getItem(position).getTime();
        Product product = new Product(model_no , time);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource , parent , false);

        ViewHolder holder = new ViewHolder();
        holder.model_no = (TextView) convertView.findViewById(R.id.model_no);
        holder.time = (TextView) convertView.findViewById(R.id.time);
        convertView.setTag(holder);

        holder.model_no.setText(model_no);
        holder.time.setText(time);

        return convertView;

    }
}
