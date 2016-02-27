package com.github.lzyzsd.androiduiproblems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showOverDraw = (Button) findViewById(R.id.btn_show_overdraw);
        showOverDraw.setOnClickListener(this);

        Button busyOnDraw = (Button) findViewById(R.id.btn_busy_on_draw);
        busyOnDraw.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_show_overdraw:
                startActivity(new Intent(this, OverDrawViewActivity.class));
                break;
            case R.id.btn_busy_on_draw:
                startActivity(new Intent(this, BusyOnDrawViewActivity.class));
                break;
        }
    }
}
