package com.fisher.andrew.stockit.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fisher.andrew.stockit.R;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button mHomeStockButton;
    Button mShoppingListButton;
    Button mMapButton;
    Button mPictureButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mHomeStockButton = (Button) findViewById(R.id.homeStockButton);
        mShoppingListButton = (Button) findViewById(R.id.shoppingListButton);
        mMapButton = (Button) findViewById(R.id.mapButton);
        mPictureButton = (Button) findViewById(R.id.pictureButton);

        mHomeStockButton.setOnClickListener(this);
        mShoppingListButton.setOnClickListener(this);
        mMapButton.setOnClickListener(this);
        mPictureButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view == mHomeStockButton){
            Toast.makeText(this, "Home Stock", Toast.LENGTH_SHORT).show();
        }else if (view == mShoppingListButton){
            Toast.makeText(this, "Shopping List", Toast.LENGTH_SHORT).show();
        }else if(view==mMapButton){
            Toast.makeText(this, "Map", Toast.LENGTH_SHORT).show();
        }else if(view ==mPictureButton){
            Toast.makeText(this, "Picture", Toast.LENGTH_SHORT).show();
        }
    }
}
