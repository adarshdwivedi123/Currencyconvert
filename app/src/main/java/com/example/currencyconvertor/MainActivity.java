package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {
    Button euro,pound,dollar,yen,dinar,bitcoin,rubel,ausdollar,candollar;
EditText editText;
TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        euro=findViewById(R.id.euro);
        pound=findViewById(R.id.pound);
        dollar=findViewById(R.id.dollar);
        yen=findViewById(R.id.yen);
        dinar=findViewById(R.id.dinar);
        bitcoin=findViewById(R.id.bitcoin);
        rubel=findViewById(R.id.rubel);
        ausdollar=findViewById(R.id.ausss);
        candollar=findViewById(R.id.can);
        editText=findViewById(R.id.editText);
        textView=findViewById(R.id.textView);
        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String euro=editText.getText().toString();
                if(TextUtils.isEmpty(euro))  //textUtils  class check directly this is empty or not
                {
                        editText.setError("Empty User Input");   //here we create error message if it is not write any think then click it give eroor  red color

                }
                else
                {
                   double n,k;
                    n=Double.parseDouble(euro); //so here we convert string to double
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();   //format is class  the format  the class the way u want to be
                    k=n*0.012;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here  whatever  value comeit give only  decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }
            }
        });
        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dollar=editText.getText().toString();
                if(TextUtils.isEmpty(dollar))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(dollar);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.013;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pound=editText.getText().toString();
                if(TextUtils.isEmpty(pound))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(pound);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.010;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String yen=editText.getText().toString();
                if(TextUtils.isEmpty(yen))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(yen);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*1.41;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String dinar=editText.getText().toString();
                if(TextUtils.isEmpty(dinar))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(dinar);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.0040;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bitcoin=editText.getText().toString();
                if(TextUtils.isEmpty(bitcoin))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(bitcoin);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.0040;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rubel=editText.getText().toString();
                if(TextUtils.isEmpty(rubel))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(rubel);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.92;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  ausdollar=editText.getText().toString();
                if(TextUtils.isEmpty( ausdollar))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble( ausdollar);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.019 ;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });
        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String    candollar=editText.getText().toString();
                if(TextUtils.isEmpty(candollar))  //textUtils check whether this is empty or not
                {
                    editText.setError("Empty User Input");

                }
                else
                {
                    double n,k;
                    n=Double.parseDouble(candollar);
                    textView.setText(null);   //that means when user then we have toclear our setetext  so that user can enter ne wvalue and display a result
                    Formatter formatter=new Formatter();
                    k=n*0.018;
                    DecimalFormat numberFormat=new DecimalFormat("#.000");  //here want to decimal only two parts
                    textView.setText(""+numberFormat.format(k));

                }

            }
        });

    }
}