package com.Stackroute;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        int reversedInteger = 0;
        int remainder;
        int originalInteger;
        originalInteger = num;
        int sum=0;

        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
            if(remainder %2==0)
            {
                sum=sum+remainder;
            }
        }

        if ((originalInteger == reversedInteger) && (sum>25))
            System.out.println(originalInteger + " is a palindrome and the sum of even numbers is greater than 25");
        else
            System.out.println(originalInteger + " is not a palindrome and the sum of even numbers is less than 25");


    }
}
