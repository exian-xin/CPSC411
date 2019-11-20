package com.example.homework2;

public class course {

    //Instance variables
    String CourseID;
    String Grade;

    //Constructor
    public course(String CourseID, String Grade){
        this.CourseID = CourseID;
        this.Grade = Grade;
    }

    //Getters
    public String CourseID(){
        return CourseID;
    }

    public String Grade(){
        return Grade;
    }

    //Setters
    public void setCourseID(String CourseID){
        this.CourseID = CourseID;
    }

    public void setGrade(String Grade){
        this.Grade = Grade;
    }

}
