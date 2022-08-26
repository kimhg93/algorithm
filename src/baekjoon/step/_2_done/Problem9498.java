package baekjoon.step._2_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem9498 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=90) System.out.println("A");
        else if(a>=80) System.out.println("B");
        else if(a>=70) System.out.println("C");
        else if(a>=60) System.out.println("D");
        else System.out.println("F");
    }
}