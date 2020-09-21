package com.example.ffx_battle_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SelectActivity extends AppCompatActivity {
    boolean[] isSelected = new boolean[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        //티다
        TextView textView01 = (TextView) findViewById(R.id.button01) ;
        textView01.setBackgroundColor(Color.GRAY);
        textView01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[0]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[0] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[0] = false;
                }
            }
        });

        //유우나
        TextView textView02 = (TextView) findViewById(R.id.button02) ;
        textView02.setBackgroundColor(Color.GRAY);
        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[1]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[1] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[1] = false;
                }
            }
        });

        //와카
        TextView textView03 = (TextView) findViewById(R.id.button03) ;
        textView03.setBackgroundColor(Color.GRAY);
        textView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[2]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[2] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[2] = false;
                }
            }
        });

        //루루
        TextView textView04 = (TextView) findViewById(R.id.button04) ;
        textView04.setBackgroundColor(Color.GRAY);
        textView04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[3]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[3] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[3] = false;
                }
            }
        });

        //키마리
        TextView textView05 = (TextView) findViewById(R.id.button05) ;
        textView05.setBackgroundColor(Color.GRAY);
        textView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[4]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[4] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[4] = false;
                }
            }
        });

        //류크
        TextView textView06 = (TextView) findViewById(R.id.button06) ;
        textView06.setBackgroundColor(Color.GRAY);
        textView06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[5]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[5] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[5] = false;
                }
            }
        });

        //아론
        TextView textView07 = (TextView) findViewById(R.id.button07) ;
        textView07.setBackgroundColor(Color.GRAY);
        textView07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected[6]) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected[6] = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected[6] = false;
                }
            }
        });

        //선택완료 버튼 눌렀을 경우 반응
        Button submitBtn = (Button)findViewById(R.id.buttonSubmit);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            int num ;
            int i;

            @Override
            public void onClick(View v) {
                num = 0;
                i = 0;
                while(i < 7) {
                    if (isSelected[i])
                        num++;
                    i++;
                }
                //Toast.makeText(v.getContext(), Integer.toString(num), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(v.getContext(), BattleActivity.class);
                intent.putExtra("count", num);
                startActivity(intent);
            }
        });
    }
}