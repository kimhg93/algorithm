package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10870 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    private static int bn = 0;
    private static int an = 1;

    public static void main(String[] args) throws Exception{
        int cnt = Integer.parseInt(r.readLine());
        fibonacci(cnt-1);
    }

    public static void fibonacci(int cnt){
        if(cnt > 0) {
            int temp = 0;
            temp = bn;
            bn = an;
            an = temp+bn;
            cnt--;
            fibonacci(cnt);
        } else if(cnt < 0){
            System.out.println(bn);
        } else {
            System.out.println(an);
        }

    }
}