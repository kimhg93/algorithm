package baekjoon.step._8_done;

import java.util.Scanner;

public class Problem2581 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        int min = b;
        int sum = 0;
        for(int i=a; i<=b; i++){
            for(int j=1; j<=b; j++){
                if(i%j==0){
                    cnt++;
                }
            }
            if(cnt==2){
                sum = sum + i;
                if(min>i){
                    min = i;
                }
            }
            cnt = 0;
        }
        if(sum ==0){
            sum = -1;
            System.out.println(sum);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}