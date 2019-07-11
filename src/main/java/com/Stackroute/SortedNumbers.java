package com.Stackroute;
import java.util.Scanner;
public class SortedNumbers {
    public static void main(String[] args) {

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
        System.out.println(number1);
    }
}
