package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem10844 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());

        long[][] arr = new long[n+1][10];

        for(int i=1; i<=n; i++){
            for(int j=0; j<10; j++){
                if(i==1 && j>0) {
                    arr[i][j] = 1;
                    continue;
                }
                if(j == 0) arr[i][j] = arr[i-1][j+1] % 1000000000;
                else if(j == 9) arr[i][j] = arr[i-1][j-1] % 1000000000;
                else arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000 ;
            }
        }

        long sum = 0;
        for(int i=0; i<10; i++){
            sum += arr[n][i];
            sum %= 1000000000;
        }

        System.out.println(sum);

    }
}

/*
쉬운 계단 수

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	125589	39947	28899	30.076%
문제
45656이란 수를 보자.

이 수는 인접한 모든 자리의 차이가 1이다. 이런 수를 계단 수라고 한다.

N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구해보자. 0으로 시작하는 수는 계단수가 아니다.

입력
첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.

출력
첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.

예제 입력 1
1
예제 출력 1
9
예제 입력 2
2
예제 출력 2
17
출처
문제를 만든 사람: baekjoon
알고리즘 분류
다이나믹 프로그래밍


*/