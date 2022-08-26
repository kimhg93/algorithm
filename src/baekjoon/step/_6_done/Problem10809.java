package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10809 {

    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String n = r.readLine();
        int[] re = new int[26];
        for(int i=97; i<=122; i++) {
            char str = (char)i ;
            re[i-97] = n.indexOf(str);
        }
        for(int i=0;i<26;i++) {
            if(i==25) System.out.print(re[i]);
            else System.out.print(re[i]+" ");
        }
    }
}