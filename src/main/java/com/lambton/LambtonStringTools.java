package com.lambton;
import java.lang.*;
public class LambtonStringTools {
    public void reverse(String s){
        String output="";
        char[] rev = s.toCharArray();

        for (int i = rev.length-1; i>=0; i--)
        {
            output= output + String.valueOf(rev[i]);
        }
        System.out.println(output);

    }
    public void binaryToDecimal(String s){

            int decimal=Integer.parseInt(s,2);
            System.out.println(decimal);

    }
    public void initials(String s) {

    }
    public void mostFrequent(String s){

    }
    public void replaceSubString(String s1, String s2, String s3){

    }
}
