package baekjoon.step._11_done;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Problem2750 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}