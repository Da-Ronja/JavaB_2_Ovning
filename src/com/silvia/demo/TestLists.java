package com.silvia.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public static void arrayListMethod() {
        List<Integer> scoreList = new ArrayList<>();

        System.out.println("After initializing scoreList in arrayListMethod " + scoreList);

        scoreList.add(5);
        scoreList.add(8);
        scoreList.add(2);
        scoreList.add(6);

        System.out.println("After adding to scoreList in arrayListMethod " + scoreList);

        scoreList.remove(0);

        System.out.println("After removing from scoreList in arrayListMethod " + scoreList);

        scoreList.set(1, 7);

        System.out.println("After changing in scoreList in arrayListMethod " + scoreList);

        int numByIndex = scoreList.get(2);
        System.out.println("Getting from scoreList in arrayListMethod by Variable " + numByIndex);
        System.out.println("Getting from scoreList in arrayListMethod in s.o.u.t " + scoreList.get(2));
        System.out.println(" ");
    }

    public static void linkedListMethod() {
        List<Integer> scoreList = new LinkedList<>();

        System.out.println("After initializing scoreList in linkedListMethod " + scoreList);

        /* scoreList.add(3);
        scoreList.add(8);
        scoreList.add(9);
        scoreList.add(6); */
        scoreList = addLinkedListMethod(3, 8, 9, 6);

        System.out.println("After adding to scoreList in linkedListMethod " + scoreList);

        scoreList.remove(3);

        System.out.println("After removing from scoreList in linkedListMethod " + scoreList);

        scoreList.set(1, 5);

        System.out.println("After changing in scoreList in linkedListMethod " + scoreList);

        int numByIndex = scoreList.get(0);
        System.out.println("Getting from scoreList in linkedListMethod by Variable " + numByIndex);
        System.out.println("Getting from scoreList in linkedListMethod in s.o.u.t " + scoreList.get(0));
        System.out.println(" ");
    }

    public static List<Integer> addLinkedListMethod(int x, int y, int z, int w) {
        List<Integer> scoreList = new LinkedList<>();

        scoreList.add(x);
        scoreList.add(y);
        scoreList.add(z);
        scoreList.add(w);

        return scoreList;
    }
}
