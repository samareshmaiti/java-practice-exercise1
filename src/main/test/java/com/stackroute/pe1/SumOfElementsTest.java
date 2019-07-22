package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class SumOfElementsTest {
    SumOfElements sumOfElements;
    @Before
    public void setUp() {
        //arrange
        this.sumOfElements = new SumOfElements();
    }

    @Test
    public void givenStringShouldReturnATotal() {
        //act
        String actualResult = this.sumOfElements.sumOfIntegerValue(
                "20 30 23 32");
        //assert
        assertEquals("105", actualResult);
    }

    @Test
    public void givenStringShouldReturnAErrorMessage() {
        //act
        String actualResult = this.sumOfElements.sumOfIntegerValue(
                "20 fe 2e 32");
        //assert
        assertEquals("Non Integer Value", actualResult);
    }


    @Test
    public void givenStringShouldReturnAZero() {
        //act
        String actualResult = this.sumOfElements.sumOfIntegerValue(
                "20 -20");
        //assert
        assertEquals("0", actualResult);
    }
    @After
    public void tearDown(){
        sumOfElements = null;
    }
}