package com.example.miatimeslot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import net.time4j.android.ApplicationStarter;
import net.time4j.tz.olson.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAG;
    timeZone a;
    TextView textView ;
    TextView textView2 ;
    TextView textView3 ;
    TextView textView4 ;
    TextView textView5 ;
    TextView textView6 ;
    TextView textView7 ;
    TextView textView8 ;
    TextView textView9 ;
    Button button;
    timeSlot b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ApplicationStarter.initialize(this, true);
        a = new timeZone();
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView9 = (TextView) findViewById(R.id.textView9);
        button = (Button)findViewById(R.id.button);
        b = new timeSlot();
        button.setOnClickListener(this);

    }

    @Override
    protected void onStart() {

        super.onStart();
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
        updatetime();
    }

    void updatetime()
    {
        SpannableStringBuilder builder = new SpannableStringBuilder(a.cnTime());
        textView.setText(builder);
        builder = new SpannableStringBuilder(a.uswTime()+"\n"+b.searchTimeSlot(AMERICA.LOS_ANGELES));
        textView2.setText(builder);
        builder = new SpannableStringBuilder(a.useTime()+"\n"+b.searchTimeSlot(AMERICA.NEW_YORK));
        textView3.setText(builder);
        builder = new SpannableStringBuilder(a.ruTime()+"\n"+b.searchTimeSlot(EUROPE.MOSCOW));
        textView4.setText(builder);
        builder = new SpannableStringBuilder(a.nzTime()+"\n"+b.searchTimeSlot(PACIFIC.AUCKLAND));
        textView5.setText(builder);
        builder = new SpannableStringBuilder(a.mxTime()+"\n"+b.searchTimeSlot(AMERICA.MEXICO_CITY));
        textView6.setText(builder);
        builder = new SpannableStringBuilder(a.clTime()+"\n"+b.searchTimeSlot(AMERICA.SANTIAGO));
        textView7.setText(builder);
        builder = new SpannableStringBuilder(a.brTime()+"\n"+b.searchTimeSlot(AMERICA.SAO_PAULO));
        textView8.setText(builder);
        builder = new SpannableStringBuilder(a.auTime()+"\n"+b.searchTimeSlot(AUSTRALIA.MELBOURNE));
        textView9.setText(builder);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(MainActivity.this, "刷新时间",Toast.LENGTH_LONG).show();
                updatetime();
                break;

        }

    }
}
