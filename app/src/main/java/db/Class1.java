package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class Class1 extends SQLiteOpenHelper {
    public  Class1(Context context){
        super(context, Constant.NAME_DB, null, Constant.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(Constant.CREATE_TABLE);
        db.execSQL(Constant.CREATE_TABLE2);
        db.execSQL(Constant.CREATE_TABLE3);
        db.execSQL(Constant.CREATE_TABLE4);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(Constant.DROP_TABLE);
        db.execSQL(Constant.DROP_TABLE2);
        db.execSQL(Constant.DROP_TABLE3);
        db.execSQL(Constant.DROP_TABLE4);
        onCreate(db);
    }
}
