package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1764 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> mapN = new HashMap<>();
        Map<String, Integer> mapM = new HashMap<>();


        for(int i=0; i<N+M; i++){
            if(i < N) mapN.put(r.readLine(), i);
            else mapM.put(r.readLine(), i);
        }

        List<String> list = new ArrayList<>();

        if(N < M){
            mapN.forEach((i, d) -> {
                Integer r = mapM.get(i);
                if(r != null) list.add(i);
            });
        } else {
            mapM.forEach((i, d) -> {
                Integer r = mapN.get(i);
                if(r != null) list.add(i);
            });
        }
        int size = list.size();
        Collections.sort(list);

        for(int i=0; i<size; i++){
            if(i<size-1) sb.append(list.get(i)).append("\n");
            else sb.append(list.get(i));
        }

        System.out.println(size);
        System.out.println(sb);

    }
}