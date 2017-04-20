package com.fisher.andrew.stockit.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fisher.andrew.stockit.adapter.ItemAdapter;
import com.fisher.andrew.stockit.model.ListItem;

import com.fisher.andrew.stockit.R;

import java.util.ArrayList;

public class HomeListActivity extends AppCompatActivity {
    ArrayList<ListItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //lookup recyclerview in activitylayout
        RecyclerView rvItems = (RecyclerView) findViewById(R.id.homeItems);

        //forced values
        items = new ArrayList<>();
        items.add(new ListItem("ketchup"));
        items.add(new ListItem("pico de gallo"));
        items.add(new ListItem("baguette"));
        items.add(new ListItem("cumin"));
        items.add(new ListItem("snap peas"));
        items.add(new ListItem("shallots"));
        items.add(new ListItem("kidney beans"));
        items.add(new ListItem("french fries"));
        items.add(new ListItem("eel"));
        items.add(new ListItem("green onions"));

        items.add(new ListItem("Romano cheese"));
        items.add(new ListItem("granola"));
        items.add(new ListItem("creme fraiche"));
        items.add(new ListItem("blackberries"));
        items.add(new ListItem("pumpkins"));
        items.add(new ListItem("applesauce"));
        items.add(new ListItem("buttermilk"));
        items.add(new ListItem("celery"));


        items.add(new ListItem("cherries"));
        items.add(new ListItem("carrots"));

        items.add(new ListItem("mint"));
        items.add(new ListItem("veal"));

        items.add(new ListItem("salmon"));
        items.add(new ListItem("water"));
        items.add(new ListItem("sugar"));

        //creates adapter with the context and list of items
        ItemAdapter itemAdapter = new ItemAdapter(this,items);

        //attach adapter to recyclerview
        rvItems.setAdapter(itemAdapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));

    }
}
