package com.fisher.andrew.stockit.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fisher.andrew.stockit.adapter.ItemAdapter;
import com.fisher.andrew.stockit.model.Item;

import com.fisher.andrew.stockit.R;

import java.util.ArrayList;

public class HomeListActivity extends AppCompatActivity {
    ArrayList<Item> items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //lookup recyclerview in activitylayout
        RecyclerView rvItems = (RecyclerView) findViewById(R.id.homeItems);

        //forced values
        items = new ArrayList<>();
        items.add(new Item("half-and-half"));
        items.add(new Item("spinach"));
        items.add(new Item("raisins"));
        items.add(new Item("paprika"));
        items.add(new Item("pancetta"));
        items.add(new Item("cheddar cheese"));
        items.add(new Item("pesto"));
        items.add(new Item("huckleberries"));
        items.add(new Item("molasses"));
        items.add(new Item("baking powder"));
        items.add(new Item("cornmeal"));
        items.add(new Item("peanuts"));
        items.add(new Item("onion powder"));
        items.add(new Item("provolone"));
        items.add(new Item("flour"));
        items.add(new Item("pineapples"));
        items.add(new Item("prawns"));
        items.add(new Item("squash"));
        items.add(new Item("Tabasco sauce"));
        items.add(new Item("eggplants"));
        items.add(new Item("ginger"));
        items.add(new Item("oranges"));
        items.add(new Item("chocolate"));
        items.add(new Item("vinegar"));
        items.add(new Item("raspberries"));

        //creates adapter with the context and list of items
        ItemAdapter itemAdapter = new ItemAdapter(this,items);

        //attach adapter to recyclerview
        rvItems.setAdapter(itemAdapter);
        rvItems.setLayoutManager(new LinearLayoutManager(this));

    }
}
