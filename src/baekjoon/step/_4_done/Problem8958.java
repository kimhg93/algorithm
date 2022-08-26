package baekjoon.step._4_done;

import java.io.IOException;
import java.util.Scanner;

public class Problem8958 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int[] bs = new int[a];
        for(int i=0; i<a; i++) {
            int score = 0;
            int flag = 1;
            String b = sc.next();
            String[] c = new String[b.length()];
            for(int j=0; j<b.length(); j++) {
                c[j] = b.substring(j, j+1);
            }
            for(int j=0; j<b.length();j++) {
                if(c[j]=="O"||c[j].equals("O")) {
                    score += flag;
                    flag++;
                } else {
                    flag = 1;
                }
            }
            bs[i] = score;
        }
        for(int i=0; i<a; i++) {
            System.out.println(bs[i]);
        }
    }
}