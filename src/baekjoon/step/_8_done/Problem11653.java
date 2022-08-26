package baekjoon.step._8_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem11653 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(r.readLine());

        for(int i=2; i<=Math.sqrt(num); i++){
            while(num%i==0){
                sb.append(i).append('\n');
                num /= i;
            }
        }
        if (num != 1) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}