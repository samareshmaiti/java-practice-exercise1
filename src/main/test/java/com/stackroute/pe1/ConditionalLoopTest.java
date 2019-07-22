package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class ConditionalLoopTest {
    ConditionalLoop conditionalLoop;
    @Before
    public void setup() {
        System.out.println("Inside before");
        this.conditionalLoop= new ConditionalLoop();
    }
    @After
    public void tearDown()
    {
        System.out.println("inside after");
        this.conditionalLoop=new ConditionalLoop();
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
    public void givenInputShouldOutOfRange() {
        String actualResult=conditionalLoop.findResult(100);
        assertEquals("Out of range", actualResult);
    }
    @Test
    public void givenInputShouldReturnTom() {
        String actualResult=conditionalLoop.findResult(30);
        assertEquals("Tom", actualResult);
    }
    @Test
    public void givenInputShouldReturnJerry() {
        String actualResult=conditionalLoop.findResult(25);
        assertEquals("Jerr", actualResult);
    }



}