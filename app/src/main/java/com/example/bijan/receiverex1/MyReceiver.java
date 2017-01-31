package com.example.bijan.receiverex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        switch (action){
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Toast.makeText(context, "screen off", Toast.LENGTH_SHORT).show();
                Log.d("B34", "hiii");
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Toast.makeText(context, "power disconnected", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "battery low", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_CAMERA_BUTTON:
                Toast.makeText(context, "camera on", Toast.LENGTH_SHORT).show();
                break;
        }
        //Toast.makeText(context, "CHARGER UNPLUGGED", Toast.LENGTH_SHORT).show();
    }
}
