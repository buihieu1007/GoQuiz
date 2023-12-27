package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    Intent intent1;
    TextView Score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        intent1 = getIntent();
        int score = intent1.getIntExtra("score" , 0);
        int rightAns = intent1.getIntExtra("rightAns", 0);
        Score = findViewById(R.id.userScore);
        Score.setText(String.valueOf(rightAns));
        SharedPreferences sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE);
        int score1 = sharedPref.getInt("score",0);
        score1 = score1 + score;
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("score", score1);
        editor.commit();
        Button done = findViewById(R.id.done);
        Button replay = findViewById(R.id.replay);
        Button share = findViewById(R.id.share);
        done.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity4.this, MainActivity.class);
            startActivity(intent);
        });
        replay.setOnClickListener(view -> {
            int subjectID = intent1.getIntExtra("SubjectID", 0);
            int isHard = intent1.getIntExtra("hardMode", 0);
            Intent intent = new Intent(MainActivity4.this, MainActivity3.class);
            intent.putExtra("SubjectID", subjectID);
            intent.putExtra("hardMode", isHard);
            startActivity(intent);
        });
        share.setOnClickListener(view ->{
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Điểm số của tôi trong GoQuiz là " + String.valueOf(score));
            startActivity(Intent.createChooser(shareIntent, "Share via"));
        });
    }
}