package problema3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class problema3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String n = sc.nextLine();
        String r = sc.nextLine();
        String d = sc.nextLine();

        String a = n + r;

        String ds = sortString(d);
        String as = sortString(a);

        if (ds.equals(as)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String sortString(String s) {
        char[] c1 = s.toCharArray();

        bubbleSort(c1);
        return String.valueOf(c1);
    }

    public static char[] bubbleSort(char[] a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = (char) t;
                }
            }
        }
        return a;
    }




}
