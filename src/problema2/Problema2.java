package problema2;

import java.util.*;

public class Problema2 {
    public static Scanner sc = new Scanner(System.in);

    public static int[] bubbleSort(int[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        a = bubbleSort(a);

        int cnt = 0;
        int prev = 0;
        boolean imp = false;

        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i-1] && a[i] != prev) {
                cnt++;
                prev = a[i];
            } else if (a[i] == prev && a[i] != 0) {
                imp = true;
                break;
            }
        }

        if (imp) {
            System.out.println(-1);
        } else {
            System.out.println(cnt);
        }
    }
}
