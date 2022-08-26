package baekjoon.step._2_done;

import java.util.Scanner;

public class Problem2525 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();

        int reh = h;
        int rem = 0;
        int div = (m+a)/60;

        if(div >= 1) reh = h+div > 23 ? h+div - 24 : h+div;
        rem = (m+a)%60;

        System.out.println(reh+" "+rem);
    }
}