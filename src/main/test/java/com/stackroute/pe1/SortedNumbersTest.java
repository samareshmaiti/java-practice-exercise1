package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SortedNumbersTest {
    SortedNumbers sortedNumbers;
    @Before
    public void setUp()
    {
        this.sortedNumbers=new SortedNumbers();
    }
    @After
    public void tearDown()
    {
        sortedNumbers=null;
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
    public void givenNumberShouldReturnTheReverseOfActual() {
        int actualResult = sortedNumbers.digitSorting(541287);
        assertEquals("875421", actualResult);
    }
    @Test
    public void givenNumberShouldReturnTheActual() {
        int actualResult = sortedNumbers.digitSorting(541287);
        assertEquals("124587", actualResult);
    }
    @Test
    public void givenNumberShouldNotZero() {
        int actualResult = sortedNumbers.digitSorting(0);
        assertEquals("You gave 0", actualResult);
    }
}