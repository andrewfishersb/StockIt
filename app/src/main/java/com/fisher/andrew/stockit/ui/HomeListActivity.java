package com.fisher.andrew.stockit.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.fisher.andrew.stockit.R;
import com.fisher.andrew.stockit.adapter.ItemAdapter;
import com.fisher.andrew.stockit.model.ListItem;

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
        ImageView ex = (ImageView) findViewById(R.id.swipe_set_expiration);
        ImageView send = (ImageView) findViewById(R.id.swipe_send_to_list);
        ImageView delete = (ImageView) findViewById(R.id.swipe_delete);






        //is currently swiping without all this code but this may soon be neccesary
//        SwipeLayout swipeLayout =  (SwipeLayout)findViewById(R.id.swipe_list_item);
//
////set show mode.
//        swipeLayout.setShowMode(SwipeLayout.ShowMode.LayDown);

//add drag edge.(If the BottomView has 'layout_gravity' attribute, this line is unnecessary)
//        swipeLayout.addDrag(SwipeLayout.DragEdge.Left, findViewById(R.id.bottom_wrapper));
//
//        swipeLayout.addSwipeListener(new SwipeLayout.SwipeListener() {
//            @Override
//            public void onClose(SwipeLayout layout) {
//                //when the SurfaceView totally cover the BottomView.
//            }
//
//            @Override
//            public void onUpdate(SwipeLayout layout, int leftOffset, int topOffset) {
//                //you are swiping.
//            }
//
//            @Override
//            public void onStartOpen(SwipeLayout layout) {
//
//            }
//
//            @Override
//            public void onOpen(SwipeLayout layout) {
//                //when the BottomView totally show.
//            }
//
//            @Override
//            public void onStartClose(SwipeLayout layout) {
//
//            }
//
//            @Override
//            public void onHandRelease(SwipeLayout layout, float xvel, float yvel) {
//                //when user's hand released.
//            }
//        });
    }
}
