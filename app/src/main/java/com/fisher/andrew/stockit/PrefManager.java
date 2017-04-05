package com.fisher.andrew.stockit;

import android.content.Context;
import android.content.SharedPreferences;


public class PrefManager {
    SharedPreferences mPref;
    SharedPreferences.Editor mEditor;
    Context mContext;

    int PRIVATE_MODE = 0;

    private static final String PREF_NAME = "stockit-welcome";

    private static final String FIRST_TIME_LAUNCH = "FirstLaunch";

    public PrefManager(Context context){
        mContext=context;
        mPref = mContext.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        mEditor = mPref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime){
        mEditor.putBoolean(FIRST_TIME_LAUNCH,isFirstTime);
        mEditor.commit();
    }

    public boolean isFirstTimeLaunch(){
        return mPref.getBoolean(FIRST_TIME_LAUNCH,true);
    }

}
