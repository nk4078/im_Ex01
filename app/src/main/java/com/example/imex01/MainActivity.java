package com.example.imex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    ImageView iM;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1= (Button) findViewById(R.id.btn1);
        iM = (ImageView) findViewById(R.id.iM);


    }

    public void clicked(View view) {
        int num = 0;
        num = rnd.nextInt(3)+1;
        if (num==1){
            iM.setImageResource(R.drawable.num1);
        }
        if (num==2){
            iM.setImageResource(R.drawable.num2);
        }
        if (num==3){
            iM.setImageResource(R.drawable.num3);
        }
    }
}