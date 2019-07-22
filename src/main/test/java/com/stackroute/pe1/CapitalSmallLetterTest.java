package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class CapitalSmallLetterTest {

        CapitalSmallLetter capitalSmallLetter;
        @Before
        public void setup() {
            System.out.println("Inside before");
            this.capitalSmallLetter= new CapitalSmallLetter();
        }
        @After
        public void tearDown()
        {
            System.out.println("inside after");
            capitalSmallLetter=null;
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
    public void givenInputShouldReturnTypeOfCapitalLetter() {
            String actualResult=capitalSmallLetter.findType('A');
        assertEquals("Capital Letter", actualResult);
    }

    @Test
    public void givenInputShouldReturnTypeOfSmallLetter() {
        String actualResult=capitalSmallLetter.findType('b');
        assertEquals("small letter", actualResult);
    }
    @Test
    public void givenInputShouldReturnTypeOfDigit() {
        String actualResult=capitalSmallLetter.findType('8');
        assertEquals("Digit", actualResult);
    }
    @Test
    public void givenInputShouldReturnTypeOfSpecialCharacter() {
        String actualResult=capitalSmallLetter.findType('!');
        assertEquals("Special Character", actualResult);
    }
    @Test
    public void givenInputShouldBeNotNull() {
        String actualResult = capitalSmallLetter.findType('.');
        assertNotNull("string should be not nul",actualResult);
    }
}