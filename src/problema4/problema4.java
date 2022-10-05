package problema4;

import java.util.ArrayList;

import java.util.Scanner;

public class problema4  {

    public static Scanner sc = new Scanner(System.in);



    public static void main(String[] args) {
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int sum = 0;
            int x = 0;
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>(n);


            for (int j = 0; j < n; j++) {
                a.add(sc.nextInt());
                sum += a.get(j);
            }

            sortIntegerArrayBubble(a);

            if (k < ((n/2)+1)) {
                for (int j = 0; j < k; j++) {
                    x+=a.get(j);
                }

                int f = sum-x;
                int ans = f-x;
                System.out.println(ans);
            } else {
                for (int j = 0; j < n-k; j++) {
                    x+=a.get(j);
                }

                int f = sum-x;
                int ans = f-x;
                System.out.println(ans);
            }
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
