package com.icm.fahd.services1;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by fahd on 23/02/2017.
 */
public class Fahd_Service_1 extends  Service{


    final class Fahd_thread implements Runnable{
        int serviceid;

        Fahd_thread(int paraserviceid)
        {
            this.serviceid=paraserviceid;
        }


        @Override
        public void run() {
            synchronized (this){
            try {
                wait(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                stopSelf(this.serviceid);
        }

        }
    }


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Toast.makeText(Fahd_Service_1.this,"Service is started",Toast.LENGTH_SHORT).show();

        Thread mythread=new Thread(new Fahd_thread(startId));
        mythread.start();

        //this will block my service for 20 seconds and will not allow the user to do anything
//        synchronized (this){
//            try {
//                wait(20000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }


        return START_STICKY;
        // return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(Fahd_Service_1.this,"Service is Destroyed",Toast.LENGTH_LONG).show();
        //super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
