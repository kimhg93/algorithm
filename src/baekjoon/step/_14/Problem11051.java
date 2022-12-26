package baekjoon.step._14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 // binom(n, r) = n! / r!(n-r)!
/*
binom(n,r) = binom(n-1, r-1) + binom(n-1, r)

 */
public class Problem11051 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];

        for(int i=1; i<arr.length; i++){
            arr[i][0] = 1;
            arr[i][1] = i;
            arr[i][i] = 1;
            arr[0][i] = 1;
        }

        for(int i=1; i<arr.length; i++){
            for(int j=1; j<i; j++){
                if(arr[i][j] == 0){
                    int num = arr[i-1][j-1] + arr[i-1][j];
                    arr[i][j] = num%10007;
                }
            }
        }

        System.out.println(arr[n][r]);
    }
}

/*
이항 계수 2

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	49122	18231	14335	37.638%
문제
자연수 N 과 정수 K가 주어졌을 때 이항 계수
binom{N}{K}를 10,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ K ≤ N)

출력

binom{N}{K}를 10,007로 나눈 나머지를 출력한다.

예제 입력 1
5 2
예제 출력 1
10
 */