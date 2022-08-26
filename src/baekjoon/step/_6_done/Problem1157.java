package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem1157 {

    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        System.out.println(r(r.readLine().toUpperCase()));
    }

    public static String r(String str){
        int max = -1;
        String result = "";
        List<Integer> list = new ArrayList<>();
        while(str.length() > 0){
            String s = str.substring(0, 1);
            int bf = str.length();
            str = str.replaceAll(s, "");
            int af = str.length();
            list.add(bf-af);
            if(max < bf-af){
                max = bf-af;
                result = s;
            }
        }
        Collections.sort(list);
        if(list.size() > 1){
            int x = list.get(list.size()-1);
            int y = list.get(list.size()-2);
            if(x==y) result = "?";
        }
        return result;
    }
}