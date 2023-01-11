package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem16953 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int cnt = 1;
        while(true){
            if(m%10 == 1) m /= 10;
            else if(m%10%2 == 0) m /= 2;
            else break;
            cnt++;
            if(m <= n) break;
        }

        if(n == m) System.out.println(cnt);
        else System.out.println(-1);
    }
}


/*

A → B
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	29083	12141	9751	40.297%
문제
정수 A를 B로 바꾸려고 한다. 가능한 연산은 다음과 같은 두 가지이다.

2를 곱한다.
1을 수의 가장 오른쪽에 추가한다.
A를 B로 바꾸는데 필요한 연산의 최솟값을 구해보자.

입력
첫째 줄에 A, B (1 ≤ A < B ≤ 10^9)가 주어진다.

출력
A를 B로 바꾸는데 필요한 연산의 최솟값에 1을 더한 값을 출력한다. 만들 수 없는 경우에는 -1을 출력한다.

예제 입력 1
2 162
예제 출력 1
5
2 → 4 → 8 → 81 → 162

예제 입력 2
4 42
예제 출력 2
-1
예제 입력 3
100 40021
예제 출력 3
5
100 → 200 → 2001 → 4002 → 40021

 */
