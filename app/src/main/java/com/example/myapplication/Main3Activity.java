package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static com.example.myapplication.MainActivity.WorkoutFinder;

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
                    openActivity4();
                }
            });
        }

        if ((button =findViewById(R.id.button7)) != null){
            button =findViewById(R.id.button7);
            Experience = "B";
            button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openActivity4();
                    }
                });
        }
        if ((button =findViewById(R.id.button8)) != null){
            button =findViewById(R.id.button8);
            Experience = "I";
            button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openActivity4();
                    }
                });

        }
        if ((button =findViewById(R.id.button9)) != null){
            button =findViewById(R.id.button9);
            Experience = "E";
                button.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        openActivity4();
                    }
                });
        }

    }
    public void openActivity4(){
        Intent intent2 = new Intent(this,Main4Activity.class);
        startActivity(intent2);
    }
}
