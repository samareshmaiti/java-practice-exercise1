package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class IterationTest {

    Iteration iteration;


    @Before
    public void setUp() {
        this.iteration = new Iteration();
    }

    @Test
    public void givenNumberShouldReturnAnArray() {
        //act
        int[] actualResult = this.iteration.printer(7);
        //assert
        int[] expectedResult = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5,
                6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void givenNumberShouldReturnAnArrayOfLengthOne() {
        //act
        int[] actualResult = this.iteration.printer(1);
        //assert
        int[] expectedResult = {1};
        assertArrayEquals(expectedResult, actualResult);
    }

    @Test (expected = OutOfMemoryError.class)
    public void givenNumberShouldReturnAnOutOfMemoryError() {
        //act
        int[] actualResult = this.iteration.printer(100000000);
    }

    @Test
    public void givenNumberShouldReturnAnEmptyArray() {
        //act
        int[] actualResult = this.iteration.printer(0);
        //assert
        int[] expectedResult = {};
        assertArrayEquals(expectedResult, actualResult);
    }
    @After
    public void tearDown(){
        iteration = null;
    }


}



