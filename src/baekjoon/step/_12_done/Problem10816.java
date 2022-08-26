package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem10816 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int cnt = Integer.parseInt(r.readLine());
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int[] arr = new int[cnt];

        for(int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int cnt2 = Integer.parseInt(r.readLine());
        String str2 = r.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        while(st2.hasMoreTokens()){
            int n = Integer.parseInt(st2.nextToken());
            int rCnt = upper(arr, n, 0, arr.length) - lower(arr, n, 0, arr.length);
            // upper(arr, n, 0, arr.length) - lower(arr, n, 0, arr.length);
            if(st2.hasMoreTokens()) sb.append(rCnt).append(" ");
            else sb.append(rCnt);
        }
        System.out.println(sb);
    }


    public static int lower(int[] arr, int n, int s, int e){
        while(s < e){
            int m = (s+e)/2;
            if (arr[m] >= n) e = m;
            else s = m + 1;
        }
        return e;
    }
    public static int upper(int[] arr, int n, int s, int e){
        while (s < e){
            int m = (s+e)/2;
            if (arr[m] > n) e = m;
            else s = m + 1;
        }
        return e;
    }
}