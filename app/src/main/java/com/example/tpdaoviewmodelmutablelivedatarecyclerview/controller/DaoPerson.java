package com.example.tpdaoviewmodelmutablelivedatarecyclerview.controller;


import com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DaoPerson {
    private List<Person> personList = new ArrayList<>();

    public DaoPerson() {
    }

    public List<Person> getAllPersons() {

        return Collections.unmodifiableList(personList);
    }

    public void addPerson(Person p) {
        personList.add(p);
    }
}
