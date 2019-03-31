package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myapplication.Main2Activity.Goals;
import static com.example.myapplication.Main3Activity.Experience;
import static com.example.myapplication.Main4Activity.timePeriod;
import static com.example.myapplication.Workout.*;
import static com.example.myapplication.MainActivity.WorkoutFinder;

public class Main5Activity extends AppCompatActivity {
    public String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        TextView textView = (TextView) findViewById(R.id.textView3);
        TextView textView2 = (TextView) findViewById(R.id.textView4);
        TextView textView3 = (TextView) findViewById(R.id.textView5);
        TextView textView4 = (TextView) findViewById(R.id.textView6);
        TextView textView5 = (TextView) findViewById(R.id.textView7);
        TextView textView6 = (TextView) findViewById(R.id.textView8);
        TextView textView7 = (TextView) findViewById(R.id.textView9);
        TextView textView8 = (TextView) findViewById(R.id.textView10);
        TextView textView9 = (TextView) findViewById(R.id.textView11);
        TextView textView10 = (TextView) findViewById(R.id.textView12);

        Workout work = new Workout(timePeriod, Experience, Goals);
        string = work.getWorkout1();
        textView.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 1));

        string = work.getWorkout2();
        textView2.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 2));

        string = work.getWorkout3();
        textView3.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 1));

        string = work.getWorkout4();
        textView4.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 -1));

        string = work.getWorkout5();
        textView5.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 1));

        string = work.getWorkout6();
        textView6.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 ));

        string = work.getWorkout7();
        textView7.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 - 1));

        string = work.getWorkout8();
        textView8.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 3));

        string = work.getWorkout9();
        textView9.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5));

        string = work.getWorkout10();
        textView10.setText(string + String.valueOf(timePeriod/15) + "x" + String.valueOf(timePeriod/5 + 1));

    }


}


