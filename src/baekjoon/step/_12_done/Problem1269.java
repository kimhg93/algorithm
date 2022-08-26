package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1269 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        StringTokenizer stIn = new StringTokenizer(r.readLine());
        StringTokenizer stN = new StringTokenizer(r.readLine());
        StringTokenizer stM = new StringTokenizer(r.readLine());
        int N = Integer.parseInt(stIn.nextToken());
        int M = Integer.parseInt(stIn.nextToken());
        int[] arrN = new int[N];
        int[] arrM = new int[M];
        int cnt = 0;

        for(int i=0; i<N+M; i++){
            if(i<N) arrN[i] =Integer.parseInt(stN.nextToken());
            else arrM[i-N] = Integer.parseInt(stM.nextToken());
        }

        Arrays.sort(arrN);
        Arrays.sort(arrM);

        for(int i=0; i<N+M; i++){
            if(i<N){
                if(!binarySearch(arrM, arrN[i])) cnt++;
            } else {
                if(!binarySearch(arrN, arrM[i-N])) cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static boolean binarySearch(int[] arr, int n){
        int s = 0;
        int e = arr.length-1;
        int m = (s+e) / 2;

        while(e >= s) {
            if(arr[m] == n)return true;
            else if(arr[m] > n) e = m-1;
            else s= m+1;
            m = (s+e) / 2;
        }
        return false;
    }
}