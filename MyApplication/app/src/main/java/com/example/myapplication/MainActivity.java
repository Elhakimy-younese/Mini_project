package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1 ;
    EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            phone =  findViewById(R.id.editTextPhone);
            btn1 = findViewById(R.id.ok);
         btn1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                 builder.setTitle("Greatings").setMessage("salam").show();

             }
         });
    }
}