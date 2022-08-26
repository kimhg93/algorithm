package baekjoon.step._8_done;

import java.util.Scanner;

public class Problem1929 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int M = sc.nextInt();
        int N = sc.nextInt();

        for(int i=M; i<=N; i++){
            if(primeNumber(i) == 1) System.out.println(i);
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