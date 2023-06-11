package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView sign = findViewById(R.id.tv2);
    EditText email= findViewById(R.id.gmail);
    EditText password = findViewById(R.id.Password);
    Button btn = findViewById(R.id.bsi);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
