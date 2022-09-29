package com.silvia.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public static void arrayListMethod() {
        List<Integer> scoreList = new ArrayList<>();

        System.out.println("After initializing scoreList in arrayListMethod " + scoreList);

        scoreList.add(5);

        System.out.println("After adding to scoreList in arrayListMethod " + scoreList);
    }

    public static void linkedListMethod() {
        List<Integer> scoreList = new LinkedList<>();

        System.out.println("After initializing scoreList in linkedListMethod " + scoreList);

        scoreList.add(3);

        System.out.println("After adding to scoreList in linkedListMethod " + scoreList);
    }

}
