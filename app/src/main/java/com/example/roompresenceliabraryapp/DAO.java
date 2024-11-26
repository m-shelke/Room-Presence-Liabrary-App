package com.example.roompresenceliabraryapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface DAO {

//    Query for fetching or selecting data form the entity
    @Query("select * from expense_table")
    List<ExpenseModel> getAllExpenses();

//    inserting data in the entity
    @Insert
    void addTxs(ExpenseModel expenseModel);

    //    updating data in the entity
    @Update
    void updateTxs(ExpenseModel expenseModel);

    //    deleting data from the entity
    @Delete
    void deleteTxs(ExpenseModel expenseModel);
}
