package baekjoon.step._3_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem10871 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        String re = "";
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            if(arr[i]<x) {
                re += (arr[i]+" ");
            }
        }
        System.out.println(re);
    }
}