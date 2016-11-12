package com.example.aceracer.double_11_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ThirdActivity extends AppCompatActivity {
    private TextView tex_2;
    private TextView talk_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        getSupportActionBar().hide();
        Intent intent = getIntent();
        String data = intent.getStringExtra("id");
        tex_2=(TextView) findViewById(R.id.tex_2);
        talk_1=(TextView) findViewById(R.id.talk_1);
        StringBuilder sb = new StringBuilder("亲爱的");
        sb.append(data+", 你有一封来自我的情书");
        tex_2.setText(sb);
        List list = loveStory();
        talk_1.setText(list.get(1).toString());

    }
    public List loveStory(){
        List<String> c = new ArrayList<String>();
        c.add("我想走在前面\n" +
                "风雨来的时候帮你挡一下 \n" +
                "又想跟随在你身后\n" +
                "在你累的时候撑着你别倒下去");
        c.add("爱你就像爱生命");
        return c;
    }
}
