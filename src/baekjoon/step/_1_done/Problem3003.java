package baekjoon.step._1_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3003 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int[] arr = {1,1,2,2,2,8};
        String result = "";

        int i = 0;
        while(st.hasMoreTokens()){
            int in = Integer.parseInt(st.nextToken());
            result += (arr[i] - in + " ");
            i++;
        }
        System.out.println(result.substring(0, result.length()-1));
    }
}