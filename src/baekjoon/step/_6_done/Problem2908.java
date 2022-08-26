package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2908 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(r.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String newA = "";
        String newB = "";
        String tempA = "";
        String tempB = "";

        for(int i=0; i<a.length();i++) {
            tempA = a.substring(a.length()-i-1,a.length()-i);
            newA += tempA;
        }
        for(int i=0; i<b.length(); i++) {
            tempB = b.substring(b.length()-i-1,b.length()-i);
            newB += tempB;
        }
        int reA = Integer.parseInt(newA);
        int reB = Integer.parseInt(newB);

        if(reA>reB) {
            System.out.println(reA);
        } else {
            System.out.println(reB);
        }
    }
}