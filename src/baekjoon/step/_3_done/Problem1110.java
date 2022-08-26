package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem1110 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = n;
        int m = n;
        int cnt = 0;
        int temp10 = 0;
        int temp1 = 0;
        for (int i = 0; i < 100; i++) {
            temp10 = n / 10;
            temp1 = n % 10;
            m = n;
            if (temp10 + temp1 < 10) {
                n = (temp1 * 10) + temp10 + temp1;
                cnt++;
            } else {
                temp10 = n / 10;
                temp1 = n % 10;
                n = temp10 + temp1;
                temp10 = n / 10;
                temp1 = n % 10;
                n = ((m % 10) * 10 + temp1);
                cnt++;
            }
            if (nn == n) {
                System.out.println(cnt);
                break;
            }
        }
    }
}