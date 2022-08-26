package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2941 {

    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = r.readLine();

        a = a.replaceAll("c=", ",")
                .replaceAll("c-", ",")
                .replaceAll("dz=", ",")
                .replaceAll("d-", ",")
                .replaceAll("lj", ",")
                .replaceAll("nj", ",")
                .replaceAll("s=", ",")
                .replaceAll("z=", ",");

        System.out.println(a.length());
    }
}