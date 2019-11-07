package com.example.miatimeslot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
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
    String str;
    Intent intent;


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
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        textView6.setOnClickListener(this);
        textView7.setOnClickListener(this);
        textView8.setOnClickListener(this);
        textView9.setOnClickListener(this);
        intent=new Intent(MainActivity.this, selectActivity.class);

    }

    @Override
    protected void onStart() {

        super.onStart();
        updatetime();
    }

    void updatetime()
    {
        SpannableStringBuilder builder = new SpannableStringBuilder(Html.fromHtml(a.cnTime()));
        textView.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.uswTime()+"<br>"+b.searchTimeSlot(AMERICA.LOS_ANGELES)));
        textView2.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.useTime()+"<br>"+b.searchTimeSlot(AMERICA.NEW_YORK)));
        textView3.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.ruTime()+"<br>"+b.searchTimeSlot(EUROPE.MOSCOW)));
        textView4.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.nzTime()+"<br>"+b.searchTimeSlot(PACIFIC.AUCKLAND)));
        textView5.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.mxTime()+"<br>"+b.searchTimeSlot(AMERICA.MEXICO_CITY)));
        textView6.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.clTime()+"<br>"+b.searchTimeSlot(AMERICA.SANTIAGO)));
        textView7.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.brTime()+"<br>"+b.searchTimeSlot(AMERICA.SAO_PAULO)));
        textView8.setText(builder);
        builder = new SpannableStringBuilder(Html.fromHtml("<p>"+a.auTime()+"<br>"+b.searchTimeSlot(AUSTRALIA.MELBOURNE)));
        textView9.setText(builder);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView2:
                str = "usw";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView3:
                str = "use";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView4:
                str = "ru";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView5:
                str = "nz";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView6:
                str = "mx";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView7:
                str = "cl";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView8:
                str = "br";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.textView9:
                str = "au";
                intent.putExtra("timezone",str);
                startActivity(intent);
                break;
            case R.id.button:
                Toast.makeText(MainActivity.this, "刷新时间",Toast.LENGTH_LONG).show();
                updatetime();
                break;

        }

    }
}
