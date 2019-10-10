package com.example.assignment2c;

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

    int count = 0;

    public int getNum() {
        EditText enterNumber = findViewById(R.id.editText);
        return Integer.parseInt(enterNumber.getEditableText().toString());
    }

    public void downClick(View a) {
        int yourNum = getNum();
        count = shouldCountDown(yourNum,count);

        if (count != 0) {
            Toast.makeText(this,"" + (yourNum + count),Toast.LENGTH_SHORT).show();
        }

    }

    public void upClick(View a){
        int yourNum = getNum();
        count = shouldCountUp(yourNum,count);

        if (count != 0) {
            Toast.makeText(this,"" + (yourNum + count),Toast.LENGTH_SHORT).show();
        }
    }

    public int shouldCountDown(int number,int num) {
        if (number + num - 1 >= 0) {
            return num - 1;
        }
        else {
            Toast.makeText(this,"Enter a number between 1 and 10.",Toast.LENGTH_SHORT).show();
            return 0;
        }
    }

    public int shouldCountUp(int number, int num) {
        if (number + num + 1 <=10) {
            return num + 1;
        }
        else {
            Toast.makeText(this,"Enter a number between 1 and 10",Toast.LENGTH_SHORT).show();
            return 0;
        }
    }


}
