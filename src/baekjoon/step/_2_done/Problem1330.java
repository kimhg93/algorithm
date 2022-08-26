package baekjoon.step._2_done;

import java.util.Scanner;

public class Problem1330 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(n < n2 ? "<" : n == n2 ? "==" : ">");
    }
}