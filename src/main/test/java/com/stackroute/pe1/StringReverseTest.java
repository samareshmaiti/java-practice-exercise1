package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class StringReverseTest {
    StringReverse stringReverse;

    @Before
    public void setUp()
    {
        this.stringReverse=new StringReverse();
    }
    @After
    public void tearDown()
    {
        stringReverse=null;
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
    public void givenNullShouldThrowNullPointerException() {
        String actualResult = stringReverse.reverseOfString(null);
    }
    @Test
    public void givenStringShouldReturnTheReverse() {
        String actualResult = stringReverse.reverseOfString("Hello");
        assertEquals("olleH", actualResult);
    }
    @Test
    public void givenStringShouldBeNotNull() {
        String actualResult = stringReverse.reverseOfString(null);
        assertEquals("string should be not nul",actualResult);
    }

}