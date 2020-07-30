package test.java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CirrTest {
    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfCompanyisEqual(){
        String expected = "codeup";
        String actual = "Codeup";
        //expected to fail
        assertEquals(expected,actual);
    }

    @Test
    public void testIfChangeIsCorrect(){
        Double price = 10.0;
        Double discount = 4.5;

        //1. write a failing test
//        assertEquals(10.5, price-discount, 0);
        //2. refactor
        assertEquals(5.5, price-discount, 0);
        assertEquals(5.1, price-discount,  0.5);
        assertEquals(4.9, price-discount, 0.6);
    }

    //assertNotSame - its possible to verify if two variables dont refer to the same object
    //assertSame - otherwise, we want to verify that two variables refer to the same object

    @Test
    public void testIfObjectsAreDifferent(){
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

//        assertNotSame(sheep, dog);
//        assertNotSame(sheep,clonnedSheep);
//        assertSame(clonnedSheep,sheep); // they are referring to the same object
//        assertSame(dog, clonnedSheep);
    }

    //assertArrayEquals - method checks that two object arrays are equal or not
    @Test
    public void  testIfArrayEquals1(){
        char [] expected =  {'J','u','n','i','t'};
        char  [] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfArrayEquals2(){
        char [] expected = {'n','a','y','o'};
        char [] actual = {'n'};

        assertArrayEquals(expected,actual);
    }

    //assert true or false : assertTrue and assertFalse
    @Test
    public void testIfGreaterOrLesserThanWorks(){
        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5>4);
        assertTrue("4 is less than 5", 4<5);
        assertFalse("5 is not greater than 6", 5 >6);
    }


    private List<String> names;
    //@Before annotation: methods of superclasses that will run before those of the current class
    @Before
    public void setUp(){
        this.names = new ArrayList<>();
        this.names.add("Fer"); // ["Fer"]
    }

    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, this.names.size());
//        ["Fer"]
        this.names.add("Zach"); // adding zach
        System.out.println(names);//["Fer", "Zach"]
        assertEquals(2,this.names.size()); // size is not 2
        assertSame("Fer", this.names.get(0));
        assertSame("Zach", this.names.get(1));
    }


}
