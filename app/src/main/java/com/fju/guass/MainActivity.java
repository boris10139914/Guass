package com.fju.guass;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random =new Random();
    int g =random.nextInt(10)+1;
    int g1 =5;
    int min=1,max=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = findViewById(R.id.b_send);
    }
    public void guass(View view){
        EditText ednumber = findViewById(R.id.ed_number);
        int number =Integer.parseInt(ednumber.getText().toString());
       /* if(g<number){

            Toast.makeText(MainActivity.this, "小一點", Toast.LENGTH_SHORT).show();
        }*/
        if(g>number){
            min = number;
            Toast.makeText(MainActivity.this, "請輸入:"+min+"~"+max, Toast.LENGTH_SHORT).show();
        }
        if(g<number){
            max = number;
            Toast.makeText(MainActivity.this, "請輸入:"+min+"~"+max, Toast.LENGTH_SHORT).show();
        }

        if(number==g){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
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
