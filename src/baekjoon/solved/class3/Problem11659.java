package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11659 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine());
        int[] arr = new int[a];
        int idx = 0;
        while(st.hasMoreTokens()){
            if(idx > 0) arr[idx] = arr[idx-1];
            arr[idx] += Integer.parseInt(st.nextToken());
            idx++;
        }

        for(int i=0; i<b; i++){
            st = new StringTokenizer(r.readLine());
            int s = Integer.parseInt(st.nextToken())-2;
            int e = Integer.parseInt(st.nextToken())-1;
            if(s < 0) sb.append(arr[e]);
            else sb.append(arr[e]-arr[s]);
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}

/*

구간 합 구하기 4
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	51038	22100	17150	41.907%
문제
수 N개가 주어졌을 때, i번째 수부터 j번째 수까지 합을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

출력
총 M개의 줄에 입력으로 주어진 i번째 수부터 j번째 수까지 합을 출력한다.

제한
1 ≤ N ≤ 100,000
1 ≤ M ≤ 100,000
1 ≤ i ≤ j ≤ N
예제 입력 1
5 3
5 4 3 2 1
1 3
2 4
5 5
예제 출력 1
12
9
1
 */