package com.fju.guass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random =new Random();
    int g =random.nextInt(10)+1;
    int min=1,max=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = findViewById(R.id.b_send);
    }
    public void guass(View view){
        EditText ednumber = findViewById(R.id.ed_number);
        int n =Integer.parseInt(ednumber.getText().toString());
       /* if(g<number){

            Toast.makeText(MainActivity.this, "小一點", Toast.LENGTH_SHORT).show();
        }*/
        if(n>=max){

            Toast.makeText(MainActivity.this, "請再次輸入:"+min+"~"+max, Toast.LENGTH_SHORT).show();
        }
        if(n<=min){

            Toast.makeText(MainActivity.this, "請再次輸入:"+min+"~"+max, Toast.LENGTH_SHORT).show();
        }

        if(n==g){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }
        while (n>min&n<max&&n<g){
            min= n;
           Toast.makeText(this,"大 一點",Toast.LENGTH_SHORT).show();
            TextView numbermin = findViewById(R.id.number_min);
            //String s =String.valueOf(n);
            numbermin.setText(Integer.toString(n));
            break;
        }
        while (n>min&n<max&&n>g){
            max= n;
            Toast.makeText(this,"小 一點",Toast.LENGTH_SHORT).show();
            TextView numbermax = findViewById(R.id.number_max);
            //String s =String.valueOf(n);
           numbermax.setText(Integer.toString(n));
            break;
        }
      /*  if (number>g){
            max = number;
            new  AlertDialog.Builder(this)
                    .setMessage("請輸入"+min+"~"+max)
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }
        if(number<g){
            min =number;

            new  AlertDialog.Builder(this)
                    .setMessage("請輸入"+min+"~"+max)
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }*/
    }}
