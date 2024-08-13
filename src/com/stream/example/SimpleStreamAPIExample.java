package com.stream.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamAPIExample {

    public static void main(String[] args) {
     //Traditional way to create Array List
     List<Integer> list = new ArrayList();
     list.add(1);
     list.add(11);
     list.add(12);
     list.add(10);
     list.add(10);
     list.add(8);
     list.add(5);
     list.add(5);
     list.add(21);
     list.add(3);

     List result = list.stream().distinct().collect(Collectors.toList());
        Stream stream = list.stream();
     System.out.println("Distinct List :: "+ result);

    }

}
