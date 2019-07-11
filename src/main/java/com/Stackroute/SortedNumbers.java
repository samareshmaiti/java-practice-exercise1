package com.Stackroute;
import java.util.Scanner;
public class SortedNumbers {
    public static void main(String[] args) {
        int sum=0;
        int number1 = 0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();

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


        System.out.println(reverse);
        while(reverse>0)
        {
            int rem=reverse/10;
            sum=sum+rem;
        }
        System.out.println(sum);
    }
}
