package baekjoon.step._13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem4153 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        while(true){
            StringTokenizer st = new StringTokenizer(r.readLine());
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            if(arr[0]==0&&arr[1]==0&&arr[2]==0) break;
            Arrays.sort(arr);
            if(Math.pow(arr[0], 2)+Math.pow(arr[1], 2) == Math.pow(arr[2], 2)) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }
        System.out.print(sb);
    }
}