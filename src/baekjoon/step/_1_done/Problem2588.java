package baekjoon.step._1_done;

import java.util.Scanner;

public class Problem2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String num2 = sc.nextLine();
        for(int i=num2.length()-1; i>=0; i--){
            System.out.println(Integer.parseInt(num) * Integer.parseInt(num2.substring(i, i+1)));
        }
        System.out.println(Integer.parseInt(num)*Integer.parseInt(num2));
    }
}