package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem2407 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(binom(n, m));
    }

    public static BigInteger binom(int n, int r){
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        BigInteger result = new BigInteger("1");

        for(int i=2; i<=n; i++){
            listA.add(i);
            if(i <= r) listB.add(i);
            if(i <= n-r) listB.add(i);
        }

        for(int i=0; i<listB.size(); i++){
            int n1 = listB.get(i);
            for(int j=0; j<listA.size(); j++){
                int n2 = listA.get(j);

                if(n2%n1 == 0 && n2/n1 > 1) listA.add(n2/n1);
                else if(n1%n2 == 0 && n1/n2 > 1) listB.add(n1/n2);

                if(n2%n1 == 0 || n1%n2 == 0){
                    listA.remove(j);
                    listB.remove(i);
                    i--;
                    break;
                }
            }
        }

        for(int i=0; i<listA.size(); i++){
            result = result.multiply(BigInteger.valueOf(listA.get(i)));
        }
        for(int i=0; i<listB.size(); i++){
            result = result.divide(BigInteger.valueOf(listB.get(i)));
        }

        return result;
    }
}


/*

조합
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	27106	9901	8614	41.271%
문제
nCm을 출력한다.

입력
n과 m이 주어진다. (5 ≤ n ≤ 100, 5 ≤ m ≤ 100, m ≤ n)

출력
nCm을 출력한다.

예제 입력 1
100 6
예제 출력 1
1192052400

 */
