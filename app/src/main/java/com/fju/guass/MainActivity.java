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
    int g =random.nextInt(9)+1;
    int g1 =5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guass(View view){
        EditText ednumber = findViewById(R.id.ed_number);
        int number =Integer.parseInt(ednumber.getText().toString());
        if(number==g){
            new AlertDialog.Builder(this)
                    .setMessage("答對了")
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }if (number>g){
            new  AlertDialog.Builder(this)
                    .setMessage("小一點")
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }if(number<g){
            new  AlertDialog.Builder(this)
                    .setMessage("大一點")
                    .setTitle("結果")
                    .setNeutralButton("OK",null)
                    .show();
        }
    }
}
