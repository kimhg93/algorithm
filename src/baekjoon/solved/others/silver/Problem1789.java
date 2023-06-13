package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1789 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        long n = Long.parseLong(r.readLine());
        long sum = 0;
        long d = 1;

        while(true){
            if(sum+d > n) break;
            sum += d;
            d++;
        }

        System.out.println(d-1);
    }
}

/*

수들의 합

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	48194	19604	16661	41.819%
문제
서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?

입력
첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.

출력
첫째 줄에 자연수 N의 최댓값을 출력한다.

예제 입력 1
200
예제 출력 1
19
출처
문제를 만든 사람: author5
데이터를 추가한 사람: kangwh0617, newton08, upple1
알고리즘 분류
수학
그리디 알고리즘
메모

 */