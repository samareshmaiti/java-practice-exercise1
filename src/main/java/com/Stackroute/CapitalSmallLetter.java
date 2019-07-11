package com.Stackroute;

import java.util.Scanner;

public class CapitalSmallLetter {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        // String str=Character.toString(ch);
        if(ch>=65 && ch<=90)
        {
            System.out.println("Capital Letter");
        }
        if(ch>=97 && ch<=122)
        {
            System.out.println("Small Letter");
        }
        if(ch>=48 && ch<=57)
        {
            System.out.println("digit");
        }
        if(ch>=32 && ch<=47)
        {
            System.out.println("Special Character");
        }


    }
}
