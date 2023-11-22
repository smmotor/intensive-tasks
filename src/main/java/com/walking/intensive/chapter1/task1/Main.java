package com.walking.intensive.chapter1.task1;

/**
 * Условие: <a href="https://geometry-math.ru/homework/Java-age.html">ссылка</a>
 */

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println(getAgeString(age));
    }

    static String getAgeString(int age) {
        if (age < 0 || age > 127) {
            return "Введен некорректный возраст";
        } else {
            if ((age % 10 == 0 || age % 10 >= 5) || (age % 100 >= 11 && age % 100 <= 14)) {
                return String.format("Вам %d лет", age);
            } else if (age % 10 == 1) {
                return String.format("Вам %d год", age);
            } else {
                return String.format("Вам %d года", age);
            }
        }
    }
}