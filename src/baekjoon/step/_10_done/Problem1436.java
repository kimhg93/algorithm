package baekjoon.step._10_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1436 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        List<Integer> list = new ArrayList<>();
        int i=666;
        while(list.size() < 10000){
            if(Integer.toString(i).indexOf("666") > -1) list.add(i);
            i++;
        }
        System.out.println(list.get(cnt-1));
    }
}