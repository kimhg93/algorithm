package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1712 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long D = 1;

        if(B == 0) D = C;
        else D = (C-B);

        if(B > C || C==0 || B==C) {
            System.out.println("-1");
            return;
        }

        for(long i=A/D; i<=A+1; i++){
            if(D*i > A){
                System.out.println(i);
                break;
            }
        }
    }
}