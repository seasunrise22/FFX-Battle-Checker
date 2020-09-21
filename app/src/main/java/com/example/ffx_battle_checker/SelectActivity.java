package com.example.ffx_battle_checker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SelectActivity extends AppCompatActivity {
    boolean isSelected01 = false;
    boolean isSelected02 = false;
    boolean isSelected03 = false;
    boolean isSelected04 = false;
    boolean isSelected05 = false;
    boolean isSelected06 = false;
    boolean isSelected07 = false;

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
                if(!isSelected01) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected01 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected01 = false;
                }
            }
        });

        //유우나
        TextView textView02 = (TextView) findViewById(R.id.button02) ;
        textView02.setBackgroundColor(Color.GRAY);
        textView02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected02) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected02 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected02 = false;
                }
            }
        });

        //와카
        TextView textView03 = (TextView) findViewById(R.id.button03) ;
        textView03.setBackgroundColor(Color.GRAY);
        textView03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected03) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected03 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected03 = false;
                }
            }
        });

        //루루
        TextView textView04 = (TextView) findViewById(R.id.button04) ;
        textView04.setBackgroundColor(Color.GRAY);
        textView04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected04) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected04 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected04 = false;
                }
            }
        });

        //키마리
        TextView textView05 = (TextView) findViewById(R.id.button05) ;
        textView05.setBackgroundColor(Color.GRAY);
        textView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected05) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected05 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected05 = false;
                }
            }
        });

        //류크
        TextView textView06 = (TextView) findViewById(R.id.button06) ;
        textView06.setBackgroundColor(Color.GRAY);
        textView06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected06) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected06 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected06 = false;
                }
            }
        });

        //아론
        TextView textView07 = (TextView) findViewById(R.id.button07) ;
        textView07.setBackgroundColor(Color.GRAY);
        textView07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isSelected07) {
                    v.setBackgroundColor(Color.BLUE);
                    isSelected07 = true;
                } else {
                    v.setBackgroundColor(Color.GRAY);
                    isSelected07 = false;
                }
            }
        });

    }
}