package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class studentList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_list_lv);

        ListView student_lv = findViewById(R.id.student_list_lv_id);
        studentListAdpt studentAdpt = new studentListAdpt();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.add_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add) {
            Intent intent = new Intent(this, addCourse.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    public void addStudent(String firstName, String lastName, String CWID){
        student newStudent = new student(firstName, lastName, CWID);
        ArrayList<student> studentList = database.getInstance().getStudentList();

        if (studentList == null){
            studentList = new ArrayList<>();
        }

        studentList.add(newStudent);
        database.getInstance().setStudentList(studentList);
    }

}
