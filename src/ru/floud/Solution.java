package ru.floud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by halturin_a on 10.09.2014.
 */
public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Программа подсчета количества разбиений числа на заданное число слагаемых. Введите число: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Введите число слагаемых: ");
        int k = Integer.parseInt(reader.readLine());
        System.out.println(count(n, k));
    }

    public static int count(int n, int k) {
        if (n == k) return 1;
        if (k == 1) return 1;
        if (k > n) return 0;
        return count(n - 1, k - 1) + count(n - k, k);
    }
}
