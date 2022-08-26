package baekjoon.step._8_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem9020 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        for(int j=0; j<cnt; j++){
            int num = Integer.parseInt(r.readLine());
            int min = num;
            String result = "";
            for(int i=2; i<num-1; i++){
                if(primeNumber(i)){
                    int n = Math.abs(i-num);
                    if(primeNumber(n) && Math.abs(i-n) < min){
                        result = i + " " + n;
                        min = Math.abs(i-n);
                    }
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }

    public static boolean primeNumber(int num){
        if(num < 2) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }
}