package baekjoon.step._3_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem25304 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        int total = Integer.parseInt(r.readLine());
        int cnt = Integer.parseInt(r.readLine());
        int sum = 0;
        for(int i=0; i<cnt; i++){
            StringTokenizer st = new StringTokenizer(r.readLine(), " ");
            sum += Integer.parseInt(st.nextToken())*Integer.parseInt(st.nextToken());
        }
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}