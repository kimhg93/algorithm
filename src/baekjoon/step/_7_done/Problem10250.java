package baekjoon.step._7_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10250 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int cnt = Integer.parseInt(r.readLine());
        String[] arr = new String[cnt];

        for(int i=0; i<cnt; i++){
            String str = r.readLine();
            StringTokenizer st = new StringTokenizer(str);

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int reH = N%H*100;
            int reW = (int) Math.ceil(N/H)+1;
            if(N%H == 0) {
                reH = H*100;
                reW--;
            }
            arr[i] = Integer.toString(reH+reW);
        }
        for(String str : arr){
            System.out.println(str);
        }
    }
}