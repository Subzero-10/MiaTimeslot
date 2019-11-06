package com.example.miatimeslot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import net.time4j.android.ApplicationStarter;
import net.time4j.tz.olson.*;

public class MainActivity extends AppCompatActivity {

    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationStarter.initialize(this, true);
        timeZone a = new timeZone();
        a.testTime();
        a.uswTime();
        a.useTime();
        a.ruTime();
        a.nzTime();
        a.mxTime();
        a.cnTime();
        a.clTime();
        a.brTime();
        a.auTime();
        timeSlot b = new timeSlot();
        Log.i(TAG, "onCreate: "+b.searchTimeSlot(ASIA.SHANGHAI, AUSTRALIA.MELBOURNE));
    }
}
