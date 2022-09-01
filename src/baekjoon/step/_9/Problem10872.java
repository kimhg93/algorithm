package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10872 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(r.readLine());
        if(n == 0) System.out.println(1);
        else System.out.println(fac(n));
    }

    public static int fac(int n){
        if(n == 1) return n;
        return n * fac(n-1);
    }
}
