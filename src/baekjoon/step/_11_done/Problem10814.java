package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem10814 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        List<Map<String, Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            Map<String, Integer> map = new HashMap<>();
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            map.put(name, age);
            list.add(map);
        }

        Collections.sort(list, (o1, o2) -> {
            Integer age1 = (Integer) o1.values().toArray()[0];
            Integer age2 = (Integer) o2.values().toArray()[0];
            return age1.compareTo(age2);
        });

        for(int i=0; i<n; i++){
            Map<String, Integer> reMap = list.get(i);
            sb.append(reMap.values().toArray()[0])
                    .append(" ")
                    .append(reMap.keySet().toArray()[0])
                    .append("\n");
        }
        System.out.println(sb);
    }
}