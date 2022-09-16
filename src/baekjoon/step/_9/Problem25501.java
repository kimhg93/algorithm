package baekjoon.step._9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem25501 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        for(int i=0; i<n; i++){
            String s = r.readLine();
            int[] arr = isPalindrome(s);
            sb.append(arr[0])
                    .append(" ")
                    .append(arr[1])
                    .append("\n");
        }
        System.out.print(sb);
    }

    public static int[] recursion(String s, int l, int r, int cnt){
        int[] arr = new int[2];
        if(l >= r) arr[0] = 1;
        else if(s.charAt(l) != s.charAt(r)) arr[0] = 0;
        else return recursion(s, l+1, r-1, ++cnt);
        arr[1] = cnt;
        return arr;
    }

    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 1);
    }
}