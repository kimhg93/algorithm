package baekjoon.step._10_done;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1018 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());

        char[][] arr = new char[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())];

        int min = 65;

        for(int i=0; i<arr.length; i++){
            String str = r.readLine();
            arr[i] = str.toCharArray();
        }

        for(int i=0; i<=arr[0].length-8; i++){
            for(int j=0; j<=arr.length-8; j++){
                char[][] nArr = new char[8][8];
                for(int k=0; k<8; k++){
                    nArr[k] = Arrays.copyOfRange(arr[j+k], i, i+8);
                }

                int cnt = 0;
                for(int z=0; z<2; z++){
                    if(z==0) cnt = count(nArr, true);
                    else cnt = count(nArr, false);
                    if(min >= cnt) min = cnt;
                }
            }
        }

        System.out.println(min);
    }

    public static int count(char[][] arr, boolean color){ // t white, f black
        int cnt = 0;
        String bf = "";
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(i==0 && j==0 && color) bf = "W";
                else if(i == 0 && j == 0) bf = "B";
                if(j > 0) bf = bf.equals("W") ? "B" : "W";
                if(arr[i][j] == bf.toCharArray()[0]) cnt++;
            }
        }
        return cnt;
    }
}