package org_GeekBrains.Seminar_1.Sw_2;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        /**
         * Задача 2.
         * Дана последовательность N целых чисел.
         * Найти количество положительных чисел, после которых следует отрицательное число
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину последовательности: ");
        int n = scanner.nextInt();
        int k = getK(scanner, n);
        System.out.println("k = " + k);
    }

    private static int getK(Scanner scanner, int n) {
        int k = 0;
        int a = scanner.nextInt();
        int b;
        for (int i = 0; i < n - 1; i++) {
            b = scanner.nextInt();
            if (a > 0 && b < 0) {
                k++;
            }
            a = b;
        }
        return k;
    }
}


