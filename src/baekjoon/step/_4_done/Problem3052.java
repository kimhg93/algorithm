package baekjoon.step._4_done;

import java.util.Scanner;

public class Problem3052 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int[] arr = new int[10];
        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt()%42;
        }

        int same = 0;

        for(int j=0; j<10; j++){
            for(int k=j+1; k<10; k++){
                if(arr[j] == arr[k]){
                    same += 1;
                    break;
                }
            }
        }
        System.out.println(10-same);
    }
}