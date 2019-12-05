package com.sqlmysqllite.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class MyHelper  extends SQLiteOpenHelper {
    private static final String db_name="Dictionary";
    private static final int db_version=1;

    private static final  String tblName ="tblWord";
    private static final  String wordID ="WordId";
    private static final  String wordName ="WordName";
    private static final  String meaning ="WordMeaning";

    public MyHelper(@Nullable Context context) {
        super(context, db_name, null, db_version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + tblName + "(" + wordID + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                wordName + "Text, "
                + meaning + " TEXT " +

        ")";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
