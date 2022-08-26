package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem11022 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] re = new String[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            re[i] = "Case #"+ (i + 1) +": "+ a +" + "+ b +" = "+ (a + b);
        }
        for(int i=0; i<n; i++) {
            System.out.println(re[i]);
        }
    }
}