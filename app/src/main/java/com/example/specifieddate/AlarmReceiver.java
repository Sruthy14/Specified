package com.example.specifieddate;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.telephony.SmsManager;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class AlarmReceiver extends BroadcastReceiver{


    @Override
    public void onReceive(Context context, Intent intent) {
        String no="8075112248";
        String msg="its not working yaar...";


        Intent i=new Intent(context,MainActivity.class);
        PendingIntent pi=PendingIntent.getActivity(context, 0, i,0);


        SmsManager sms=SmsManager.getDefault();
        sms.sendTextMessage(no, null, msg, pi,null);

        Toast.makeText(context, "Message Sent successfully!",
                Toast.LENGTH_LONG).show();






    }
}
