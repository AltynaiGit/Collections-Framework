package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Integer> arrays = new ArrayList<>();
        arrays.add(5);
        arrays.add(15);
        arrays.add(30);
        arrays.add(50);

        int sum = 0;
        for (Integer numbers: arrays){
            int a = numbers;
            sum +=a;
        }

        System.out.println("Итого: " + sum);

    }
}
