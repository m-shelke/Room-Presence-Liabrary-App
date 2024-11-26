package com.example.roompresenceliabraryapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewbinding.ViewBinding;

import com.example.roompresenceliabraryapp.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        DatabaseHelper databaseHelper = DatabaseHelper.getDB(this);


        binding.btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String edtitle = binding.edTitle.getText().toString();
                String edAmt = binding.edAmount.getText().toString();



                    databaseHelper.dao().addTxs(new ExpenseModel(edtitle, edAmt));

            }

        });

        ArrayList<ExpenseModel> arrayList = (ArrayList<ExpenseModel>) databaseHelper.dao().getAllExpenses();

        for (int i = 1; i<arrayList.size();i++){
            Log.d("DATA", "Title : "+ arrayList.get(i).title + "Amount : "+ arrayList.get(i).amount);
        }

    }
}