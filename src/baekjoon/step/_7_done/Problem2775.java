package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2775 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{

        int n = Integer.parseInt(r.readLine());
        int[] ar = new int[n];
        for(int k=0; k<n; k++){
            int a = Integer.parseInt(r.readLine());
            int b = Integer.parseInt(r.readLine());
            int[] arr = new int[b];
            for(int i = 0; i<= a; i++){
                for(int j=0; j<b; j++ ){
                    if(i == 0){
                        arr[j] = j+1;
                    } else {
                        if(j > 0) arr[j] = arr[j] + arr[j-1];
                    }
                }
            }
            ar[k] = arr[b-1];
        }
        for(int re : ar){
            System.out.println(re);
        }
    }
}