package baekjoon.step._4_done;

import java.util.Scanner;

public class Problem10818 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int idx = sc.nextInt();
        int[] arr = new int[idx];
        int max = -1000000;
        int min = 1000000;

        for(int i=0; i<idx; i++){
            arr[i] = sc.nextInt();
        }

        for(int r : arr){
            max = r > max ? r : max;
            min = r < min ? r : min;
        }

        System.out.println(min+" "+max);
    }
}