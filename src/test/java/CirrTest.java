package test.java;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

//Create a test method that uses assertEquals or assertNotEquals to verify if the String Codeup is the same as CodeUp.
//Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
//
//List<String> languages = new ArrayList<>();
//List<String> moreLanguages = new ArrayList<>();
//Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//
//int[] numbers = {1, 2, 3};
//int[] otherNumbers = new int[3];
//otherNumbers[0] = 1;
//otherNumbers[1] = 2;
//otherNumbers[2] = 3;
//Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//
//String language = "PHP";
//language.contains("H"); // use assertTrue for this statement
//language.contains("J"); // use assertFalse for this statement
public class CirrTest {

    @Test
    public void assertEqualsStrings(){
        String expected = "Codeup";
        String actual = "CodeUp";

        assertEquals(actual, expected);
    }

    @Test
    public void assertNotEqualsStrings(){
        String expected = "Codeup";
        String actual = "CodeUp";

        assertNotEquals(expected,actual);
    }

    //Create a test method that uses assertNotSame to verify that the following ArrayLists are not the same:
//
//List<String> languages = new ArrayList<>();
//List<String> moreLanguages = new ArrayList<>();
//Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//

    @Test
    public void assertNotSameArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void assertSameArrayList(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        assertSame(languages, moreLanguages);
    }

    // the difference between assertSame vs assertEquals
    //assertEquals: asserts that objects are equals
    //assertSame : 2 objects refer to the same object
    // @Test
//    public void testAssertions(){
//
//        Student s1 = new Student();
//        s1.name = "watson";
//        Student s2 = s1;
//
//        //below assertions is successful as s1 and s2 point to same object
//        Assert.assertEquals(s1,s2);
//
//        //below assertions is successful as s1 and s2 point to same object
//        Assert.assertSame(s1, s2);
//
//        Student s3 = new Student();
//        s3.name = "Shaun";
//
//        //below assertions is unsuccessful as equals method of s1 returns false
//        Assert.assertEquals(s1,s3);
//
//        //below assertions is unsuccessful as s1 and s3 point to different object
//        Assert.assertSame(s1,s3);
//
//        s3.name = "watson";
//        //below assertions is successful as equals method of s1 returns true
//        Assert.assertEquals(s1,s3);
//
//        //below assertions is unsuccessful as s1 and s3 are different objects
//        Assert.assertSame(s1,s3);
//    }

    //Create a test method that uses assertArrayEquals to verify the following arrays are equal.
//
//int[] numbers = {1, 2, 3};
//int[] otherNumbers = new int[3];
//otherNumbers[0] = 1;
//otherNumbers[1] = 2;
//otherNumbers[2] = 3;

    @Test
    public void assertArrayEqualsNumbers(){
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
    }

    //Create a test method that uses both assertFalse and assertTrue to verify the following statements:
//
//String language = "PHP";
//language.contains("H"); // use assertTrue for this statement
//language.contains("J"); // use assertFalse for this statement
    @Test
    public void testAssertTrue(){
        String language = "PHP";
        assertTrue(language.contains("H"));
    }

    @Test
    public void testAssertFalse(){
        String language = "PHP";
        assertFalse(language.contains("J"));
    }



}
