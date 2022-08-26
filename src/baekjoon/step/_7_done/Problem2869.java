package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem2869 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());

        System.out.println((goal - down - 1) / (up - down) + 1);
    }
}