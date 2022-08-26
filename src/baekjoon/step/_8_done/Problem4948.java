package baekjoon.step._8_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem4948 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.parseInt(r.readLine());
            if(num == 0) break;
            else {
                int result = 0;
                for(int i=num+1; i<=num*2; i++){
                    result += primeNumber(i);
                }
                list.add(result);
            }
        }

        for(int re : list){
            System.out.println(re);
        }
    }

    public static int primeNumber(int num){
        if(num < 2) return 0;
        else if(num == 2) return 1;
        else {
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0) return 0;
            }
            return 1;
        }
    }
}