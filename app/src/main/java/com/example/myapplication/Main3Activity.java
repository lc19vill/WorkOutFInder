package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {
    public static String Experience;

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        if ((button =findViewById(R.id.button6)) != null){
            button =findViewById(R.id.button6);
            Experience = "N";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity3();
                }
            });
        }
        if ((button =findViewById(R.id.button7)) != null){
            button =findViewById(R.id.button7);
            Experience = "B";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity3();
                }
            });
        }
        if ((button =findViewById(R.id.button8)) != null){
            button =findViewById(R.id.button8);
            Experience = "I";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity3();
                }
            });
        }
        if ((button =findViewById(R.id.button9)) != null){
            button =findViewById(R.id.button9);
            Experience = "E";
            button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    openActivity3();
                }
            });
        }

    }
    public void openActivity3(){
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
