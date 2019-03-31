package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static String WorkoutFinder;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (((button =findViewById(R.id.button)) != null)){
            button =findViewById(R.id.button);
            WorkoutFinder = "QS";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity1();
                }
            });
        }

    }
    public void openActivity1(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
