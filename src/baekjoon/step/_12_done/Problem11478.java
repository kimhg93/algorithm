package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Problem11478 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        int len = str.length();
        Map<String, Integer> map = new HashMap<>();

        for(int i=1; i<=len; i++){
            for(int j=0; j<len; j++){
                if(j+i > len) break;
                String s = str.substring(j, j+i);
                try{
                    map.put(s,i);
                } catch (Exception e){
                    // 키 중복
                }
            }
        }
        System.out.println(map.size());
    }
}