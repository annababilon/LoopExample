package com.dotka;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ania");
        names.add("Basia");
        names.add("Kazik");
        names.add("Roman");

        for(String name:names){
            System.out.println(name);
        }
    }
}
