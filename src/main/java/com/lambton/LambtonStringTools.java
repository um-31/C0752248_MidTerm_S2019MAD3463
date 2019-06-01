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
        int a=0;
        String initials="";
        char[] c1=s.toCharArray();
        for(int i=0;i<c1.length;i++){
            if(c1[i]==' ')
            {
                a=a+1;
            }
        }
        if(a==2)
        {
            initials=s.substring(0,1)+"."+" "+s.substring(s.indexOf(" ") + 1 , s.indexOf(" ") + 2)+"."+s.substring(s.lastIndexOf(" "));

        }
        else{
            System.out.println("Null");
        }
        System.out.println(initials);
    }

    public void mostFrequent(String s) {
        int count = 0;
        char mostUsed = ' ';
        char[] input = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (input[i] == input[j]) {
                    mostUsed = (input[j]);
                    count++;
                    break;
                }
            }
        }
        if (count >= 1) {
            System.out.println("Most Frequent Character is: " + mostUsed);
        }
        else{
            System.out.println("No character repeated");
        }
    }

    public void replaceSubString(String s1, String s2, String s3){
        /*int a=0;

        char[] full=s1.toLowerCase().toCharArray();
        char[] search=s2.toLowerCase().toCharArray();
        char[] replace=s3.toLowerCase().toCharArray();
        for(int i=0;i<search.length;i++)
        {
            if (full[i]==search[i])
            {
                if(search.length==replace.length)
                {
                    full[i]=replace[i];
                }
                else{

                }
            }
        }
        for(int i=0;i<full.length;i++)
        {
            System.out.print(full[i]);
        }*/
        s1=s1.toLowerCase();
        if(s1.contains(s2)){
            s1=s1.replaceAll(s2,s3);
            System.out.println(s1);
        }
        else{
            System.out.println("String does not contains give other string");
        }
    }
}
