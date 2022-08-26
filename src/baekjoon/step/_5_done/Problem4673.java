package baekjoon.step._5_done;

import java.util.ArrayList;
import java.util.List;

public class Problem4673 {
    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=10000; i++){
            int n = d(i);
            if(list.indexOf(n) == -1 && n <= 10000) list.add(n);
        }
        for(int i=1; i<=10000; i++){
            if(list.indexOf(i) == -1) System.out.println(i);
        }
    }

    public static int d(int n){
        int re = n;
        if(n >= 10000){
        } else if (n >= 1000){
            re += n / 1000;
            re += (n%1000) / 100;
            re += (n%100) / 10;
        } else if (n >= 100){
            re += n / 100;
            re += (n%100) / 10;
        } else if (n >= 10){
            re += n / 10;
        }
        re += n%10;
        return re;
    }
}