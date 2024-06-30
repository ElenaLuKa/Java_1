package org_GeekBrains.Seminar_1.Sw_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = getGetSumMinusPr(n);
        System.out.println("result=" + result);
    }

    private static int getGetSumMinusPr(int n) {
        int sum = 0;
        int pr = 1;
        while (n != 0) {
            sum += n % 10;
            pr *= n % 10;
            n /= 10;
        }
        return pr - sum;
    }
}