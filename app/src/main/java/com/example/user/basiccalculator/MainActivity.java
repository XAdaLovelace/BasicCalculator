package com.example.user.basiccalculator;

import android.app.Activity;
import android.content.Intent;
import android.graphics.SumPathEffect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import java.util.Scanner;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int a, b, c = 0;
    String st1 = "n", st2 = "nn", st3 = "nnn", st4 = "nX";
    Button btnPlus, btnDivide, btnMinus, btnMulti, AC, btnEqual, CRDTS;
    EditText VIEW;
    Double VAL = 0.0;
    Double Sum = 0.0;
    Double VAL2 = 0.0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnEqual = (Button) findViewById(R.id.btnEqual);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMulti = (Button) findViewById(R.id.btnMulti);
        AC = (Button) findViewById(R.id.AC);
        CRDTS = (Button) findViewById(R.id.CRDTS);
        VIEW = (EditText) findViewById(R.id.VIEW);
        Scanner in = new Scanner(System.in);
    }
    public void Addition(View view){
        String getValAdd = VIEW.getText().toString();
        VAL = Double.parseDouble(getValAdd);
        VIEW.setText("");
        btnEqual.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String getValAdd = VIEW.getText().toString();
                        VAL2 = Double.parseDouble(getValAdd);
                        Sum = VAL+VAL2;
                        VIEW.setText(String.valueOf(Sum));
                        VAL2=VAL;
                        VAL=0.0;
                    }
                });
    }
    public void Multiplication(View view){
        String getValAdd = VIEW.getText().toString();
        VAL = Double.parseDouble(getValAdd);
        VIEW.setText("");
        btnEqual.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String getValAdd = VIEW.getText().toString();
                        VAL2 = Double.parseDouble(getValAdd);
                        Sum = VAL*VAL2;
                        VIEW.setText(String.valueOf(Sum));
                        VAL2=VAL;
                        VAL=0.0;
                    }
                });
    }
    public void Subtraction(View view){
        String getValAdd = VIEW.getText().toString();
        VAL = Double.parseDouble(getValAdd);
        VIEW.setText("");
        btnEqual.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String getValAdd = VIEW.getText().toString();
                        VAL2 = Double.parseDouble(getValAdd);
                        Sum = VAL-VAL2;
                        VIEW.setText(String.valueOf(Sum));
                        VAL2=VAL;
                        VAL=0.0;
                    }
                });
    }
    public void Division(View view){
        String getValAdd = VIEW.getText().toString();
        VAL = Double.parseDouble(getValAdd);
        VIEW.setText("");
        btnEqual.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String getValAdd = VIEW.getText().toString();
                        VAL2 = Double.parseDouble(getValAdd);
                        if(VAL2!=0) {
                            Sum = VAL / VAL2;
                            VIEW.setText(String.valueOf(Sum));
                            VAL2 = VAL;
                            VAL = 0.0;
                        }
                        else{VIEW.setText("Dividing by zero is not defined ~ ERROR");
                            VAL2=0.0;
                            Sum=0.0;
                            VAL=0.0;  }
                    }
                });
    }
    public void AC(View view){
        VIEW.setText("");
        VAL2=0.0;
        Sum=0.0;
        VAL=0.0;

    }
    public void goTo(View view){


        Intent t = new Intent(this, secActivity.class);
        t.putExtra("n", VIEW.getText().toString());
        startActivity(t);




    }



}
