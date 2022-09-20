package baekjoon.step._14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1676 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        int cnt = 0;
        while(n >= 5){
            cnt += n/5;
            n/=5;
        }
        System.err.println(cnt);
    }
}