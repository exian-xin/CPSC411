package com.example.homework2;

import java.util.ArrayList;

public class student {

    //Instance variables
    String FirstName;
    String LastName;
    String CWID;
    ArrayList<student> studentList;


    //Constructor
    public student(String FirstName, String LastName, String CWID){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.CWID = CWID;
    }

    //Getters
    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }

    public String getCWID(){
        return CWID;
    }

    //Setters
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName){
        this.LastName = LastName;
    }

    public void setCWID(String CWID) {
        this.CWID = CWID;
    }
}
