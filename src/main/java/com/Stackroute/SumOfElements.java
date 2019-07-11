package com.Stackroute;
import java.util.Scanner;
public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input number:");
        int number = sc.nextInt();
        int array[] = new int[number];
        int sumOfElements = 0;
        for (int j = 0; j < number; j++) {
            if (sc.hasNextInt()) {
                array[j] = sc.nextInt();
                sumOfElements = sumOfElements + array[j];
            } else
                System.out.println("You enter a non-integer input");
        }

    }
}
