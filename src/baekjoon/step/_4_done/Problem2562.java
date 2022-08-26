package baekjoon.step._4_done;

import java.util.Scanner;

public class Problem2562 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int idx = 9;
        int[] arr = new int[idx];
        int max = -1000000;
        int arrIdx = 0;

        for(int i=0; i<idx; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<idx; i++){
            if(arr[i] > max){
                max = arr[i];
                arrIdx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(arrIdx);
    }
}