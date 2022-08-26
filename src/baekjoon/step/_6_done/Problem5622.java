package baekjoon.step._6_done;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5622 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = r.readLine();
        int re = 0;

        for(int i=0; i<a.length();i++) {
            String pool = a.substring(i, i+1);

            if(pool.equals("A")||pool.equals("B")||pool.equals("C"))  re+=3;
            else if(pool.equals("D")||pool.equals("E")||pool.equals("F")) re+=4;
            else if(pool.equals("G")||pool.equals("H")||pool.equals("I")) re+=5;
            else if(pool.equals("J")||pool.equals("K")||pool.equals("L")) re+=6;
            else if(pool.equals("M")||pool.equals("N")||pool.equals("O"))  re+=7;
            else if(pool.equals("P")||pool.equals("Q")||pool.equals("R")||pool.equals("S")) re+=8;
            else if(pool.equals("T")||pool.equals("U")||pool.equals("V")) re+=9;
            else if(pool.equals("W")||pool.equals("X")||pool.equals("Y")||pool.equals("Z")) re+=10;

        }
        System.out.println(re);
    }
}