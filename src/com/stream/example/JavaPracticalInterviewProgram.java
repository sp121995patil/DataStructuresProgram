package com.stream.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaPracticalInterviewProgram {

    public static void main(String[] arg){
        List<String> list = Arrays.asList("java","micro","services","something");
        printNthCharectoreOfListofString(list, 2);
    }

    public static void printNthCharectoreOfListofString(List<String> list, int num){
        list.stream().forEach(System.out::println);
        List rStream = list.stream().filter(str -> str != null && str.length() > num).map(str -> str.charAt (num-1)).collect(Collectors.toList());
        rStream.stream().forEach(System.out::println);
    }

}
