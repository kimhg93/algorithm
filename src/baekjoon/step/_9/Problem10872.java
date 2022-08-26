package baekjoon.step._9;

import java.io.IOException;
import java.util.Scanner;

public class Problem10872 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long pac = 1;
        for(int i=1; i<=a; i++){
            pac = pac*i;
        }
        int cnt = 0;
        String c = Long.toString(pac);
        String[] ar = new String[c.length()];
        ar = c.split("");
        for(int i=ar.length-1; i>=0; i--){
            if(ar[i].equals("0")) cnt++;
            else if(ar[i].equals("0")==false) break;
        }
        System.out.println(pac);
    }
}