package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class QuestionAdapter extends BaseAdapter {
    final ArrayList<Question> listQuestion;
    QuestionAdapter(ArrayList<Question> listQuestion)
    {
        this.listQuestion = listQuestion;
    }
    @Override
    public int getCount() {
        return listQuestion.size();
    }

    @Override
    public Object getItem(int pos) {
        return listQuestion.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return listQuestion.get(pos).questionID;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        View viewQuestion;
        if (convertView == null) {
            viewQuestion = View.inflate(parent.getContext(), R.layout.activity_question_list_view, null);
        } else viewQuestion = convertView;

        //Bind sữ liệu phần tử vào View
        Question question = (Question) getItem(pos);
        ((TextView) viewQuestion.findViewById(R.id.questionText)).setText(String.format("%s", question.getQuestionText()));
        return viewQuestion;
    }
}
