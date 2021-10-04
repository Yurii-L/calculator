package com.example.myapplication;


import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;

import android.widget.Button;

import android.widget.ListView;
import android.widget.TextView;



public class MainActivity2 extends MainActivity{

    Button button14;
    int s, s1,s2,s3,s4;

    TextView textView9;
    TextView textView;
    TextView textView5;
    TextView textView6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button14 =  findViewById(R.id.button14);
        textView9 =  findViewById(R.id.textView9);
        textView = findViewById(R.id.textView10);
        textView5 =  findViewById(R.id.textView5);
        textView6= findViewById(R.id.textView6);
        OnClickListener oclBtnOk = new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView9.getText().equals("")) {
                    textView9.setText(textView9.getText().toString() + textView.getText());
                    textView.setText("0");
                } else {
                    textView9.setText(textView9.getText() + "+" + textView.getText());
                    textView.setText("0");
                }

            }
        };
        button14.setOnClickListener(oclBtnOk);



    }
    public void m(int position,ListView listView){

    }

    public void appendText(View view) {

    }


}


