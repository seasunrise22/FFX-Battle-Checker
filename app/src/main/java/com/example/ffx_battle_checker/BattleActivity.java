package com.example.ffx_battle_checker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BattleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        LinearLayout dynamicLayout = (LinearLayout)findViewById(R.id.dynamicLayout);
        Intent intent = getIntent();
        int count = intent.getIntExtra("count", 0);
        String[] name = intent.getStringArrayExtra("name");

        TextView textView1 = new TextView(this);
        textView1.setText(name[0]);
        TextView textView2 = new TextView(this);
        textView2.setText(name[1]);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 0.1f);
        textView1.setLayoutParams(params);
        textView2.setLayoutParams(params);
        dynamicLayout.addView(textView1);
        dynamicLayout.addView(textView2);
    }
}