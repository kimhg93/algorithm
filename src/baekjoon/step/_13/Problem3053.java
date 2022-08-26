package baekjoon.step._13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Problem3053 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int R = Integer.parseInt(r.readLine());
        DecimalFormat df = new DecimalFormat("#######.000000");
        double a = R*R*Math.PI;
        double b = R*2*R;
        System.out.println(df.format(a));
        System.out.println(df.format(b));
    }
}