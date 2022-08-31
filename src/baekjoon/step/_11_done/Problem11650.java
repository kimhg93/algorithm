package baekjoon.step._11_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11650 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        int[][] arr = new int[2][n];

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
        }
        sort(arr[0],arr[1], 0, arr[0].length-1 );

        int start = 0;
        boolean flag = false;
        int cnt = 0;

        for(int i=0; i<arr[0].length; i++){

            if(i+1 < arr[0].length && arr[0][i] == arr[0][i+1] ){
                if(!flag) {
                    start = i;
                    flag = true;
                }
                cnt++;
            } else flag = false;

            if(cnt > 0 && !flag) {
                sort(arr[1], arr[0], start, i);
                start = 0;
                cnt = 0;
                flag = false;
            }
        }

        for(int i=0; i<arr[0].length; i++){
            sb.append(arr[0][i]+" "+arr[1][i]).append("\n");
        }

        System.out.println(sb);
    }

    private static void sort(int[] arr, int[] arr2, int l, int h) { // 재귀 호출로 파티션을 무한 반목
        if (l >= h) return;

        int p = partition(arr, arr2, l, h);
        sort(arr, arr2, l, p - 1);
        sort(arr, arr2, p, h);
    }


    private static int partition(int[] arr, int[] arr2, int l, int h) {
        int p = arr[(l+h) / 2];

        while (l<=h) {
            while (arr[l] < p) l++;
            while (arr[h] > p) h--;
            if (l <= h) {
                int tmp = arr[l];
                arr[l] = arr[h];
                arr[h] = tmp;

                int tmp2 = arr2[l];
                arr2[l] = arr2[h];
                arr2[h] = tmp2;

                l++;
                h--;
            }
        }
        return l;
    }
}