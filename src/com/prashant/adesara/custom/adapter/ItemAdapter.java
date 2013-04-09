package com.prashant.adesara.custom.adapter;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.prashant.adesara.custom.listview.R;
import com.prashant.adesara.custom.model.ItemsDTO;

/**
 * This is a Custom Adapter to fill up Listview items
 * 
 * @author Prashant Adesara
 **/
@SuppressLint("DefaultLocale")
public class ItemAdapter extends ArrayAdapter<ItemsDTO>
{
    final Context context; 
    final int layoutResourceId;    
    private ArrayList<ItemsDTO> data = null;
	
    public ItemAdapter(final Context context, final int layoutResourceId, final ArrayList<ItemsDTO> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }
    
	@SuppressLint("DefaultLocale")
	@Override
    public View getView(final int position, final View convertView, final ViewGroup parent) {
        View row = convertView;
        LoadHolder holder = null;
        
        if(row == null)
        {
            final LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            
            holder = new LoadHolder();
            holder.txtMainTitle = (TextView)row.findViewById(R.id.txtMainTitle);
            holder.txtSubTitle = (TextView)row.findViewById(R.id.txtSubTitle);
            holder.txtComments = (TextView)row.findViewById(R.id.txtComments);
            holder.txtDates = (TextView)row.findViewById(R.id.txtDateTime);
            row.setTag(holder);
        }
        else
        {
            holder = (LoadHolder)row.getTag();
        }
        
        final ItemsDTO jsonLoadObj = data.get(position);
        holder.txtMainTitle.setText(jsonLoadObj.getMainTitle().toString().toUpperCase());
        holder.txtSubTitle.setText(jsonLoadObj.getSubTitle());
        holder.txtComments.setText(""+jsonLoadObj.getComment());
		holder.txtDates.setText(jsonLoadObj.getDateTime());
        return row;
    }
    
    static class LoadHolder
    {
        TextView txtMainTitle;
        TextView txtSubTitle;
        TextView txtComments;
        TextView txtDates;
    }
}