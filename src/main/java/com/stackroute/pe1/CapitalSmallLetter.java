package com.stackroute.pe1;

import java.util.Scanner;

public class CapitalSmallLetter {

    public String findType(char ch)
    {
        String result="";

        if(ch>=65 && ch<=90)
        {
            result= "Capital Letter";
        }
        if(ch>=97 && ch<=122)
        {
            result= "Small Letter";
        }
        if(ch>=48 && ch<=57)
        {
            result= "Digit";
        }
        if(ch>=32 && ch<=47) {

            result = "Special Character";

        }
        else
            result= "enter a input";
        return result;


    }
}
