package com.example.myapplication;

public class Subject {
    String name;
    String description;
    int subjectID;
    int image;
    public Subject(int subjectID, String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.subjectID = subjectID;
        this.image = image;
    }
    public int getID(){
        return subjectID;
    }
}
