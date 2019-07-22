package com.stackroute.pe1;
import java.util.Scanner;

public class NumberGuess {
    public String  numberGuessing(int number)
    {
        String result="fdhgj";
        //Scanner sc = new Scanner(System.in);
        int number1 = 30;
        boolean guess=false;
        do {

            //System.out.println("Enter a number");
            //int number = sc.nextInt();

            if (number > number1)
                result="given number is larger";
            else if (number < number1)
                result="given number is lesser";
            else if(number==30)
                result="you put the correct number and number is";

        }
        while(guess==true);
        return result;
    }

}
