package com.example.hello;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Index {
    public static Stack biaodashi(String s){
        Stack<String> stacka=new Stack<String>();
        Stack<String> stackb=new Stack<String>();
        String Temp=new String();
        HashMap<String,Integer> hashMap=new HashMap<String, Integer>();
        hashMap.put("(",0);
        hashMap.put("+",1);
        hashMap.put("-",1);
        hashMap.put("×",2);
        hashMap.put("÷",2);
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            String m = c + "";
            if (Character.isDigit(c) || c == '.') {
                if (i == s.length() - 1) {
                    Temp += m;
                    stacka.push(Temp);
                }
                else Temp += m;
            }
            else {
                if (Temp != "") {
                    stacka.push(Temp);
                    Temp = "";
                }
                if (c == '(') stackb.push(m);
                else if (c == ')') {
                    while (!stackb.isEmpty() && !stackb.peek().equals("(")) {
                        String r = stackb.pop();
                        stacka.push(r);
                    }
                    if(stackb.peek().equals("(")) stackb.pop();
                }
                else {
                    switch (c) {
                        case '+':
                        case '-':
                            if ((!stackb.isEmpty()) && hashMap.get(stackb.peek()) > 1) {
                                String t = stackb.pop();
                                stacka.push(t);
                                stackb.push(m);
                            }
                            else {
                                stackb.push(m);
                            }
                            break;
                        case '×':
                        case '÷':
                            stackb.push(m);
                            break;
                    }
                }
            }
        }

        while(!stackb.isEmpty()){
            String q=stackb.pop();
            stacka.push(q);
        }
        return stacka;
    }
    public static String compute(Stack<String> stacka){
        ArrayList<String> arr=new ArrayList<String>();
        ArrayList<String> arr1=new ArrayList<String>();
        while(!stacka.isEmpty()){
            String t=stacka.pop();
            arr.add(t);
        }
        for(int p=arr.size()-1;p>=0;p--){
            arr1.add(arr.get(p));
        }
        for(int i=0;i<=arr1.size()-1;i++){
            System.out.println(arr1.get(i));
        }
        Stack<String> stackc=new Stack<String>();
        for(int i=0;i<=arr1.size()-1;i++){
            switch(arr1.get(i)){
                case "+":
                    BigDecimal a=new BigDecimal(stackc.pop()).add(new BigDecimal(stackc.pop()));
                    stackc.push(String.valueOf(a));
                    break;
                case "-":
                    double u=Double.valueOf(stackc.pop());
                    double w=Double.valueOf(stackc.pop());
                    BigDecimal b=new BigDecimal(w).subtract(new BigDecimal(u));
                    stackc.push(String.valueOf(b));
                    break;
                case "×":
                    BigDecimal c=new BigDecimal(stackc.pop()).multiply(new BigDecimal(stackc.pop()));
                    stackc.push(String.valueOf(c));
                    break;
                case "÷":
                    double t=Double.valueOf(stackc.pop());
                    double y=Double.valueOf(stackc.pop());
                    BigDecimal d=new BigDecimal(y).divide(new BigDecimal(t),6,BigDecimal.ROUND_HALF_UP);
                    stackc.push(String.valueOf(d));
                    break;
                case "":
                    break;
                    default:stackc.push(arr1.get(i));break;
            }
        }
      return stackc.pop();
    }
}
