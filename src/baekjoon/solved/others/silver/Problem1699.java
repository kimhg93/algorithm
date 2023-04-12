package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem1699 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        int s = (int) Math.sqrt(n)+1;

        int[] d = new int[n+1];
        int[] pow = new int[n+1];

        for(int i=1; i<=s; i++){
            pow[i] = (int) Math.pow(i, 2);
        }

        for(int i=1; i<=n; i++){
            int idx = 0;

            while(i >= pow[idx]) idx++;
            idx -= 1;

            int min = Integer.MAX_VALUE;
            while(idx > 0){
                if(pow[idx] == i) min = 1;
                else min = Math.min(1+d[i-pow[idx]], min);
                idx--;
            }
            d[i] = min;
        }

        System.out.println(d[n]);
    }

}
/*
제곱수의 합
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	48482	19458	14139	39.251%
문제
어떤 자연수 N은 그보다 작거나 같은 제곱수들의 합으로 나타낼 수 있다. 예를 들어 11=32+12+12(3개 항)이다. 이런 표현방법은 여러 가지가 될 수 있는데,
11의 경우 11=22+22+12+12+12(5개 항)도 가능하다. 이 경우, 수학자 숌크라테스는 “11은 3개 항의 제곱수 합으로 표현할 수 있다.”라고 말한다.
또한 11은 그보다 적은 항의 제곱수 합으로 표현할 수 없으므로, 11을 그 합으로써 표현할 수 있는 제곱수 항의 최소 개수는 3이다.

주어진 자연수 N을 이렇게 제곱수들의 합으로 표현할 때에 그 항의 최소개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 100,000)

출력
주어진 자연수를 제곱수의 합으로 나타낼 때에 그 제곱수 항의 최소 개수를 출력한다.

예제 입력 1
7
예제 출력 1
4
예제 입력 2
1
예제 출력 2
1
예제 입력 3
4
예제 출력 3
1
예제 입력 4
11
예제 출력 4
3
예제 입력 5
13
예제 출력 5
2
 */
