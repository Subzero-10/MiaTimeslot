package com.example.miatimeslot;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import cn.carbswang.android.numberpickerview.library.NumberPickerView;

public class selectActivity extends AppCompatActivity {

    NumberPickerView picker;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        picker = (NumberPickerView) findViewById(R.id.picker);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "干啥啥不行，吃饭第一名！", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    @Override
    protected void onStart() {

        super.onStart();
        Intent intent = getIntent();
        String str = intent.getStringExtra("timezone");
        toolbar = findViewById(R.id.toolbar);
        switch (str){
            case "usw":
                toolbar.setTitle("时间对比-美西");
                String[] time2 = {"8点     前一天16点","9点     前一天17点","10点     前一天18点","11点     前一天19点","12点     前一天20点","13点     前一天21点"};
                picker.setDisplayedValues(time2);
                picker.setMinValue(0);
                picker.setMaxValue(5);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "use":
                toolbar.setTitle("时间对比-美东");
                String[] time3 = {"8点     前一天19点","9点     前一天20点","10点     前一天21点"};
                picker.setDisplayedValues(time3);
                picker.setMinValue(0);
                picker.setMaxValue(2);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "ru":
                toolbar.setTitle("时间对比-俄罗斯");
                String[] time4 = {"13点     8点","14点     9点","15点     10点","16点     11点","17点     12点","18点     13点","19点     14点","20点     15点","21点     16点"};
                picker.setDisplayedValues(time4);
                picker.setMinValue(0);
                picker.setMaxValue(8);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "nz":
                toolbar.setTitle("时间对比-新西兰");
                String[] time5 = {"8点     14点","9点     15点","10点     16点","11点     17点","12点     18点","13点     19点","14点     20点","15点     21点"};
                picker.setDisplayedValues(time5);
                picker.setMinValue(0);
                picker.setMaxValue(7);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "mx":
                toolbar.setTitle("时间对比-墨西哥");
                String[] time6 = {"8点     前一天18点","9点     前一天19点","10点     前一天20点","11点     前一天21点"};
                picker.setDisplayedValues(time6);
                picker.setMinValue(0);
                picker.setMaxValue(3);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "cl":
                toolbar.setTitle("时间对比-智利");
                String[] time7 = {"19点     8点","20点     9点","21点     10点"};
                picker.setDisplayedValues(time7);
                picker.setMinValue(0);
                picker.setMaxValue(2);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "br":
                toolbar.setTitle("时间对比-巴西");
                String[] time8 = {"19点     8点","20点     9点","21点     10点"};
                picker.setDisplayedValues(time8);
                picker.setMinValue(0);
                picker.setMaxValue(2);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
            case "au":
                toolbar.setTitle("时间对比-澳大利亚");
                String[] time9 = {"8点     11点","9点     12点","10点     13点","11点     14点","12点     15点","13点     16点","14点     17点","15点     18点","16点     19点","17点     20点","18点     21点"};
                picker.setDisplayedValues(time9);
                picker.setMinValue(0);
                picker.setMaxValue(10);
                picker.setValue(0);
                picker.setWrapSelectorWheel(false);
                break;
        }
    }

}
