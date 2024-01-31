package com.example.calculator;

import static java.lang.Math.abs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bminus,bmul,bdiv,bmod,bclr,ballclr,beql,bpoint;
    TextView t1,t2,t3;
    int cal = 0;
    double no1,no2;

    String str1,str2,str3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.num1);
        b2 = (Button) findViewById(R.id.num2);
        b3 = (Button) findViewById(R.id.num3);
        b4 = (Button) findViewById(R.id.num4);
        b5 = (Button) findViewById(R.id.num5);
        b6 = (Button) findViewById(R.id.num6);
        b7 = (Button) findViewById(R.id.num7);
        b8 = (Button) findViewById(R.id.num8);
        b9 = (Button) findViewById(R.id.num9);
        b0 = (Button) findViewById(R.id.zero);

        badd = (Button) findViewById(R.id.plus);
        bminus = (Button) findViewById(R.id.min);
        bmul = (Button) findViewById(R.id.mul);
        bdiv = (Button) findViewById(R.id.div);
        bmod = (Button) findViewById(R.id.mod);


        bclr = (Button) findViewById(R.id.clr);
        ballclr = (Button) findViewById(R.id.allclr);
        beql = (Button) findViewById(R.id.equal);
        bpoint = (Button) findViewById(R.id.point);

        t1 = (TextView) findViewById(R.id.no01);
        t2 = (TextView) findViewById(R.id.no02);
        t3 = (TextView) findViewById(R.id.no03);


        str1 = "";
        str2 ="";
        str3 = "";

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "1";
                t2.setText(str2);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "2";
                t2.setText(str2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "3";
                t2.setText(str2);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "4";
                t2.setText(str2);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "5";
                t2.setText(str2);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "6";
                t2.setText(str2);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "7";
                t2.setText(str2);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "8";
                t2.setText(str2);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "9";
                t2.setText(str2);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += "0";
                t2.setText(str2);
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!str2.isEmpty()){
                    str3 = "+";
                    str1 =  str2;
                    str2 = "";
                    t1.setText(str1);
                    t2.setText(str2);
                    t3.setText(str3);
                    cal = 1;
                }
                else{
                    str3 = "";
                    t3.setText(str3);
                }
            }
        });

        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!str2.isEmpty()){
                    str3 = "-";
                    str1 =  str2;
                    str2 = "";
                    t1.setText(str1);
                    t2.setText(str2);
                    t3.setText(str3);
                    cal = 2;
                }
                else{
                    str3 = "";
                    t3.setText(str3);
                }

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!str2.isEmpty()) {
                    str3 = "x";
                    str1 = str2;
                    str2 = "";
                    t1.setText(str1);
                    t2.setText(str2);
                    t3.setText(str3);
                    cal = 3;
                } else {
                    str3 = "";
                    t3.setText(str3);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!str2.isEmpty()){
                    str3 = "/";
                    str1 =  str2;
                    str2 = "";
                    t1.setText(str1);
                    t2.setText(str2);
                    t3.setText(str3);
                    cal = 4;
                }
                else{
                    str3 = "";
                    t3.setText(str3);
                }
            }
        });bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!str2.isEmpty()){
                    str3 = "%";
                    str1 =  str2;
                    str2 = "";
                    t1.setText(str1);
                    t2.setText(str2);
                    t3.setText(str3);
                    cal = 5;
                }
                else{
                    str3 = "";
                    t3.setText(str3);
                }
            }
        });

        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cal == 1) {
                    no1 = Double.parseDouble(str1);
                    no2 = Double.parseDouble(str2);
                    no2 += no1;
                    str2 = new String(String.valueOf(no2));
                    t2.setText(str2);
                    str1 = "";
                    str3 = "";
                    t1.setText(str1);
                    t3.setText(str3);

                }

                else if (cal == 2) {
                    no1 = Double.parseDouble(str1);
                    no2 = Double.parseDouble(str2);
                    no2 -= no1;
                    //abs(no2);
                    str2 = new String(String.valueOf(no2));
                    t2.setText(str2);
                    str1 = "";
                    str3 = "";
                    t1.setText(str1);
                    t3.setText(str3);
                }
               else if (cal == 3) {
                    no1 = Double.parseDouble(str1);
                    no2 = Double.parseDouble(str2);
                    no2 *= no1;
                    str2 = new String(String.valueOf(no2));
                    t2.setText(str2);
                    str1 = "";
                    str3 = "";
                    t1.setText(str1);
                    t3.setText(str3);
                }

                else if (cal == 4) {
                    no1 = Double.parseDouble(str1);
                    no2 = Double.parseDouble(str2);
                    no2 /= no1;
                    str2 = new String(String.valueOf(no2));
                    t2.setText(str2);
                    str1 = "";
                    str3 = "";
                    t1.setText(str1);
                    t3.setText(str3);
                }
                else if( cal == 5){
                    no1 = Double.parseDouble(str1);
                    no2 = Double.parseDouble(str2);
                    no2 %= no1;
                    str2 = new String(String.valueOf(no2));
                    t2.setText(str2);
                    str1 = "";
                    str3 = "";
                    t1.setText(str1);
                    t3.setText(str3);
            }
                else if (str3.isEmpty() || str2.isEmpty() || str1 .isEmpty()){
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(MainActivity.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ballclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 ="";
                str1 ="";
                str3 ="";
                t1.setText(str1);
                t2.setText(str2);
                t3.setText(str3);
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                str2 ="";
                str1 ="";
                str3 ="";
                t1.setText(str1);
                t2.setText(str2);
                t3.setText(str3);
            }
        });

        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str2 += ".";
                t2.setText(str2);
            }
        });

    }
}