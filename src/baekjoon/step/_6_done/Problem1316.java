package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1316 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        List<Integer> list = new ArrayList<>();
        System.out.println(r());
    }

    public static int r() throws Exception{
        int cnt = 0;
        int n = Integer.parseInt(r.readLine());
        for(int j=0; j<n; j++){
            String str = r.readLine();
            boolean f = true;
            for(int i=0; i<str.length(); i++){
                String s = str.substring(i, i+1);
                int idx = str.indexOf(s, i+1);
                if(idx != -1 && idx != i+1){
                    f = false;
                    break;
                }
            }
            if(f) cnt++;
        }
        return cnt;
    }
}