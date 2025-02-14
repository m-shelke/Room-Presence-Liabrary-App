package com.example.roompresenceliabraryapp;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = ExpenseModel.class,exportSchema = false,version = 1)
public abstract class DatabaseHelper extends RoomDatabase {

    private static final String DB_NAME = "expense_table";
    private static DatabaseHelper databaseHelper;

    public static synchronized DatabaseHelper getDB(Context context){

        if (databaseHelper == null){

            databaseHelper = Room.databaseBuilder(context, DatabaseHelper.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }

        return databaseHelper;
    }

    public abstract DAO dao();
}
