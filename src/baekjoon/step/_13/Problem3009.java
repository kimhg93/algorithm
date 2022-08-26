package baekjoon.step._13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem3009 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        int[] arrX = new int[3];
        int[] arrY = new int[3];

        int reX = 0;
        int reY = 0;

        for(int i=0; i<3; i++){
            String str = r.readLine();
            StringTokenizer st = new StringTokenizer(str);
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<3; i++){
            int cntX = 0;
            int cntY = 0;
            for(int j=0; j<3; j++){
                if(arrX[i] == arrX[j]) cntX++;
                if(arrY[i] == arrY[j]) cntY++;
            }
            if(cntX == 1) reX = arrX[i] ;
            if(cntY == 1) reY = arrY[i] ;
        }
        System.out.println(reX +" "+  reY);
    }
}