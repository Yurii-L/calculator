package db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ListView;
import android.widget.SimpleAdapter;


import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class dbManeger  {
    final String val="val";
    final String nom="nom";
    final String numb="num";
    final String opr="opr";
    final String sum="sum";
    String val1="val";
    String nom1="nom";
    String numb1="num";
    String opr1="opr";
    String sum1="sum";
    public Context context;
    public int position;
    private Class1 Class1;
    private SQLiteDatabase db;
    public dbManeger(Context context){
        this.context=context;

        Class1 = new Class1(context);
    }
    public void open(){
        db = Class1.getWritableDatabase();
    }


    public  void imput(String val, String nom, String opr, String numb, String sum){
        ContentValues values = new ContentValues();
        values.put(Constant.VAL, val);
        values.put(Constant.NOM, nom);
        values.put(Constant.OPR, opr);
        values.put(Constant.NUMB, numb);
        values.put(Constant.SUM, sum);
        db.insert(Constant.NAME_TABLE_4, null,values);
    }





    @SuppressLint("Range")
    public void insert(int position, ListView listView1){
        if (position==0){ Cursor cursor = db.query(Constant.NAME_TABLE_2,null,null,null,null,null,null);
            ArrayList<Map<String, Object>> data = new ArrayList<>(10);
            Map<String, Object> m;
            while (cursor.moveToNext()){
                val1=cursor.getString(cursor.getColumnIndex(Constant.VAL));
                nom1=cursor.getString(cursor.getColumnIndex(Constant.NOM));
                opr1=cursor.getString(cursor.getColumnIndex(Constant.OPR));
                numb1=cursor.getString(cursor.getColumnIndex(Constant.NUMB));
                sum1=cursor.getString(cursor.getColumnIndex(Constant.SUM));

                m = new HashMap<>();
                m.put(nom, nom1);
                m.put(val, val1);
                m.put(opr, opr1);
                m.put(numb, numb1);
                m.put(sum, sum1);
                data.add(m);
            }

            String[] from = { val, nom, opr, numb, sum };
            int[] to = {R.id.textView3, R.id.editTextNumberSigned3,R.id.textView, R.id.editTextNumberSigned, R.id.textView7,};

            SimpleAdapter sAdapter = new SimpleAdapter(context, data, R.layout.list1,
                    from, to);
            listView1.setAdapter(sAdapter);}
        if (position==1){
            Cursor cursor = db.query(Constant.NAME_TABLE_1,null,null,null,null,null,null);
            ArrayList<Map<String, Object>> data = new ArrayList<>(9);
            Map<String, Object> m;
            while (cursor.moveToNext()){
                val1=cursor.getString(cursor.getColumnIndex(Constant.VAL));
                nom1=cursor.getString(cursor.getColumnIndex(Constant.NOM));
                opr1=cursor.getString(cursor.getColumnIndex(Constant.OPR));
                numb1=cursor.getString(cursor.getColumnIndex(Constant.NUMB));
                sum1=cursor.getString(cursor.getColumnIndex(Constant.SUM));

                m = new HashMap<>();
                m.put(nom, nom1);
                m.put(val, val1);
                m.put(opr, opr1);
                m.put(numb, numb1);
                m.put(sum, sum1);
                data.add(m);
            }
            String[] from = { val, nom, opr, numb, sum };
            int[] to = {R.id.textView3, R.id.editTextNumberSigned3,R.id.textView, R.id.editTextNumberSigned, R.id.textView7,};

            SimpleAdapter sAdapter = new SimpleAdapter(context, data, R.layout.list1,
                    from, to);
            listView1.setAdapter(sAdapter);
        }
        if (position==2){
            Cursor cursor = db.query(Constant.NAME_TABLE_3,null,null,null,null,null,null);
            ArrayList<Map<String, Object>> data = new ArrayList<>(9);
            Map<String, Object> m;
            while (cursor.moveToNext()){
                val1=cursor.getString(cursor.getColumnIndex(Constant.VAL));
                nom1=cursor.getString(cursor.getColumnIndex(Constant.NOM));
                opr1=cursor.getString(cursor.getColumnIndex(Constant.OPR));
                numb1=cursor.getString(cursor.getColumnIndex(Constant.NUMB));
                sum1=cursor.getString(cursor.getColumnIndex(Constant.SUM));

                m = new HashMap<>();
                m.put(nom, nom1);
                m.put(val, val1);
                m.put(opr, opr1);
                m.put(numb, numb1);
                m.put(sum, sum1);
                data.add(m);
            }
            String[] from = { val, nom, opr, numb, sum };
            int[] to = {R.id.textView3, R.id.editTextNumberSigned3,R.id.textView, R.id.editTextNumberSigned, R.id.textView7,};

            SimpleAdapter sAdapter = new SimpleAdapter(context, data, R.layout.list1,
                    from, to);
            listView1.setAdapter(sAdapter);
        }
        if (position==3){
            Cursor cursor = db.query(Constant.NAME_TABLE_4,null,null,null,null,null,null);
            ArrayList<Map<String, Object>> data = new ArrayList<>(12);
            Map<String, Object> m;
            while (cursor.moveToNext()){
                val1=cursor.getString(cursor.getColumnIndex(Constant.VAL));
                nom1=cursor.getString(cursor.getColumnIndex(Constant.NOM));
                opr1=cursor.getString(cursor.getColumnIndex(Constant.OPR));
                numb1=cursor.getString(cursor.getColumnIndex(Constant.NUMB));
                sum1=cursor.getString(cursor.getColumnIndex(Constant.SUM));

                m = new HashMap<>();
                m.put(nom, nom1);
                m.put(val, val1);
                m.put(opr, opr1);
                m.put(numb, numb1);
                m.put(sum, sum1);
                data.add(m);
            }
            String[] from = { val, nom, opr, numb, sum };
            int[] to = {R.id.textView3, R.id.editTextNumberSigned3,R.id.textView, R.id.editTextNumberSigned, R.id.textView7,};

            SimpleAdapter sAdapter = new SimpleAdapter(context, data, R.layout.list1,
                    from, to);
            listView1.setAdapter(sAdapter);
        }
    }
    public void clos(){
        Class1.close();
    }
}
