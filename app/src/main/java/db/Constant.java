package db;

public class Constant {
    public static final String NAME_DB="calculator";
    public static final String NAME_TABLE_1="usd";
    public static final String NAME_TABLE_2="uah";
    public static final String NAME_TABLE_3="eur";
    public static final String NAME_TABLE_4="rub";
    public static final String _ID="_id";
    public static final String VAL="val";
    public static final String NOM="nom";
    public static final String OPR="opr";
    public static final String NUMB="numb";
    public static final String SUM="sum";
    public static final int DB_VERSION=1;


    public static final String CREATE_TABLE="CREATE TABLE " + NAME_TABLE_1 +
            " (" + _ID + " INTEGER PRIMARY KEY," + VAL + " TEXT," + NOM + " TEXT," + OPR + " TEXT," + NUMB + " TEXT," + SUM + " TEXT)";

    public static final String CREATE_TABLE2="CREATE TABLE " + NAME_TABLE_2 +
            " (" + _ID + " INTEGER PRIMARY KEY," + VAL + " TEXT," + NOM + " TEXT," + OPR + " TEXT," + NUMB + " TEXT," + SUM + " TEXT)";
    public static final String CREATE_TABLE3="CREATE TABLE " + NAME_TABLE_3 +
            " (" + _ID + " INTEGER PRIMARY KEY," + VAL + " TEXT," + NOM + " TEXT," + OPR + " TEXT," + NUMB + " TEXT," + SUM + " TEXT)";
    public static final String CREATE_TABLE4="CREATE TABLE " + NAME_TABLE_4 +
            " (" + _ID + " INTEGER PRIMARY KEY," + VAL + " TEXT," + NOM + " TEXT," + OPR + " TEXT," + NUMB + " TEXT," + SUM + " TEXT)";


    public static final String DROP_TABLE="DROP TABLE IF NOT EXIST"+NAME_TABLE_1;
    public static final String DROP_TABLE2="DROP TABLE IF NOT EXIST"+NAME_TABLE_2;
    public static final String DROP_TABLE3="DROP TABLE IF NOT EXIST"+NAME_TABLE_3;
    public static final String DROP_TABLE4="DROP TABLE IF NOT EXIST"+NAME_TABLE_4;
}
