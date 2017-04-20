package com.fisher.andrew.stockit.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.fisher.andrew.stockit.R;
import com.fisher.andrew.stockit.adapter.ItemAdapter;
import com.fisher.andrew.stockit.model.ListItem;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity {
    private ArrayList<ListItem> mShoppingList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        RecyclerView shoppingRecyclerView = (RecyclerView) findViewById(R.id.shoppingItems);

        mShoppingList = new ArrayList<>();
        mShoppingList.add(new ListItem("half-and-half"));
        mShoppingList.add(new ListItem("spinach"));
        mShoppingList.add(new ListItem("raisins"));
        mShoppingList.add(new ListItem("paprika"));
        mShoppingList.add(new ListItem("pancetta"));
        mShoppingList.add(new ListItem("cheddar cheese"));
        mShoppingList.add(new ListItem("pesto"));
        mShoppingList.add(new ListItem("huckleberries"));
        mShoppingList.add(new ListItem("molasses"));
        mShoppingList.add(new ListItem("baking powder"));
        mShoppingList.add(new ListItem("cornmeal"));
        mShoppingList.add(new ListItem("peanuts"));
        mShoppingList.add(new ListItem("onion powder"));
        mShoppingList.add(new ListItem("provolone"));
        mShoppingList.add(new ListItem("flour"));
        mShoppingList.add(new ListItem("pineapples"));
        mShoppingList.add(new ListItem("prawns"));
        mShoppingList.add(new ListItem("squash"));
        mShoppingList.add(new ListItem("Tabasco sauce"));
        mShoppingList.add(new ListItem("eggplants"));
        mShoppingList.add(new ListItem("ginger"));
        mShoppingList.add(new ListItem("oranges"));
        mShoppingList.add(new ListItem("chocolate"));
        mShoppingList.add(new ListItem("vinegar"));
        mShoppingList.add(new ListItem("raspberries"));

        ItemAdapter adapter = new ItemAdapter(this,mShoppingList);

        shoppingRecyclerView.setAdapter(adapter);
        shoppingRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
