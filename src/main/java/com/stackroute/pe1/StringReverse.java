package com.stackroute.pe1;
import java.util.Scanner;

public class StringReverse {
    public String reverseOfString(String str)
    {

        if(str==null)
        {
           return "String should be not null";
        }


        String reverseString = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverseString = reverseString + str.charAt(i);
        }
        return reverseString;
    }
}
