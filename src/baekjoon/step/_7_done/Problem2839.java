package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2839 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        int re = 0;
        while(cnt > 0){
            if(cnt < 15 && cnt%3 == 0) cnt -= 3;
            else cnt -= 5;

            if(cnt != 0 && cnt < 3) {
                re = -1;
                break;
            } else {
                re++;
            }
        }
        System.out.println(re);
    }
}