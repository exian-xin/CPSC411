package com.example.homework2;

import java.util.ArrayList;

public class database {

    private ArrayList<student> studentList;
    private static final database instance = new database();

    //Constructor
    public database() {

    }

    //Getter and setter
    public static database getInstance(){
        return instance;
    }

    public ArrayList<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<student>studentList){
        this.studentList = studentList;
    }
}
