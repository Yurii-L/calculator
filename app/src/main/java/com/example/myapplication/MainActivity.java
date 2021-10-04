package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import db.dbManeger;


public class MainActivity extends AppCompatActivity  {


    private dbManeger dbManeger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listView);



        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.val, R.layout.list);
        listView.setAdapter(adapter);

        ListView listView1 = findViewById(R.id.listView1);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


dbManeger.insert(position,listView1);
            }


        });
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            } });
        dbManeger=new dbManeger(this);
        dbManeger.open();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbManeger.clos();
    }
}
