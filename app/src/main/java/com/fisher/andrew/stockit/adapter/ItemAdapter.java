package com.fisher.andrew.stockit.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.fisher.andrew.stockit.R;
import com.fisher.andrew.stockit.model.Item;

import java.util.List;

/**
 * Created by andrewfisher on 4/20/17.
 */

//Basic adapter, needs to extend a customized ViewHolder to get access to our views
public class ItemAdapter extends
        RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Item> mItems; //may have to plug with custom items
    private Context mContext;

    public ItemAdapter(Context context, List<Item> items){
        mContext = context;
        mItems = items;
    }

    private Context getContext() {
        return mContext;
    }

    //inflating a lyout from xml and returning the holder
    @Override
    public ItemAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View itemView = inflater.inflate(R.layout.list_item,parent,false);

        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    //Populates data into the item through holder
    @Override
    public void onBindViewHolder(ItemAdapter.ViewHolder holder, int position) {
        //get item
        Item item = mItems.get(position);

        //attach to a textview
        TextView textView = holder.itemTextView;

        textView.setText(item.getProduct());

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    //Provide a  direct reference to each of the views within a data item
    //Custom View holder
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView itemTextView;

        public ViewHolder (View itemView){
            //Stores the itemView in a public final member variable that can be used to access the context from any ViewHolder instance.
            super(itemView);

            itemTextView = (TextView) itemView.findViewById(R.id.item_name);

        }


    }







}
