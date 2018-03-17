package com.example.forceofflinedemo;

import android.app.Activity;
import android.text.style.ForegroundColorSpan;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by wangzhenkai on 2018/3/17.
 */

public class ActivityCollecters {
    public static List<Activity>activityList=new ArrayList<>();

    public static void addActivity(Activity activity){
        activityList.add(activity);

    }

    public static void removeActivity(Activity activity){
        activityList.remove(activity);
    }

    public static void finshAll(){
       for(Activity activity:activityList){
           if(!activity.isFinishing()){
               activity.finish();
           }
       }
    }
}
