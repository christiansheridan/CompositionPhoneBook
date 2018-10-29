package com.zipcodewilmington.phonebook;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {
    public PhoneBook book;

    @Before
    public void setup(){
        book = new PhoneBook();
        String name = "AA";
        ArrayList <String> phoneNumber = new ArrayList<>();
        phoneNumber.add("211-111-2222");
        book.add(name, phoneNumber);
    }

    @Test
    public void testHasEntry() {
        //When
        boolean expectedOutput = book.hasEntry("AA");
        //Then
        Assert.assertTrue(expectedOutput);
    }

    @Test
    public void testAdd() {
        //Then
        int expectedOutput = 1;
        Assert.assertEquals(expectedOutput, book.size());
    }

    @Test
    public void testLookup(){
        //When
        String expectedOutput = "AA  [211-111-2222]";
        String actualOutput = book.lookUp("AA");

        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testRemove(){
        //When
        book.remove("AA");

        //Then
        Assert.assertEquals(0, book.size());
    }

    @Test
    public void testReverseLookup(){

        //When
        String expectedOutput = "AA";
        String actualOutput = book.reverseLookup(book.phoneNumber);

        //Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testListNamesAndNumbers(){

        //When
        String expectedOutput = "AA 211-111-2222";
        String actualOutput = book.listNamesAndNumbers();

        System.out.println(book.listNamesAndNumbers());
        //Then
        //Assert.assertTrue(expectedOutput, actualOutput);
    }
}
