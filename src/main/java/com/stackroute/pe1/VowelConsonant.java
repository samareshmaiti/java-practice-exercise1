package com.stackroute.pe1;
import java.util.Scanner;

public class VowelConsonant {
    public String vowelOrConsonant(String word)
    {
        if(word==null)
        {
            return "enter non empty string";
        }
        String result="";

        word=word.toLowerCase();
        int lengthOfString=word.length();
        for(int i=0;i<lengthOfString;i++)
        {
            char ch=word.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                result+="vowel";
            }
            else
                result+="consonant";
        }
        return result;
    }

}
