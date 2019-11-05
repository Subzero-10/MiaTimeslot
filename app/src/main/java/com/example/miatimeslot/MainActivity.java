package com.example.miatimeslot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import net.time4j.android.ApplicationStarter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationStarter.initialize(this, true);
        timeZone a = new timeZone();
        a.testTime();
        a.auTime();
        a.brTime();
        a.clTime();
        a.cnTime();
        a.mxTime();
        a.nzTime();
        a.ruTime();
        a.useTime();
        a.uswTime();
    }
}
