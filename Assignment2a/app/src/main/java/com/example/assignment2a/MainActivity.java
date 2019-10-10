package com.example.assignment2a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int number = 0;
        int valid = 0;


    }

    public void countUp(View v) {
        EditText a = findViewById(R.id.editText);
        int arg = Integer.parseInt(a.getEditableText().toString());
        boolean isBetween = oneOrTen(arg);


        if (isBetween == true) {
            arg++;
            Toast.makeText(this,""+arg,Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Enter a number between 1 and 10",Toast.LENGTH_SHORT).show();
        }

    }

    public void countDown(View v) {
        EditText a = findViewById(R.id.editText);
        int arg = Integer.parseInt(a.getEditableText().toString());
        boolean isBetween = oneOrTen(arg);

        if (isBetween == true) {
            arg--;
            Toast.makeText(this,"" + arg,Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Enter a number between 1 and 10",Toast.LENGTH_SHORT).show();
        }
    }


    public boolean oneOrTen(int v) {
        if (v + verify() > 0) {
            return true;
        }
    }



}
