package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11441 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(r.readLine());
        for(int i=1; i<=m; i++){
            st = new StringTokenizer(r.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            sb.append(arr[e] - arr[s-1]).append("\n");
        }

        System.out.println(sb);

    }
}


/*

합 구하기 성공

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	8318	4186	3543	51.708%
문제
N개의 수 A1, A2, ..., AN이 입력으로 주어진다. 총 M개의 구간 i, j가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N이 주어진다. (1 ≤ N ≤ 100,000) 둘째 줄에는 A1, A2, ..., AN이 주어진다. (-1,000 ≤ Ai ≤ 1,000) 셋째 줄에는 구간의 개수 M이 주어진다. (1 ≤ M ≤ 100,000) 넷째 줄부터 M개의 줄에는 각 구간을 나타내는 i와 j가 주어진다. (1 ≤ i ≤ j ≤ N)

출력
총 M개의 줄에 걸쳐 입력으로 주어진 구간의 합을 출력한다.

예제 입력 1
5
10 20 30 40 50
5
1 3
2 4
3 5
1 5
4 4
예제 출력 1
60
90
120
150
40
예제 입력 2
3
1 0 -1
6
1 1
2 2
3 3
1 2
2 3
1 3
예제 출력 2
1
0
-1
1
-1
0
출처
문제를 만든 사람: baekjoon
알고리즘 분류
누적 합

 */
