package com.stackroute.pe1;
import java.util.Scanner;

public class SortedNumbers {
    public int digitSorting(int number)
    {
        if(number==0)
        {
            return 0;
        }
        int sum=0;
        int number1 = 0;
         for (int i = 9; i >= 0; i--) {
            int number2 = number;
            while (number2 > 0) {
                int digit = number2 % 10;

                if (digit == i) {
                    number1 *= 10;
                    number1 += digit;
                }
                number2 /= 10;
            }
        }
        int reverse=0;
        while(number1>0)
        {
            int digit = number1% 10;
                reverse = reverse * 10 + digit;
                 number1 /= 10;
        }


       // System.out.println(reverse);
        return reverse;
    }
}
