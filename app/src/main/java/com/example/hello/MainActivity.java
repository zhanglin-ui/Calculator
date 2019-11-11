  package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

  public  class MainActivity extends AppCompatActivity{
      private Button button1;
      private Button button2;
      private EditText edit_text;
      private Button button3;
      private Button button4;
      private Button button5;
      private Button button6;
      private Button button7;
      private Button button8;
      private Button button9;
      private Button button10;
      private Button button11;
      private Button button12;
      private Button button13;
      private Button button14;
      private Button button15;
      private Button button16;
      private Button button17;
      private Button button18;
      private Button button19;
      private Button button20;
      private TextView text;





      @Override
      public void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.third_layout);
          final EditText edit_text=(EditText)findViewById(R.id.edit_text);
          Button button1=(Button)findViewById(R.id.button1);
          Button button2=(Button)findViewById(R.id.button2);
          Button button3=(Button)findViewById(R.id.button3);
          Button button4=(Button)findViewById(R.id.button4);
          Button button5=(Button)findViewById(R.id.button5);
          Button button6=(Button)findViewById(R.id.button6);
          Button button7=(Button)findViewById(R.id.button7);
          Button button8=(Button)findViewById(R.id.button8);
          Button button9=(Button)findViewById(R.id.button9);
          Button button10=(Button)findViewById(R.id.button10);
          Button button11=(Button)findViewById(R.id.button11);
          Button button12=(Button)findViewById(R.id.button12);
          Button button13=(Button)findViewById(R.id.button13);
          Button button14=(Button)findViewById(R.id.button14);
          Button button15=(Button)findViewById(R.id.button15);
          Button button16=(Button)findViewById(R.id.button16);
          Button button17=(Button)findViewById(R.id.button17);
          Button button18=(Button)findViewById(R.id.button18);
          Button button19=(Button)findViewById(R.id.button19);
          Button button20=(Button)findViewById(R.id.button20);
          final TextView text=(TextView)findViewById(R.id.text);



              edit_text.setInputType(InputType.TYPE_NULL);
          button1.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"1");
              }
          });
          button2.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"2");
              }
          });
          button3.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"3");
              }
          });
          button4.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"4");
              }
          });
          button5.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"5");
              }
          });
          button6.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"6");
              }
          });
          button7.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"7");
              }
          });
          button8.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"8");
              }
          });
          button9.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  text.setText(text.getText().toString()+"9");
              }
          });
          button10.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+" ÷");
              }
          });
          button11.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"×");
              }
          });
          button12.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"+");
              }
          });
          button13.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+".");
              }
          });
          button14.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"0");
              }
          });
          button15.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText("");
              }
          });
          button16.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"-");
              }
          });
          button17.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"sin");
              }
          });
          button18.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"cos");
              }
          });
          button19.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View v){
                  text.setText(text.getText().toString()+"tan");
              }
          });
          }


      @Override
      public boolean onCreateOptionsMenu(Menu menu) {
          getMenuInflater().inflate(R.menu.main,menu);
          return true;
      }




}
