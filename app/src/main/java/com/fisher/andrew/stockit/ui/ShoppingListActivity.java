package com.fisher.andrew.stockit.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.fisher.andrew.stockit.R;
import com.fisher.andrew.stockit.adapter.ItemAdapter;
import com.fisher.andrew.stockit.model.ListItem;

import java.util.ArrayList;

public class ShoppingListActivity extends AppCompatActivity implements View.OnClickListener {
    private ArrayList<ListItem> mShoppingList;


    ImageView mTimer;
    ImageView mSendHome;
    ImageView mDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);

        RecyclerView shoppingRecyclerView = (RecyclerView) findViewById(R.id.shoppingItems);

        //Swipe to buttons
        mTimer = (ImageView) findViewById(R.id.swipe_set_expiration);
        mSendHome = (ImageView) findViewById(R.id.swipe_send_to_list);
        mDelete = (ImageView) findViewById(R.id.swipe_delete);
        //


        //Click on buttons
//        mTimer.setOnClickListener(this);
//        mSendHome.setOnClickListener(this);
//        mDelete.setOnClickListener(this);
        //

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

    @Override
    public void onClick(View view) {
        if(view ==mDelete){
            Toast.makeText(this, "Delete", Toast.LENGTH_SHORT).show();
        }
        if(view==mSendHome){
            Toast.makeText(this, "Send Home", Toast.LENGTH_SHORT).show();
        }

        if(view == mTimer){
            Toast.makeText(this, "Timer", Toast.LENGTH_SHORT).show();
        }
    }
}
