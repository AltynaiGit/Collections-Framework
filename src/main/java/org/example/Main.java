package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scn = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Daniel");
        list.add("Altynai");
        list.add("Islan");
        list.add("Sanzhar");
        list.add("Askat");
        list.add("Kutman");

        String user = scn.nextLine();

        if (list.contains(user)) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно ввели имя");
        }
    }
}
