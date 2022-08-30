package baekjoon.step._11;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1181 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++){
            arr[i] = r.readLine();
        }

        sort(arr, 0, n-1);

        int start = 0;
        int cnt = 0;
        boolean flag = false;

        for(int i=0; i<n; i++){
            if(i+1 < n && arr[i].length() == arr[i+1].length()){
                if(!flag) {
                    start = i;
                    flag = true;
                }
                cnt++;
            } else flag = false;

            if(cnt > 0 && !flag) {
                Arrays.sort(arr, start, i+1);
                start = 0;
                cnt = 0;
                flag = false;
            }
        }

        for(int i=0; i<n; i++){
            if(! (i+1<n && arr[i].equals(arr[i+1]))) sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);

    }

    private static void sort(String[] arr, int l, int h) {
        if (l >= h) return;
        int p = partition(arr, l, h);
        sort(arr, l, p - 1);
        sort(arr, p, h);
    }

    private static int partition(String[] arr, int l, int h) {
        int p = arr[(l+h) / 2].length();
        while (l<=h) {
            while (arr[l].length() < p) l++;
            while (arr[h].length() > p) h--;
            if (l <= h) {
                String tmp = arr[l];
                arr[l] = arr[h];
                arr[h] = tmp;
                l++;
                h--;
            }
        }
        return l;
    }
}