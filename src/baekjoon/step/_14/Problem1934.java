package baekjoon.step._14;

import java.io.IOException;
import java.util.Scanner;

public class Problem1934 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] re = new int[n];

        for(int j=0; j<n; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = gcd(a, b) ;
            re[j] = a*b/temp;
        }
        for(int i=0; i<n; i++) {
            System.out.println(re[i]);
        }
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }
}