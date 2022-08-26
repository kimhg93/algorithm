package baekjoon.step._3_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10951 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        while(true){
            String i = r.readLine();
            if(i == null) break;
            else {
                String[] arr = i.split(" ");
                sb.append(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1])).append("\n");
            }
        }
        System.out.println(sb);
    }
}