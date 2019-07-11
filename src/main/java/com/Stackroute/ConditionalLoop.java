package com.Stackroute;
import java.util.Scanner;
public class ConditionalLoop {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if((number>=20 && number<=30) &&(number%2==0))
        {
            System.out.println("Tom");
        }
        if((number>=20 && number<=30) &&(number%2!=0))
        {
            System.out.println("Jerry");
        }
    }
}
