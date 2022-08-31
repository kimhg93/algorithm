package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem18870 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        int[] arr = new int[n];

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(r.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sort = Arrays.copyOf(arr, n);
        Arrays.sort(sort);
        int cnt = 0;

        for(int i=0; i<n; i++){
            int num = sort[i];
            if(map.get(num) == null) {
                map.put(num, cnt);
                cnt++;
            }
        }

        for(int i=0; i<n; i++){
            sb.append(map.get(arr[i])).append(" ");
        }
        System.out.println(sb);
    }
}