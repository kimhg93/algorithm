package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2108 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        int[] arr = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++){
            int num = Integer.parseInt(r.readLine());
            arr[i] = num;
            sum+=num;
        }
        Arrays.sort(arr);

        sb.append((int) Math.round((double)sum/n)).append("\n")
                .append(arr[n/2]).append("\n")
                .append(mode(arr)).append("\n")
                .append(arr[n-1] - arr[0]).append("\n");

        System.out.println(sb);
    }

    public static int mode(int[] arr) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int cnt = 0;
            for(int j=i; j<arr.length; j++){
                if(arr[i] < arr[j]) break;
                else cnt++;
            }
            if(cnt > max) max = cnt;
            map.put(arr[i], cnt);
            i+=cnt-1;
        }

        List<Map.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        for(int i=0; i<list.size(); i++){
            if(list.get(i).getValue() < max){
                list.remove(i);
                i--;
            }
        }
        list.sort(Map.Entry.comparingByKey());

        if(list.size() > 1) return list.get(1).getKey();
        else return list.get(0).getKey();
    }
}