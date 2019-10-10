package com.example.assignment2;

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

        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        int userNum = Integer.parseInt(editText2.getText().toString());
        isBetween(userNum);

    }

    public void upClick(View v) {
        Log.i("info:","It worked");
    }

    public void isBetween(int num) {
        if (num < 1 || num >  10) {
            Toast.makeText(this, "Input a valid number between 1 and 10.",Toast.LENGTH_SHORT).show();
        }

    }
}
