package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2225 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] ar = new int[201][201];
        for(int i=0; i<ar.length; i++){
            ar[1][i] = i;
            ar[i][1] = 1;
            ar[i][2] = i+1;
        }
        for(int i=2; i<ar.length; i++){
            for(int j=3; j<ar.length; j++){
                ar[i][j] = (ar[i-1][j] + ar[i][j-1])%1000000000;
            }
        }
        System.out.println(ar[n][m]);
    }
}

/*
합분해
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	36385	16098	11811	42.730%
문제
0부터 N까지의 정수 K개를 더해서 그 합이 N이 되는 경우의 수를 구하는 프로그램을 작성하시오.

덧셈의 순서가 바뀐 경우는 다른 경우로 센다(1+2와 2+1은 서로 다른 경우). 또한 한 개의 수를 여러 번 쓸 수도 있다.

입력
첫째 줄에 두 정수 N(1 ≤ N ≤ 200), K(1 ≤ K ≤ 200)가 주어진다.

출력
첫째 줄에 답을 1,000,000,000으로 나눈 나머지를 출력한다.

예제 입력 1
20 2
예제 출력 1
21
예제 입력 2
6 4
예제 출력 2
84
 */
