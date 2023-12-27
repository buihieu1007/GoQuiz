package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Intent intent = getIntent();
        String question = intent.getStringExtra("question");
        String ans1 = intent.getStringExtra("ans1");
        String ans2 = intent.getStringExtra("ans2");
        String ans3 = intent.getStringExtra("ans3");
        String ans4 = intent.getStringExtra("ans4");
        String correct = intent.getStringExtra("correct");
        Boolean isHard = intent.getBooleanExtra("isHard", true);
        TextView questionText = findViewById(R.id.question);
        TextView ans1Text = findViewById(R.id.ans1);
        TextView ans2Text = findViewById(R.id.ans2);
        TextView ans3Text = findViewById(R.id.ans3);
        TextView ans4Text = findViewById(R.id.ans4);
        TextView hardSymbol = findViewById(R.id.isHard);
        TextView correctAns = findViewById(R.id.correctAns);
        questionText.setText(question);
        ans1Text.setText(ans1);
        ans2Text.setText(ans2);
        ans3Text.setText(ans3);
        ans4Text.setText(ans4);
        correctAns.setText("Đáp án đúng: "+ correct);
        if (isHard == true)
        {
            hardSymbol.setText("Khó");
            hardSymbol.setBackground(ContextCompat.getDrawable(MainActivity6.this,R.drawable.ic_level_background_hard));
        }
        else {
            hardSymbol.setText("Dễ");
            hardSymbol.setBackground(ContextCompat.getDrawable(MainActivity6.this,R.drawable.ic_level_background_easy));
        }
    }
}