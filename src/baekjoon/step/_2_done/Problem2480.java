package baekjoon.step._2_done;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem2480 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int re = 0;
        List<Integer> l = new ArrayList<>();
        l.add(a);
        l.add(b);
        l.add(c);


        if(a==b && b==c) re += 10000 + (1000*a);
        else if(a==b || a==c) re += 1000 + (100*a);
        else if(b==c) re += 1000 + (100*b);
        else if(a!=b && b!=c && a!=c)re = Collections.max(l)*100;

        System.out.println(re);
    }
}