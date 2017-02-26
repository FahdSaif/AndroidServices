package com.icm.fahd.services1;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by fahd on 24/02/2017.
 * Intent Service Method
 */
public class Fahd_MyservicesIntentserv extends IntentService {

    public Fahd_MyservicesIntentserv() {
        super("My_Intent_Thread");
    }


    @Override
    protected void onHandleIntent(Intent intent) {

        synchronized (this){
            try {
                wait(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(Fahd_MyservicesIntentserv.this,"IntentService is Satrted",Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        Toast.makeText(Fahd_MyservicesIntentserv.this,"IntentService is destroyed",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }




}
