package baekjoon.step._3_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem15552 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int l = Integer.parseInt(r.readLine());
        for(int i=0; i<l; i++){
            String a = r.readLine();
            String[] arr = a.split(" ");
            sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
        }
        System.out.println(sb);
    }
}