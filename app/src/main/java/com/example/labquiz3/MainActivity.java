package com.example.labquiz3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        student objStudent=new student("waleed","331");


        Gson objGson= new Gson();



        String mystring="{\"name\":\"waleed\" , \"roll\":\"331\"}";

        student deserializtionStudent=objGson.fromJson(mystring,student.class);
    }
}

