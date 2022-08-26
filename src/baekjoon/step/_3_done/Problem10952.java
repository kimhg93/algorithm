package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem10952 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = 9999;
        int cnt = 0;
        int[] re = new int[n];
        for(int i=0; i<n; i++){
            int a = sc.nextInt()+sc.nextInt();
            if(a==0) break;
            else {
                re[i] = a;
                cnt++;
            }
        }
        for(int i=0; i<cnt; i++) {
            System.out.println(re[i]);
        }
    }
}