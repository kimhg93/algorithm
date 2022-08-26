package baekjoon.step._6_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem2675 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] reb = new String[n];
        for(int i=1; i<=n; i++) {
            int m = sc.nextInt();
            String x = sc.nextLine();
            int y = x.length();
            String re = "";
            for(int j=1; j<y; j++) {
                for(int k=1; k<=m; k++) {
                    re += x.charAt(j);
                }
            }
            reb[i-1] = re;
        }
        for(int i=0; i<n; i++) {
            System.out.println(reb[i]);
        }
    }
}