package org.example;

import java.util.*;

public class Main {
    static void main() {
        List<String> list = new ArrayList<>(List.of("Altynai", "Swimming", "Triathlon", "Running"));
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println(list.get(list.size() - 1)); //последний выводит


        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(nums);
        nums.remove(2); // Удаляем элемент, стоящий на индексе
        nums.remove(5);

        System.out.println(nums);

        List<String> list1 = new ArrayList<>(List.of("Altynai", "Kutman", "Daniel", "Islan"));
        Scanner scn = new Scanner(System.in);
        String user = scn.nextLine();

        if (list1.contains(user)) { // сравниваем через contains
            System.out.println("Имя найдено: " + list1.indexOf(user)); //индекс выводит
        }else {
            System.out.println("Имя не найдено");
        }

        String pink = "\u001B[95m";
        String reset = "\u001B[0m";

        List<Integer> numss = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for (Integer num : numss) {
            sum += num;
        }
        double average = (double) sum / numss.size();

        System.out.println(pink + "══════════════════════════════════════════════" + reset);
        System.out.println(pink + "                КАЛЬКУЛЯТОР              " + reset);
        System.out.println(pink + "══════════════════════════════════════════════" + reset);
        System.out.println(pink + "Всего: " + reset + numss);
        System.out.println(pink + "Общая сумма: " + reset + sum);
        System.out.println(pink + "Среднее арифметическое: " + reset + average);
        Set<Integer> uniqNumbers = new TreeSet<>(); //• Элементы автоматически сортируются, Нужна сортировка, Нужен диапазон значений
        uniqNumbers.add(11);
        uniqNumbers.add(11);
        uniqNumbers.add(12);
        uniqNumbers.add(14);
        uniqNumbers.add(13);
        System.out.println("TreeSet: " + uniqNumbers);

        Set<Integer> uniqNumbers1 = new LinkedHashSet<>(); //Сохраняет порядок вставки, Нужна уникальность, Нужен порядок
        uniqNumbers1.add(11);
        uniqNumbers1.add(11);
        uniqNumbers1.add(12);
        uniqNumbers1.add(14);
        uniqNumbers1.add(13);
        System.out.println("LinkedHashSet: " + uniqNumbers1);

        Set<Integer> uniqNumbers2 = new HashSet<>(); // • Быстрые операции O(1), Не гарантирует порядок
        uniqNumbers2.add(11);
        uniqNumbers2.add(20);
        uniqNumbers2.add(12);
        uniqNumbers2.add(14);
        uniqNumbers2.add(13);
        System.out.println("HashSet: " + uniqNumbers1);

        List<Integer> numsss = new ArrayList<>(List.of(1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 9, 9, 10));
        System.out.println("Было : " + nums);
        System.out.println("Повторяющиеся числа: ");
        System.out.println("Какое число часто повторялось: ");


    }
}
