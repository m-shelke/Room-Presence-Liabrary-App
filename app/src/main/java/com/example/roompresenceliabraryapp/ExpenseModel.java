package com.example.roompresenceliabraryapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

//                            Creating Entity here
//table name
@Entity(tableName = "expense_table")
public class ExpenseModel {

//    define primary key
    @PrimaryKey(autoGenerate = true)
    int id;
//    column of the entity
    @ColumnInfo(name = "title")
    String title;
//    row of the entity
    @ColumnInfo(name = "amount")
    String amount;


//    Main Constructor
    public ExpenseModel(int id, String title, String amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
    }

//    Constructor for getting the id of the entity
    @Ignore
    public ExpenseModel(String title, String amount) {
        this.title = title;
        this.amount = amount;
    }
}






















