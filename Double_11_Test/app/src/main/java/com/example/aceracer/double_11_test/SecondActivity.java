package com.example.aceracer.double_11_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    private Button btn_2;
    private EditText edit_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_second);
        btn_2 = (Button) findViewById(R.id.btn_2);
        edit_1 = (EditText) findViewById(R.id.edit_1);

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = edit_1.getText().toString();
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                intent.putExtra("id",input);
                startActivity(intent);
            }
        });
    }
}
