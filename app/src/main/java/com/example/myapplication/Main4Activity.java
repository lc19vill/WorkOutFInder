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
import android.widget.Toast;
import static com.example.myapplication.MainActivity.WorkoutFinder;

public class Main4Activity extends AppCompatActivity {
    public static int timePeriod;
    public String email, intensity, name;


    EditText nameInput;
    EditText emailInput;
    EditText timePeriodInput;
    EditText intensityInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        nameInput = (EditText) findViewById(R.id.name);
        emailInput = (EditText) findViewById(R.id.email);
        timePeriodInput = (EditText) findViewById(R.id.timePeriod);
        intensityInput = (EditText) findViewById(R.id.intensity);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                name = nameInput.getText().toString();
                timePeriod = Integer.valueOf(timePeriodInput.getText().toString());
                email = emailInput.getText().toString();
                intensity = intensityInput.getText().toString();


//                showText(name);
//                showText(email);
//                showText(String.valueOf(timePeriod));
//                showText(intensity);
//                showText(WorkoutFinder);

                openActivity5();
            }
        });
    }

    public void openActivity5(){
        Intent intent = new Intent(this,Main5Activity.class);
        startActivity(intent);
    }

    public void showText(String text){
        Toast.makeText(Main4Activity.this, text, Toast.LENGTH_SHORT).show();
    }
}
