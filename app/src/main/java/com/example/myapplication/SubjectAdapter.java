package com.example.myapplication;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class SubjectAdapter extends BaseAdapter {
    final ArrayList<Subject> listSubject;
    SubjectAdapter(ArrayList<Subject> listSubject)
    {
        this.listSubject = listSubject;
    }
    @Override
    public int getCount() {
        return listSubject.size();
    }

    @Override
    public Object getItem(int pos) {
        return listSubject.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return listSubject.get(pos).subjectID;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        View viewProduct;
        if (convertView == null) {
            viewProduct = View.inflate(parent.getContext(), R.layout.activity_subject_list_view, null);
        } else viewProduct = convertView;

        //Bind sữ liệu phần tử vào View
        Subject subject = (Subject) getItem(pos);
        ((TextView) viewProduct.findViewById(R.id.SubjectName)).setText(String.format("%s", subject.name));
        ((TextView) viewProduct.findViewById(R.id.SubjectDescription)).setText(String.format("%s", subject.description));
        ((ImageView) viewProduct.findViewById(R.id.SubjectImg)).setImageResource(subject.image);

        return viewProduct;
    }
}
