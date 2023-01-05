package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1463 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {
        int n = Integer.parseInt(r.readLine());
        int[] d = new int[n+1];
        for(int i=2; i<=n; i++){
            if(i%6==0) d[i] = Math.min(Math.min(d[i-1],d[i/2]), d[i/3]);
            else if(i%3==0) d[i] = Math.min(d[i-1], d[i/3]);
            else if(i%2==0) d[i] = Math.min(d[i-1], d[i/2]);
            else d[i] = d[i-1];
        }
        System.err.println(d[n]);
    }
}

/*

1로 만들기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.15 초 (하단 참고)	128 MB	224993	73992	47304	32.248%
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

예제 입력 1
2
예제 출력 1
1
예제 입력 2
10
예제 출력 2
3
힌트
10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.

 */