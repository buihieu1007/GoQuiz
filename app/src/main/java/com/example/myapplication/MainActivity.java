package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        if (!sharedPref.contains("score"))  editor.putInt("score", 0);
        editor.commit();
        Button button = findViewById(R.id.buttonStart);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}