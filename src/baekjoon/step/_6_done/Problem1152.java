package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1152 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String n = r.readLine();
        String m = "";
        int x = 0;
        int y = 0;
        x = n.length();
        m = n.replaceAll(" ", "");
        y = m.length();
        int lastIndexOf = n.lastIndexOf(" ");

        if(x==lastIndexOf+1) y += 1;
        if(n.indexOf(" ")==0) y += 1;

        if(n.length()==0) System.out.println(0);
        else if(n.length()==m.length()) System.out.println(1);
        else System.out.println(x-y+1);

    }
}