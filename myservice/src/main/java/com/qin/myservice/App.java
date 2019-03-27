package com.qin.myservice;


import android.app.Application;
import android.content.Intent;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService();
    }

    private void startService() {
        Intent intent = new Intent(this, MyService.class);
        startService(intent);    }
}
