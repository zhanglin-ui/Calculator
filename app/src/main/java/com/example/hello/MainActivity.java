  package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


  public  class MainActivity extends AppCompatActivity implements OnClickListener {
      private Button button1;
      private Button button2;
      private Button button3;
      private Button button4;
      private Button button5;
      private Button button6;
      private Button button7;
      private Button button8;
      private Button button9;
      private Button button10;
      private Button Button11;
      private Button Button12;
      private Button button13;
      private Button button14;
      private Button button15;
      private Button button16;
      private Button button17;
      private Button button18;
      private Button button19;
      private Button button20;
      private Button button21;
      private TextView text;


      @Override
      public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.third_layout);
          Button button1 = (Button) findViewById(R.id.button1);
          Button button2 = (Button) findViewById(R.id.button2);
          Button button3 = (Button) findViewById(R.id.button3);
          Button button4 = (Button) findViewById(R.id.button4);
          Button button5 = (Button) findViewById(R.id.button5);
          Button button6 = (Button) findViewById(R.id.button6);
          Button button7 = (Button) findViewById(R.id.button7);
          Button button8 = (Button) findViewById(R.id.button8);
          Button button9 = (Button) findViewById(R.id.button9);
          Button button14 = (Button) findViewById(R.id.button14);
          Button button10 = (Button) findViewById(R.id.button10);
          Button button11 = (Button) findViewById(R.id.button11);
          Button button12 = (Button) findViewById(R.id.button12);
          Button button13 = (Button) findViewById(R.id.button13);
          Button button15 = (Button) findViewById(R.id.button15);
          Button button16 = (Button) findViewById(R.id.button16);
          Button button17 = (Button) findViewById(R.id.button17);
          Button button18 = (Button) findViewById(R.id.button18);
          Button button19 = (Button) findViewById(R.id.button19);
          Button button20 = (Button) findViewById(R.id.button20);
          Button button21 = (Button) findViewById(R.id.button21);
          final TextView text = (TextView) findViewById(R.id.text);
          button1.setOnClickListener(this);
          button2.setOnClickListener(this);
          button3.setOnClickListener(this);
          button4.setOnClickListener(this);
          button5.setOnClickListener(this);
          button6.setOnClickListener(this);
          button7.setOnClickListener(this);
          button8.setOnClickListener(this);
          button9.setOnClickListener(this);
          button10.setOnClickListener(this);
          button11.setOnClickListener(this);
          button12.setOnClickListener(this);
          button13.setOnClickListener(this);
          button14.setOnClickListener(this);
          button15.setOnClickListener(this);
          button16.setOnClickListener(this);
          button17.setOnClickListener(this);
          button18.setOnClickListener(this);
          button19.setOnClickListener(this);
          button20.setOnClickListener(this);
          button21.setOnClickListener(this);
      }

      @Override
      public void onClick(View view) {
          String ss = text.getText().toString();
          switch (view.getId()) {
              case R.id.button14:
                  ss += "0";
                  text.setText(ss);
                  break;
              case R.id.button1:
                  ss += "1";
                  text.setText(ss);
                  break;
              case R.id.button2:
                  ss += "2";
                  text.setText(ss);
                  break;
              case R.id.button3:
                  ss += "3";
                  text.setText(ss);
                  break;
              case R.id.button4:
                  ss += "4";
                  text.setText(ss);
                  break;
              case R.id.button5:
                  ss += "5";
                  text.setText(ss);
                  break;
              case R.id.button6:
                  ss += "6";
                  text.setText(ss);
                  break;
              case R.id.button7:
                  ss += "7";
                  text.setText(ss);
                  break;
              case R.id.button8:
                  ss += "8";
                  text.setText(ss);
                  break;
              case R.id.button9:
                  ss += "9";
                  text.setText(ss);
                  break;
              case R.id.button10:
                  if (ss.length() != 0) {
                      ss += "÷";
                      text.setText(ss);
                  }
                  break;
              case R.id.button11:
                  if (ss.length() != 0) {
                      ss += "×";
                      text.setText(ss);
                  }
                  break;
              case R.id.button12:
                  if (ss.length() != 0) {
                      ss += "+";
                      text.setText(ss);
                  }
                  break;
              case R.id.button15:
                  ss = "";
                  text.setText(ss);
                  break;
              case R.id.button16:
                  if (ss.length() != 0) {
                      ss += "-";
                      text.setText(ss);
                  }
                  break;
              case R.id.button13:
                  if (ss.length() != 0 && (ss.charAt(ss.length()) > '0' && ss.charAt(ss.length()) <= 9)) {
                      ss += ".";
                      text.setText(ss);
                  }
                  break;
              case R.id.button17:
                  if (ss.length() != 0) {
                      ss += "sin";
                      text.setText(ss);
                  }
                  break;
              case R.id.button18:
                  if (ss.length() != 0) {
                      ss += "cos";
                      text.setText(ss);
                  }
                  break;
              case R.id.button19:
                  ss += "(";
                  text.setText(ss);
                  break;
              case R.id.button21:
                  ss += ")";
                  text.setText(ss);
                  break;
              case R.id.button20:
                  text.setText("");
                  break;
          }
      }


      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.main, menu);
          return true;
      }

      class stack {
          private int MaxSize;
          private char[] stackArray;
          private int top;

          public stack(int i) {
              MaxSize = i;
              stackArray = new char[i];
              top = -1;
          }

          public void push(char j) {
              stackArray[++top] = j;
          }

          public char pop() {
              return stackArray[top--];
          }
      }


  }
