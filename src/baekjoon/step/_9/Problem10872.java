package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10872 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(r.readLine());
        if(n == 0) System.out.println(0);
        else System.out.println(pac(n, 1));
    }

    public static int pac(int n, int m){
        if(n == 1) return m;
        m = m * n;
        return pac(n-1, m);
    }
}
