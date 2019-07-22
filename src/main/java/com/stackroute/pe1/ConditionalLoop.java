package com.stackroute.pe1;
import java.util.Scanner;

public class ConditionalLoop {
    public String findResult(int number)
    {
        String result="";


        if((number>=20 && number<=30) &&(number%2==0))
        {
            result="Tom";
        }
        if((number>=20 && number<=30) &&(number%2!=0))
        {
            result="Jerry";
        }
        else
            result="Out of range";
        return result;
    }
}
