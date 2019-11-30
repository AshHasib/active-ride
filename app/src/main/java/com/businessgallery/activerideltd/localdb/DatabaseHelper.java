package com.businessgallery.activerideltd.localdb;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.businessgallery.activerideltd.model.User;

public class DatabaseHelper extends SQLiteOpenHelper {


    private static final String DBNAME = "ACTIVERIDE_DB";

    public DatabaseHelper(@Nullable Context context) {
        super(context,DBNAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String SQL = "CREATE TABLE USER (NAME TEXT, EMAIL TEXT, PHONENUMBER TEXT, PASSWORD TEXT);";
        db.execSQL(SQL);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


    public void addUser(User user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("NAME", user.getName());
        values.put("EMAIL", user.getEmail());
        values.put("PHONE", user.getPhoneNumber());
        values.put("PASSWORD", user.getPassword());

        db.insert("USER", null, values);
        db.close();
    }


    public void clearUser() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM USER;");
        db.close();
    }


}
