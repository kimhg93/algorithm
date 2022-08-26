package baekjoon.step._7_done;

import java.util.Scanner;

public class Problem1193 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        int x = 1;
        int y = 1;
        boolean flag = false;
        boolean change = false;
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i>1){
                if(!change){
                    if(y == 1){
                        x += 1;
                        flag = true;
                    } else if (x == 1) {
                        y += 1;
                        flag = false;
                    }
                    change = true;
                } else {
                    if(flag){
                        y += 1;
                        x -= 1;
                        if(x == 1) change = false;
                    } else if(!flag){
                        y -= 1;
                        x += 1;
                        if(y == 1) change = false;
                    }
                }
            }
        }
        System.out.println(y+"/"+x);
    }
}