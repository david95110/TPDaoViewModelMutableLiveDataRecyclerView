package com.example.tpdaoviewmodelmutablelivedatarecyclerview.Model;

import java.util.ArrayList;
import java.util.List;

public class PersonProvider {
    public static List<Person>  personList = new ArrayList<>();
    static {
        personList.add(new Person("toto","firstToto"));
        personList.add(new Person("titi","firstTiti"));
        personList.add(new Person("tata","firstTata"));
        personList.add(new Person("tonton","firstTonton"));
    }
}
