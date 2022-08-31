package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem25305 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        StringTokenizer st2 = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int rank = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[arr.length-rank]);
    }
}