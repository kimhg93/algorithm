package baekjoon.step._10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2798 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);
        List<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        String str2 = r.readLine();
        StringTokenizer st2 = new StringTokenizer(str2);

        while(st2.hasMoreTokens()){
            list.add(Integer.parseInt(st2.nextToken()));
        }

        Collections.sort(list);
        System.out.println(calc(list, num));
    }

    public static int calc(List<Integer> list, int num){
        int max = 0;
        for(int i : list){
            for(int j : list){
                if(i==j) break;
                for(int k : list){
                    if(j==k) break;
                    int re = i+j+k;
                    if(re > num) break;
                    else if(re <= num && re > max) max = re;
                }
            }
        }
        return max;
    }
}