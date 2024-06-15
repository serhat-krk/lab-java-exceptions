package com.ironhack;

import java.util.Objects;

public class Person {

    // properties
    private int id;
    private String name;
    private int age;
    private String occupation;

    // methods
    public Person(int id, String name, int age, String occupation) {
        this.id = id;
        this.age = age;
        this.occupation = occupation;

        String[] parts = name.split(" ");
        if (parts.length != 2)
            throw new IllegalArgumentException("name should follow firstName Lastname format");
        else
            this.name = name;
    }

    public void setAge(int age) {
        if (age < 0)
            throw new IllegalArgumentException("age cannot be negative");
        else
            this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(occupation, person.occupation);
    }

}
