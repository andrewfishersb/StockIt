package com.fisher.andrew.stockit;

import android.widget.DatePicker;

/**
 * Created by andrewfisher on 4/5/17.
 */

public class Item {


    private String product;
    private DatePicker expirationDate;
    //Image at some point
    //Bar code at some point

    public Item(String name){
        this.product = name;
    }


    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public DatePicker getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(DatePicker expirationDate) {
        this.expirationDate = expirationDate;
    }


}
