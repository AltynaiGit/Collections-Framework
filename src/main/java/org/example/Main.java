package org.example;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> arrays = new ArrayList<>();
        arrays.add(1);
        arrays.add(2);

        System.out.println("array: " + arrays.get(0));

        List<Integer> arraysLInked = new LinkedList<>();
        arraysLInked.get(11);
        arraysLInked.get(22);

        System.out.println("Linked: " + arraysLInked.get(1));

    }
}
