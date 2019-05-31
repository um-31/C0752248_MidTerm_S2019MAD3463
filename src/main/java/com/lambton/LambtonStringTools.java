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

    public void mostFrequent(String s) {
        char[] array = s.toCharArray();
        int count = 1;
        int max = 0;
        char maxChar = 0;

            for (int i = 1; i < array.length; i++) {


                if (array[i] == array[i - 1]) {
                    count++;
                } else {
                    if (count > max) {
                        max = count;
                        maxChar = array[i - 1];
                    }
                    count = 1;
                }
            }

            System.out.println("Most Frequent: " + max + ", for the character " + maxChar);


        }

    public void replaceSubString(String s1, String s2, String s3){

    }
}
