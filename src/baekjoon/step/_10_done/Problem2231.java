package baekjoon.step._10_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem2231 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(r.readLine());
        int length = 1000000;
        while(num/length == 0){
            length /= 10;
        }

        for(int i=1; i<=num; i++){
            int re = i;
            int j = i;
            int R = length;

            while(R >= 0){
                if(re > num) break;
                if(R == 0) {
                    re = re + j;
                    break;
                } else {
                    re = re + (j/R);
                    j = j%R;
                    R /= 10;
                }
            }
            if(re == num){
                System.out.println(i);
                break;
            }
            if( i==num) System.out.println(0);
        }

    }
}