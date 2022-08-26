package baekjoon.step._10_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem7568 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        int[][] arr = new int[3][cnt];

        for(int i=0; i<cnt; i++){
            String str = r.readLine();
            StringTokenizer st = new StringTokenizer(str);
            arr[0][i] = Integer.parseInt(st.nextToken());
            arr[1][i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<cnt; i++){
            int rank = 1;
            for(int j=0; j<cnt; j++){
                if(i!=j){
                    if(arr[0][i] < arr[0][j] && arr[1][i] < arr[1][j]){
                        rank++;
                    }
                }
            }
            System.out.print(rank + " ");
        }
    }
}