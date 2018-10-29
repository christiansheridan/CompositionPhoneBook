package com.zipcodewilmington.phonebook;

import java.util.TreeMap;
import java.util.*;

import static javax.swing.UIManager.put;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBook {

    String name;
    ArrayList<String> phoneNumber = new ArrayList<>();
    TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<>();

    public PhoneBook() {
    }

    public boolean hasEntry(String name) {
        if (phoneBook.containsKey(name)){
            return true;
        } else {return false;}
    }

    public void add(String name, ArrayList<String> phoneNumber) {
        phoneBook.put(name, phoneNumber);
    }

    public int size() {
        return phoneBook.size();
    }

    public String lookUp(String name) {
        if (phoneBook.containsKey(name)){
            return name + "  " + phoneBook.get(name);
        } else {return "name not found";}
    }

    public void remove(String name) {
        if (phoneBook.containsKey(name)){
            phoneBook.remove(name);
        }
    }

    //convert to a set
    public String reverseLookup(ArrayList<String> phoneNumber) {
        String revLookupName = "";
            for (Map.Entry<String, ArrayList<String>> map : phoneBook.entrySet()) {
                if (map.getValue().equals(phoneNumber)) {
                    revLookupName = map.getKey();
                }
            }
         return revLookupName;
    }

    public String listNamesAndNumbers() {
        String namesAndNumbers = "";
        for (Map.Entry<String, ArrayList<String>> map : phoneBook.entrySet()){
            namesAndNumbers += "Name: " + map.getKey() + "|   Phone Number(s): " + map.getValue();
        }
        System.out.println(namesAndNumbers);
        return namesAndNumbers;
    }
}
