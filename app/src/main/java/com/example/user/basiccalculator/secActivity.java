package com.example.user.basiccalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secActivity extends AppCompatActivity {
    TextView CRDTS_V, VIEW2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        VIEW2 = (TextView)findViewById(R.id.VIEW2);
        CRDTS_V = (TextView)findViewById(R.id.CRDTS_V);
        Intent gi = getIntent();
        VIEW2.setText("Last Sum:"+getIntent().getExtras().getString("n"));
    }



}
