package com.qin.fragmenttabhostsamples;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private FragmentTabHost mTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabHost = (FragmentTabHost)findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("BlankFragment").setIndicator("BlankFragment"),
                BlankFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("BlankFragment2ViewModel").setIndicator("BlankFragment2ViewModel"),
                BlankFragment2.class, null);
        mTabHost.getTabWidget().setOrientation(LinearLayout.VERTICAL);
    }
}
