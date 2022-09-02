package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10870 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        System.out.println(fibonacci( Integer.parseInt(r.readLine())));
    }

    public static int fibonacci(int n){
        if(n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}