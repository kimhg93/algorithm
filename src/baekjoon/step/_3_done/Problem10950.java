package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem10950 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] re = new int[n];
        for(int i=0; i<n; i++){
            re[i] = sc.nextInt()+sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.println(re[i]);
        }
    }
}