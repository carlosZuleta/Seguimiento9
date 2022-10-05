package problema5;

import java.util.Scanner;

public class problema5 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] p = new int[n+1];
            int[] jump = new int[n+1];
            int[] index = new int[n+1];

            for (int j = 0; j < n; j++) {
                int a = sc.nextInt();
                index[j] = a;
                p[a] = j;
            }

            for (int j = 0; j < n; j++) {
                jump[index[j]] = sc.nextInt();
            }

            int ans = 0;
            boolean change = true;

            while (change) {
                change = false;
                for (int k = 1; k < n; k++) {
                    if (p[k] >= p[k + 1]) {
                        p[k+1] += jump[k+1];
                        change = true;
                        ans++;
                    }
                }
            }

            System.out.println(ans);
        }
    }
}
