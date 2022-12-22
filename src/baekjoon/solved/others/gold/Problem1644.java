package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1644 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());

        List<Integer> list = new ArrayList<>();
        int[] visit = new int[n+1];

        int target = n;
        int idx = 2;
        int d = idx;
        while(idx <= target){
            if(d <= n){
                if(d==idx && visit[d] != 1) list.add(d);
                else if(d!=idx) visit[d] = 1;
                d += idx;
            } else {
                idx++;
                d = idx;
            }
        }

        int cnt = 0;
        for(int i=0; i<list.size(); i++){
            int sum = 0;
            for(int j=i; j<list.size(); j++){
                sum += list.get(j);
                if(sum == n) {
                    cnt++;
                    break;
                } else if(sum > n) break;
            }
        }
        System.out.println(cnt);

    }

    public static boolean isPrime(long num){
        if(num < 2) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<=Math.sqrt(num)+1; i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }

}
/*

소수의 연속합 다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	30625	13098	9112	41.604%
문제
하나 이상의 연속된 소수의 합으로 나타낼 수 있는 자연수들이 있다. 몇 가지 자연수의 예를 들어 보면 다음과 같다.

3 : 3 (한 가지)
41 : 2+3+5+7+11+13 = 11+13+17 = 41 (세 가지)
53 : 5+7+11+13+17 = 53 (두 가지)
하지만 연속된 소수의 합으로 나타낼 수 없는 자연수들도 있는데, 20이 그 예이다. 7+13을 계산하면 20이 되기는 하나 7과 13이 연속이 아니기에 적합한 표현이 아니다.
또한 한 소수는 반드시 한 번만 덧셈에 사용될 수 있기 때문에, 3+5+5+7과 같은 표현도 적합하지 않다.

자연수가 주어졌을 때, 이 자연수를 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N이 주어진다. (1 ≤ N ≤ 4,000,000)

출력
첫째 줄에 자연수 N을 연속된 소수의 합으로 나타낼 수 있는 경우의 수를 출력한다.

예제 입력 1
20
예제 출력 1
0
예제 입력 2
3
예제 출력 2
1
예제 입력 3
41
예제 출력 3
3
예제 입력 4
53
예제 출력 4
2
출처

 */
