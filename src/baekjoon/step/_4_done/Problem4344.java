package baekjoon.step._4_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem4344 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] re = new double[n];
        for(int i=0; i<n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            double sum = 0;
            double avg = 0;

            for(int j=0; j<m; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }

            avg = sum / m;
            int cnt = 0;

            for(int j=0; j<m; j++) {
                if(arr[j]>avg) cnt++;
            }

            re[i] = ((double)cnt/m)*100;
        }
        for(int i=0; i<n; i++) {
            System.out.printf("%.3f",re[i]);
            System.out.println("%");
        }
    }
}