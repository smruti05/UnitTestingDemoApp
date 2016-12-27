package com.unittestingdemoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvCurrentTiemstamp, tvConvertedDateTime;
    Button btnConvertDateTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        showCurrentTimestamp();
        btnConvertDateTime.setOnClickListener(this);
    }

    private void showCurrentTimestamp() {
        tvCurrentTiemstamp.setText(DateFormat.getDateTimeInstance().format(new Date()));
    }

    private void initViews() {
        btnConvertDateTime = (Button) findViewById(R.id.btnConvert);
        tvCurrentTiemstamp = (TextView) findViewById(R.id.tvCurrentTimestamp);
        tvConvertedDateTime = (TextView) findViewById(R.id.tvConvertedDateTime);
    }

    @Override
    public void onClick(View v) {
        String formattedDateTime = DateTimeConverter.convertDateTime(new Date());
        tvConvertedDateTime.setText(formattedDateTime);
    }
}
