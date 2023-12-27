package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.switchmaterial.SwitchMaterial;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ListView myList;
    ArrayList<Subject> SubjectArray;
    SubjectAdapter subjectAdapter;
    Button button;
    SwitchMaterial switch1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE);
        int score = sharedPref.getInt("score",0);
        TextView userScore = findViewById(R.id.user_score);
        userScore.setText(String.valueOf(score) + " pts");
        myList = (ListView) findViewById(R.id.SubjectList);
        SubjectArray = new ArrayList<>();
        SubjectArray.add(new Subject(1, "Địa lý", "Các câu hỏi về vùng đất, địa hình, dân cư và các hiện tượng trên trái đất", R.drawable.geography_icon));
        SubjectArray.add(new Subject(2, "Toán học", "Các câu hỏi về toán học và lý thuyết số", R.drawable.math_icon));
        SubjectArray.add(new Subject(3, "Lịch sử", "Các câu hỏi về sự kiện lịch sử và nhân vật nổi tiếng", R.drawable.history_icon));
        SubjectArray.add(new Subject(4, "Hóa học", "Các câu hỏi về các chất, phản ứng hóa học và nguyên tố", R.drawable.chemistry_icon));
        SubjectArray.add(new Subject(5, "Vật lý", "Các câu hỏi về các đối tượng và hiện tượng vật lý", R.drawable.physics_icon));
        SubjectArray.add(new Subject(6, "Sinh học", "Các câu hỏi về sinh học và sự sống", R.drawable.biology_icon));
        subjectAdapter = new SubjectAdapter(SubjectArray);
        myList = findViewById(R.id.SubjectList);
        myList.setAdapter(subjectAdapter);
        switch1 = findViewById(R.id.switch_1);
        button  = findViewById(R.id.question_list);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Subject subject = (Subject) subjectAdapter.getItem(position);
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("SubjectID",subject.getID());
                if (switch1.isChecked()) intent.putExtra("hardMode",1);
                else intent.putExtra("hardMode",0);
                startActivity(intent);
            }
        });
        button.setOnClickListener(view -> {
            Intent intent1 = new Intent(MainActivity2.this, MainActivity5.class);
            startActivity(intent1);
        });
    }
}