package baekjoon.step._8_done;

import java.util.Scanner;

public class Problem1978 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        int cnt = sc.nextInt();
        int result = 0;
        for(int i=0; i<cnt; i++){
            int num = sc.nextInt();
            result += primeNumber(num);
        }
        System.out.println(result);
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