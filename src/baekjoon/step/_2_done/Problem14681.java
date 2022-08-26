package baekjoon.step._2_done;

import java.util.Scanner;

public class Problem14681 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();

        int r = 0;

        if(n<0) r = n2 > 0 ? 2 : 3;
        else  r = n2 > 0 ? 1 : 4;

        System.out.println(r);
    }
}