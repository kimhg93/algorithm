package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem1620 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> idxMap = new HashMap<>();
        Map<String, Integer> valueMap = new HashMap<>();

        for(int i=0; i<N+M; i++){
            String s = r.readLine();
            if(i < N){
                idxMap.put(i, s);
                valueMap.put(s, i);
            } else {
                try{
                    sb.append(idxMap.get(Integer.parseInt(s)-1));
                } catch (NumberFormatException e){
                    sb.append(valueMap.get(s)+1);
                } finally {
                    if(i<N+M-1) sb.append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}