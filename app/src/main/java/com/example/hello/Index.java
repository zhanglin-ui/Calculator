package com.example.hello;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Index {
    public static Stack Houzui(String s){
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
                    while (!stackb.isEmpty()) {
                        String r = stackb.pop();
                        stacka.push(r);
                    }
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
    public static String calc(Stack<String> stacka){
        ArrayList<String> arr=new ArrayList<String>();
        while(!stacka.isEmpty()){
            String t=stacka.pop();
            arr.add(t);
        }
        ArrayList<String> arr1=new ArrayList<String>();
        for(int i=arr.size()-1;i>=0;i--){
            int j=arr1.size();
            switch (arr.get(i)){
                case "+":
                    BigDecimal a=new BigDecimal(arr1.remove(j-2)).add(new BigDecimal(arr1.remove(j-2)));
                    arr1.add(String.valueOf(a));
                    break;
                case "-":
                    BigDecimal b=new BigDecimal(arr1.remove(j-2)).subtract(new BigDecimal(arr1.remove(j-2)));
                    arr1.add(String.valueOf(b));
                    break;
                case "×":
                    BigDecimal c=new BigDecimal(arr1.remove(j-2)).multiply(new BigDecimal(arr1.remove(j-2)));
                    arr1.add(String.valueOf(c));
                    break;
                case "÷":
                    BigDecimal d=new BigDecimal(arr1.remove(j-2)).divide(new BigDecimal(arr1.remove(j-2)));
                    arr1.add(String.valueOf(d));
                    break;
                default:arr1.add(arr.get(i));break;
            }
        }
        return arr1.get(0);
    }
}
