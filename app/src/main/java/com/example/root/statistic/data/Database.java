package com.example.root.statistic.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by root on 3/6/17.
 */

public class Database extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Apu";
    private static Database sInstance;

    public static synchronized Database getInstance(Context context){
        // Use the application context, which will ensure that you don't accidentally leak an Activity's context.
        if (sInstance == null) {
            sInstance = new Database(context.getApplicationContext());
        }
        return sInstance;
    }

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public Database(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        createTables(db);
    }

    public void createTables(SQLiteDatabase db){}
    public void dropTables(SQLiteDatabase db){}

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        dropTables(db);
        this.onCreate(db);
    }
}
