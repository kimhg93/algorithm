package baekjoon.step._6_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem11720 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int re = 0;
        int i = sc.nextInt();
        String a = sc.next();
        for(int j=0; j<i; j++) {
            re += Integer.parseInt(a.substring(j, j+1));
        }
        System.out.println(re);
    }
}