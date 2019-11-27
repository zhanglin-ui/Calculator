package com.example.hello;

import android.os.Bundle;



import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import static com.example.hello.Index.Houzui;
import static java.lang.Integer.parseInt;
import static java.lang.Math.sin;
import static java.lang.Math.cos;

public class MainActivity2 extends AppCompatActivity {
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
    private String ss = "";
    private String s = "";
    int d = 0, a = 0;
    boolean e = true;
    String c;
    public double PI = 4 * Math.atan(1);

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
        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "1";
                text.setText(ss);
            }
        });
        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "2";
                text.setText(ss);
            }
        });
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "3";
                text.setText(ss);
            }
        });
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "4";
                text.setText(ss);
            }
        });
        button5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "5";
                text.setText(ss);
            }
        });
        button6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "6";
                text.setText(ss);
            }
        });
        button7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "7";
                text.setText(ss);
            }
        });
        button8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "8";
                text.setText(ss);
            }
        });
        button9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ss += "9";
                text.setText(ss);
            }
        });
        button14.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    ss += "0";
                    text.setText(ss);
                } else return;
            }
        });
        button15.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    ss = ss.substring(0, ss.length() - 1);
                    text.setText(ss);
                    e = true;
                }
            }
        });
        button15.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ss = "";
                text.setText(ss);
                e = true;
                return false;
            }
        });
        button10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("÷") || s.equals("×") || s.equals("+") || s.equals("-")) {
                        ss = ss.substring(0, ss.length() - 1);
                    }
                    ss += "÷";
                    text.setText(ss);
                    e = true;
                } else return;
            }
        });
        button11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("÷") || s.equals("×") || s.equals("+") || s.equals("-")) {
                        ss = ss.substring(0, ss.length() - 1);
                    }
                    ss += "×";
                    text.setText(ss);
                    e = true;
                } else return;
            }
        });
        button12.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("÷") || s.equals("×") || s.equals("+") || s.equals("-")) {
                        ss = ss.substring(0, ss.length() - 1);
                    }
                    ss += "+";
                    text.setText(ss);
                    e = true;
                } else return;
            }
        });
        button13.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7")
                            || s.equals("8") || s.equals("9")) {
                        if (e) {
                            ss += ".";
                            text.setText(ss);
                            e = false;
                        }
                    }
                } else {
                    ss += "0.";
                    text.setText(ss);
                }
            }
        });
        button16.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {

                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("÷") || s.equals("×") || s.equals("+") || s.equals("-")) {
                        ss = ss.substring(0, ss.length() - 1);
                    }
                    ss += "-";
                    text.setText(ss);
                    e = true;
                } else {
                    ss += "-";
                    text.setText(ss);
                }
            }
        });
        button17.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {

                    if (e = ss.matches("[0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.sin(Double.valueOf(d * (PI / 180))));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.sin(Double.valueOf(d * (PI / 180))));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9][0-9][0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.sin(Double.valueOf(d * PI / 180)));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9][0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.sin(Double.valueOf(d * PI / 180)));
                        text.setText(ss);
                    } else return;
                }

            }
        });
        button18.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {

                    if (e = ss.matches("[0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.cos(Double.valueOf(d * PI)));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.cos(Double.valueOf(d * PI)));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9][0-9][0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.cos(Double.valueOf(d * PI)));
                        text.setText(ss);
                    }
                    if (e = ss.matches("[0-9][0-9][0-9]")) {
                        d = Integer.valueOf(ss);
                        ss = String.valueOf(Math.cos(Double.valueOf(d * PI)));
                        text.setText(ss);
                    } else return;
                }
            }
        });
        button19.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {
                    s = ss.substring(ss.length() - 1, ss.length());
                    if (s.equals("+") || s.equals("-") || s.equals("×") || s.equals("÷")) {
                        ss += "(";
                        text.setText(ss);
                        a += 1;
                    } else return;
                } else {
                    ss += "(";
                    text.setText(ss);
                    a = a + 1;
                }
            }
        });
        button21.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss.length() != 0) {

                    if (ss.substring(ss.length() - 1, ss.length()).equals("(")) {
                        return;
                    } else {
                        if (a > 0) {
                            ss += ")";
                            text.setText(ss);
                            a = a - 1;
                        }
                    }

                } else return;
            }
        });
        button20.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
               text.setText(Index.calc(Houzui(ss)));
               ss="";
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
