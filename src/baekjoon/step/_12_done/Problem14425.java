package baekjoon.step._12_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14425 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int cnt = 0;
        String[] arr = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = r.readLine();
        }

        for(int i=0; i<M; i++){
            String s = r.readLine();
            for(int j=0; j<N; j++){
                if(arr[j].equals(s)){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}