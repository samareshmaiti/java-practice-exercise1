package com.Stackroute;
import java.util.Scanner;
public class Iteration {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of iteration");
        int number=sc.nextInt();
        for(int j=1;j<=number;j++) {
            for (int i = 1; i <=j; i++) {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
