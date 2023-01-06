package baekjoon.step._17;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1932 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        int[][] d = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            for(int j=1; j<=i; j++){
                d[i][j] = Integer.parseInt(st.nextToken());

                if(j==1) d[i][j] += d[i-1][j];
                else if(j==i)  d[i][j] += d[i-1][j-1];
                else d[i][j] += Math.max(d[i-1][j-1], d[i-1][j]);
            }
        }
        System.out.println(Arrays.stream(d[n]).max().getAsInt());
    }
}

/*

정수 삼각형 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	72100	41036	30891	58.997%
문제
        7               7
      3   8              10 15
    8   1   0               18 16 15
  2   7   4   4             20 25 20 19
4   5   2   6   5          24 30 27 26 25
위 그림은 크기가 5인 정수 삼각형의 한 모습이다.

맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 최대가 되는 경로를 구하는 프로그램을 작성하라.
아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.

삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

입력
첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

출력
첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다.

예제 입력 1
5
7
3 8
8 1 0
2 7 4 4
4 5 2 6 5
예제 출력 1
30

 */