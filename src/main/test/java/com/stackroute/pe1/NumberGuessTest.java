package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class NumberGuessTest {
    NumberGuess numberGuess;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.numberGuess= new NumberGuess();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
       // this.numberGuess=new NumberGuess();
    }
    @BeforeClass
    public static void beforeClass()
    {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass()
    {
        System.out.println("After class");
    }

    @Test
    public void givenInputProperlyShouldShowProperOutput() {
        String actualResult=numberGuess.numberGuessing(30);
        assertEquals("you put the correct number and number is", actualResult);
    }
    @Test
    public void givenInputSmallAndShouldShowLesser() {
        String actualResult=numberGuess.numberGuessing(100);
        assertNotEquals("given number is lesser", actualResult);
    }
    @Test
    public void givenInputProperlyAndShouldShowProperOutput() {
        String actualResult=numberGuess.numberGuessing(100);
        assertEquals("given number is larger", actualResult);
    }
}