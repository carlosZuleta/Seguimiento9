package problema7;

import java.util.ArrayList;
import java.util.Scanner;

public class problema7 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t;
        t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n;
            n = sc.nextInt();
            int k;
            k = sc.nextInt();
            ArrayList<Long> a = new ArrayList<>();

            for (int j = 0; j < n; j++)
            {
                a.add(sc.nextLong());
            }

            sortIntegerArrayBubble(a);

            for (int j = n - 2; j >= 0 && k > 0; j--, k--)
            {
                long x = a.get(n-1);
                a.set(n-1, x + a.get(j));
            }

            System.out.println(a.get(n-1));
        }
    }
    private static void sortIntegerArrayBubble(ArrayList<Long> a) {
        long startTime = System.nanoTime();
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.size() - i; j++) {
                if (a.get(j) < a.get(j - 1)) {
                    // get values to swap
                    long anterior = a.get(j - 1);
                    long actual = a.get(j);
                    // swap
                    a.set(j, anterior);
                    a.set(j - 1, actual);
                }
            }
        }
    }
}
