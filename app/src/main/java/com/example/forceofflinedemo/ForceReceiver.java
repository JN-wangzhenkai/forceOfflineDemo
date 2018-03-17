package com.example.forceofflinedemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;

/**
 * Created by wangzhenkai on 2018/3/17.
 */

public class ForceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(context)
                .setCancelable(false)
                .setTitle("waring")
                .setMessage("you are forced offline,please login again")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ActivityCollecters.finshAll();
                        context.startActivity(new Intent(context,LoginActivity.class));
                    }
                });

        dialog.show();
    }
}
