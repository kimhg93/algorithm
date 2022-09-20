package baekjoon.step._14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11050 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n==m || m == 0) System.out.println(1);
        else System.out.println(fac(n)/(fac(n-m)*fac(m)));
    }
    public static int fac(int n){
        if(n==1) return n;
        return n * fac(n-1);
    }
}