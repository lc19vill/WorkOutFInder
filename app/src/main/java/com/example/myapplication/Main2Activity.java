package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public static String Goals;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if ((button =findViewById(R.id.button3)) != null){
            button =findViewById(R.id.button3);
            Goals = "LW";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity2();
                }
            });
        }
        if ((button =findViewById(R.id.button4)) != null){
            button =findViewById(R.id.button4);
            Goals = "B";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity2();
                }
            });
        }
        if ((button =findViewById(R.id.button5)) != null){
            button =findViewById(R.id.button5);
            Goals = "SF";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity2();
                }
            });
        }
    }

    public void openActivity2(){
       Intent intent = new Intent(this,Main3Activity.class);
        startActivity(intent);
    }
}
