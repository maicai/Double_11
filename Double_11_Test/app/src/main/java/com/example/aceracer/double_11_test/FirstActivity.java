package com.example.aceracer.double_11_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class FirstActivity extends AppCompatActivity {
    private Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.first_layout);
        final Intent localIntent=new Intent(this,SecondActivity.class);
        btn_1 = (Button)findViewById(R.id.btn_1);
        Timer timer=new Timer();
        final TimerTask tast=new TimerTask()
        {
            @Override
            public void run(){
                startActivity(localIntent);
                finish();
            }
        };
        timer.schedule(tast,3000);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(localIntent);
                FirstActivity.this.finish();
                tast.cancel();
            }
        });
    }
}
