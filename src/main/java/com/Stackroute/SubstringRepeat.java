package com.Stackroute;
import java.util.Scanner;
public class SubstringRepeat {

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.nextLine();
        System.out.println("Enter the integer");
        int number=sc.nextInt();

        int lengthOfString=str.length();
        String sub=str.substring(lengthOfString-number,lengthOfString);
        String result=str;
        for(int i=0;i<number;i++)
        {
            result=result+sub;
        }
        System.out.println(result);

    }
}
