package com.stackroute.pe1;
import java.util.Scanner;

public class Palindrome {
    public String palindromeCheck(int number)
    {
        if(number==0)
        {
            return "enter not null value";
        }

        int reversedInteger = 0;
        int remainder;
        int originalInteger;
        originalInteger = number;
        int sum=0;
        String result="";

        while( number != 0 )
        {
            remainder = number % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            number /= 10;
            if(remainder %2==0)
            {
                sum=sum+remainder;
            }
        }

        if ((originalInteger == reversedInteger) && (sum>25))
        {
            result="palindrome and sum greater than 25";
        }

        else
            result="Palindrome and sum less than 25";

        return result;


    }
}
