  package com.example.hello;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_SHORT;

  public class MainActivity extends AppCompatActivity{
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9;
    private TextView text10;
    private TextView text11;
    private TextView text12;
    private TextView text13;
    private Button button22;
    private Button button23;
    private Button button24;
    private String s1="";
    private String s2="";
    private String s3="";
    private String s4="";
    private String s5="";
    private String s6="";
    private String s7="";
    private String s8="";
    private String s9="";
    private String s10="";
    private String s11="";
    private String s12="";

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button22=findViewById(R.id.button22);
        Button button23=findViewById(R.id.button23);
        Button button24=findViewById(R.id.button24);
        final EditText edit_text1=findViewById(R.id.edit_text1);
        final EditText edit_text2=findViewById(R.id.edit_text2);
        final EditText edit_text3=findViewById(R.id.edit_text3);
        final TextView text2=findViewById(R.id.text2);
        final TextView text3=findViewById(R.id.text3);
        final TextView text4=findViewById(R.id.text4);
        final TextView text6=findViewById(R.id.text6);
        final TextView text7=findViewById(R.id.text7);
        final TextView text8=findViewById(R.id.text8);
        final TextView text10=findViewById(R.id.text10);
        final TextView text11=findViewById(R.id.text11);
        final TextView text12=findViewById(R.id.text12);
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp=new String();
                s1=edit_text1.getText().toString();
                s2="dm:";
                s3="cm:";
                s4="km:";
                if(s1.length()!=0){
                    for(int i=0;i<=s1.length()-1;i++){
                        char ch=s1.charAt(i);
                        String s=ch+"";
                        if(Character.isDigit(ch) || ch=='.'){
                                temp+=s;
                                double a=Double.valueOf(temp);
                                double b=a*10;
                                double c=a*100;
                                double d=a/1000;
                                text2.setText(s2+"                    "+b);
                                text3.setText(s3+"                    "+c);
                                text4.setText(s4+"                    "+d);
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Input Error!",LENGTH_SHORT).show();
                        }
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Please input Number!",LENGTH_SHORT).show();
                }

            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss = new String();
                s5 = edit_text2.getText().toString();
                s6 = "cm3:";
                s7 = "dm3:";
                s8 = "km3:";
                if (s5.length() != 0) {
                    for (int i = 0; i <= s5.length() - 1; i++) {
                        char ch = s5.charAt('i');
                        String s = ch + "";
                        if (Character.isDigit(ch) || ch == '.') {
                            ss += s;
                            double a = Double.valueOf(ss);
                            double e = a * 1000000;
                            double f = a * 1000;
                            double g = a / 1000000000;
                            text6.setText(s6 + e);
                            text7.setText(s7 + f);
                            text8.setText(s8 + g);
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Input Error!", LENGTH_SHORT).show();
                        }
                    }
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please input Number!", LENGTH_SHORT).show();
                }
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 String temp=new String();
                 s9=edit_text3.getText().toString();
                 s10="二进制:";
                 s11="八进制:";
                 s12="十六进制:";
                 if(s9.length()!=0){
                     for(int i=0;i<=s9.length()-1;i++){
                         char ch= s10.charAt(i);
                         String s=ch+"";
                         if(Character.isDigit(ch)){
                             temp=temp+s;
                             int a=Integer.valueOf(temp);
                             String b=Integer.toBinaryString(10);
                             String d=Integer.toHexString(10);
                             String c=Integer.toOctalString(10);
                             text10.setText(s10+b);
                             text11.setText(s11+c);
                             text12.setText(s12+d);
                         }
                         else  Toast.makeText(getApplicationContext(),"Input Error!",LENGTH_SHORT).show();
                     }
                 }
                 else Toast.makeText(getApplicationContext(),"Please input Number!",LENGTH_SHORT).show();
            }
        });
    }
}

