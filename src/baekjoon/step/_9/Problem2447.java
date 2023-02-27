package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2447 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    private static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new char[n][n];

        star(0, 0, n, false);

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }

    static void star(int x, int y, int n, boolean b) {
        if(b){
            for (int i=x; i<x+n; i++) {
                for (int j=y; j<y+n; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        int len = n/3;
        int cnt = 0;
        for (int i=x; i<x+n; i+=len) {
            for (int j=y; j<y+n; j+=len) {
                cnt++;
                if (cnt == 5) star(i, j, len, true);
                else star(i, j, len, false);
            }
        }
    }
}