package baekjoon.step._14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3036 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        int[] arr = new int[cnt];

        for(int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<arr.length; i++){
            int gcd = gcd(arr[0], arr[i]);
            System.out.println(arr[0]/gcd + "/" + arr[i]/gcd);
        }
    }

    public static int gcd(int p, int q){
        if (q == 0) return p;
        return gcd(q, p%q);
    }
}