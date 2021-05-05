package com.shubh.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHandler Handler = new DbHandler(this,"shubh", null ,1 );
        Handler.addEmployee(new Employee(1,"shubh",99.9));
        Handler.getEmployee(1);
        Handler.close();

    }
}