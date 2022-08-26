package baekjoon.step._14;

import java.util.Scanner;

public class Problem2609 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = 0;
        for(int i=1; i<=a*b; i++){
            if(a%i==0&&b%i==0){
                if(i>temp){
                    temp = i;
                }
            }
        }
        int c = a*b/temp;
        System.out.println(temp);
        System.out.println(c);
    }
}