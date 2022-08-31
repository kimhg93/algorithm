package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1427 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);
    }
}