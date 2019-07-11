package com.Stackroute;

import java.util.Scanner;

public class CapitalSmallLetter {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        // String str=Character.toString(ch);
        if(Character.isUpperCase(ch))
        {
            System.out.println("Capital Letter");
        }
        if(Character.isLowerCase(ch))
        {
            System.out.println("Small Letter");
        }


    }
}
