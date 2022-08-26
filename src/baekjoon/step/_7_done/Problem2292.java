package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2292 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        int re = 0;
        int add = 1;

        for(int i=1; i<=cnt; i++){
            add += 6*i;
            if(add >= cnt) {
                re = i+1;
                break;
            }
        }
        if(cnt == 1) re = 1;

        System.out.println(re);
    }
}