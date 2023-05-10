package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem6588 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {

        boolean[] arr = new boolean[1000001];
        arr[0] = arr[1] = true;

        for(int i=2; i<=1000000; i++){
            for(int j=i; j<=1000000; j+=i){
                if(!arr[j] && i!=j) arr[j] = true;
            }
        }

        while(true){
            int n = Integer.parseInt(r.readLine());
            if(n == 0) break;

            boolean flag = false;

            for(int i=n; i>=0; i--){
                if(!arr[i] && !arr[(n-i)]){
                    sb.append(n).append(" = ")
                            .append(n-i).append(" + ")
                            .append(i).append("\n");
                    flag = true;
                    break;
                }
            }
            if(!flag) sb.append("Goldbach's conjecture is wrong.");
        }

        System.out.println(sb);
    }
}

/*

골드바흐의 추측 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.5 초	256 MB	71071	13116	8928	23.065%
문제
1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.

4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.

이 추측은 아직도 해결되지 않은 문제이다.

백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.

입력

입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.

각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)

입력의 마지막 줄에는 0이 하나 주어진다.

출력
각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다. 숫자와 연산자는 공백 하나로 구분되어져 있다.
만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다. 또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.

예제 입력 1
8
20
42
0
예제 출력 1
8 = 3 + 5
20 = 3 + 17
42 = 5 + 37
출처
Contest > University of Ulm Local Contest > University of Ulm Local Contest 1998 G번

빠진 조건을 찾은 사람: Acka
문제의 오타를 찾은 사람: anjupiter
문제를 번역한 사람: baekjoon
데이터를 추가한 사람: djm03178, jjongs
알고리즘 분류
수학
정수론
소수 판정
에라토스테네스의 체

 */