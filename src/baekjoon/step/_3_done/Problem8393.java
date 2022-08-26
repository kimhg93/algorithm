package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem8393 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int re = 0;
        int a = sc.nextInt();
        for(int i=1; i<=a; i++) {
            re+=i;
        }
        System.out.println(re);
    }
}