package com.ironhack;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private List<Person> personList = new ArrayList<>();

    public Person findByName(String name) {
        String[] parts = name.split(" ");
        if (parts.length != 2)
            throw new IllegalArgumentException("name should follow firstName Lastname format");
        else

    }




}
