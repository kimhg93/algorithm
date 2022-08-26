package baekjoon.step._4_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        double sum = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>max) max = arr[i];

        }
        for (int i = 0; i < n; i++) {
            if (arr[i]!=max) sum += (((double)arr[i] / (double)max) * 100);
            else sum += 100;

        }

        if(((sum /n)*100)%100==0) System.out.printf("%.2f",sum /n);
        else System.out.println(sum /n);

    }
}