package com.icm.fahd.services1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void startservice(View view){

        Intent myintent=new Intent(this,Fahd_Service_1.class);
        startService(myintent);

    }


    public void stopservice(View view)
    {
        Intent myintent=new Intent(this,Fahd_Service_1.class);
        stopService(myintent);
    }


    public void startIntentservice(View view){
        Intent intent=new Intent(MainActivity.this,Fahd_MyservicesIntentserv.class);
        startService(intent);

    }


    public void stopIntentservice(View view)
    {
        Intent intent=new Intent(MainActivity.this,Fahd_MyservicesIntentserv.class);
        stopService(intent);

    }
}
