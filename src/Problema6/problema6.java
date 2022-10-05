package Problema6;

import java.util.ArrayList;

import java.util.Scanner;

public class problema6 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
            }

            sortIntegerArrayBubble(a);

            int min = 1000000000;

            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j+1) - a.get(j) < min) {
                    min = a.get(j+1) - a.get(j);
                }
            }

            System.out.println(min);
        }
    }
    private static void sortIntegerArrayBubble(ArrayList<Integer> a) {
        long startTime = System.nanoTime();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size() - i; j++) {
                if (a.get(j) < a.get(j - 1)) {
                    // get values to swap
                    int anterior = a.get(j - 1);
                    int actual = a.get(j);
                    // swap
                    a.set(j, anterior);
                    a.set(j - 1, actual);
                }
            }
        }
    }
}
