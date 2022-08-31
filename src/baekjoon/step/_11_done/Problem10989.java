package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 카운팅정렬
public class Problem10989 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int cnt = Integer.parseInt(r.readLine());
        int[] arr = new int[cnt];
        int[] re = new int[cnt];

        int max = -1;

        for(int i=0; i<cnt; i++){
            int n = Integer.parseInt(r.readLine());
            arr[i] = n;
            if(n > max) max = n;
        }

        int[] counting = new int[max+1];

        for(int i=0; i<cnt; i++){
            counting[arr[i]]++;
        }

        for(int i=1; i<counting.length; i++){
            counting[i] += counting[i-1];
        }

        for(int i = arr.length - 1; i >= 0; i--) {
            int n = arr[i];
            counting[n]--;
            re[counting[n]] = n;
        }

        for(int i=0; i<re.length; i++){
            sb.append(re[i]).append("\n");
        }
        System.out.println(sb);
    }

}