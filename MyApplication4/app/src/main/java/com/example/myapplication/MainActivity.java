package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}




    public void countUp(View V) {

        boolean p = false;
        p = oneOrTen(arg);

        if (p = true) {
            do {
                arg++;
                Toast.makeText(this, arg, Toast.LENGTH_SHORT).show();
            } while (arg <= 10);
        }

    }