package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10815 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int N = Integer.parseInt(r.readLine());
        String str1 = r.readLine();
        StringTokenizer st1 = new StringTokenizer(str1);
        int[] arr1 = new int[N];

        for(int i=0; i<N; i++){
            arr1[i] = Integer.parseInt(st1.nextToken());
        }
        Arrays.sort(arr1);

        int M = Integer.parseInt(r.readLine());
        String str2 = r.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        for(int i=0; i<M; i++){
            int m = Integer.parseInt(st2.nextToken());
            if(Arrays.binarySearch(arr1, m) >= 0) sb.append(1);
            else sb.append(0);
            if(M-1 != i) sb.append(" ");
        }
        System.out.println(sb);
    }
}