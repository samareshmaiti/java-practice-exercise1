package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;
    @Before
    public void setUp()
    {
        this.palindrome=new Palindrome();
        System.out.println("Before");
    }
    @After
    public void tearDown()
    {
        //this.palindrome=new Palindrome();
    }
    @Test
    public void givenInputAndShouldShowProperOutput() {
       String actualResult=palindrome.palindromeCheck(121);
        assertEquals("Palindrome and sum less than 25", actualResult);
    }
    @Test
    public void givenInputAndShouldShowGiveNotNullValue()
    {
        String actualResult=palindrome.palindromeCheck(0);
        assertNotNull("enter not null value");
    }
    @Test
    public void givenInputAndShouldShowProperOutputAsPalindrome() {
        String actualResult=palindrome.palindromeCheck(89898);
        assertSame("Palindrome and sum less than 25", actualResult);
    }


}