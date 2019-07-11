package com.Stackroute;
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word");
        String input=sc.nextLine();
        String word=input.toLowerCase();
        int lengthOfString=word.length();
        for(int i=0;i<lengthOfString;i++)
        {
            char ch=word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                System.out.print("vowel");
            }
            else
                System.out.print("consonant");
        }
        System.out.println();

    }

}
