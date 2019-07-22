package com.stackroute.pe1;

import org.junit.*;

import static org.junit.Assert.*;

public class VowelConsonantTest {
    VowelConsonant vowelConsonant;

    @Before
    public void setUp()
    {
        this.vowelConsonant=new VowelConsonant();
    }
    @After
    public void tearDown()
    {
        vowelConsonant=null;
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
    public void givenStringShouldReturnTheResult() {
        String actualResult = vowelConsonant.vowelOrConsonant("Hello");
        assertEquals("consonanvowelconsonantconsonantvowel", actualResult);
    }
    @Test
    public void givenStringShouldReturnEnterNonEmptyString() {
        String actualResult = vowelConsonant.vowelOrConsonant(null);
        assertNotNull("enter non emptystring", actualResult);
    }
    @Test
    public void givenNothingShouldReturnNothing() {
        String actualResult = vowelConsonant.vowelOrConsonant("");
        assertEquals("", actualResult);
    }
    }