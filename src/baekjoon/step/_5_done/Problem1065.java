package baekjoon.step._5_done;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1065 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<>();
        System.out.println(d(sc.nextInt()));
    }

    public static int d(int n){
        int result = 0;
        for(int i=1; i<=n; i++){
            int a = i;
            int b = 0;
            int c = 10;
            while(a!=0){
                b = a%10;
                a = a/10;
                if(a!=0){
                    if(c != 10 && c != b-a%10) break;
                } else {
                    result++;
                }
                c = b-a%10;
            }
        }
        return result;
    }
}

