package baekjoon.solved.others;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2960 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        List<Integer> list = new ArrayList<>();

        int idx = 2;
        int d = idx;
        while(idx <= n){
            if(d <= n){
                if(d==idx && arr[d] != 1) list.add(d);
                else if(d!=idx && arr[d] != 1) arr[d] = 1;
                d += idx;
            } else {
                idx++;
                d = idx;
            }
        }
        System.err.println(list.toString());
    }
}

/*

에라토스테네스의 체 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	21506	11698	9877	55.173%
문제
에라토스테네스의 체는 N보다 작거나 같은 모든 소수를 찾는 유명한 알고리즘이다.

이 알고리즘은 다음과 같다.

2부터 N까지 모든 정수를 적는다.
아직 지우지 않은 수 중 가장 작은 수를 찾는다. 이것을 P라고 하고, 이 수는 소수이다.
P를 지우고, 아직 지우지 않은 P의 배수를 크기 순서대로 지운다.
아직 모든 수를 지우지 않았다면, 다시 2번 단계로 간다.
N, K가 주어졌을 때, K번째 지우는 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ K < N, max(1, K) < N ≤ 1000)

출력
첫째 줄에 K번째 지워진 수를 출력한다.

예제 입력 1
7 3
예제 출력 1
6
예제 입력 2
15 12
예제 출력 2
7
예제 입력 3
10 7
예제 출력 3
9

 */