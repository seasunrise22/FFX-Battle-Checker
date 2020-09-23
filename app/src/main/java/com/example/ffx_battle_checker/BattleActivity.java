package com.example.ffx_battle_checker;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.TextViewCompat;

import org.w3c.dom.Text;

public class BattleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);

        //넘어온 캐릭터들 목록 생성을 위한 선언부
        Intent intent = getIntent();
        final int count = intent.getIntExtra("count", 0);
        final String[] name = intent.getStringArrayExtra("name");
        final LinearLayout dynamicLayout = (LinearLayout)findViewById(R.id.dynamicLayout);

        generateView(count, name, dynamicLayout); //텍스트 뷰 생성

        //초기화 버튼 눌렀을 때 반응
        Button btnReset = (Button)findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                dynamicLayout.removeAllViews();
                generateView(count, name, dynamicLayout); //텍스트 뷰 생성
            }
        });
    }

    void generateView(int count, String[] name, LinearLayout dynamicLayout) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 0, 0.1f);
        params.setMargins(5, 5, 5, 5);

        //넘어온 캐릭터들 목록을 실질적으로 생성하는 생성부
        for(int i=0; i<count; i++) {
            final TextView entity = new TextView(this);
            entity.setText(name[i]);
            entity.setTag(i);
            entity.setLayoutParams(params);
            entity.setBackgroundColor(Color.parseColor("#D4F4FA"));
            entity.setPadding(10, 5, 0, 5);
            TextViewCompat.setAutoSizeTextTypeWithDefaults(entity, TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);
            entity.setOnClickListener(new View.OnClickListener() {
                boolean isTouched = false;
                @Override
                public void onClick(View v) {
                    if(!isTouched) {
                        //터치한 적이 없다면 터치할 때 노란색으로 변경하라
                        v.setBackgroundColor(Color.parseColor("#FFE400"));
                        isTouched = true;
                    }
                    else {
                        //터치한 적이 있다면 노란색을 다시 흰색으로 바꿔라
                        v.setBackgroundColor(Color.parseColor("#D4F4FA"));
                        isTouched = false;
                    }
                }
            });
            dynamicLayout.setGravity(Gravity.LEFT);
            dynamicLayout.addView(entity);
        }
    }
}