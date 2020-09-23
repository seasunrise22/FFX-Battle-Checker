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

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 0.1f);

        for(int i=0; i<count; i++) {
            TextView entity = new TextView(this);
            entity.setText(name[i]);
            entity.setLayoutParams(params);
            dynamicLayout.addView(entity);
        }
    }
}