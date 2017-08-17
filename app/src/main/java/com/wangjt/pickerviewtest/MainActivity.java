package com.wangjt.pickerviewtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PickerView pv = (PickerView) findViewById(R.id.pv1);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 12; i++) {
            list.add(i + "");
        }
        pv.setData(list);
        pv.setOnSelectListener(new PickerView.onSelectListener() {

            @Override
            public void onSelect(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
