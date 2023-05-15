package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem1735 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        StringTokenizer st = new StringTokenizer(r.readLine());
        int ac = Integer.parseInt(st.nextToken());
        int ap = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine());
        int bc = Integer.parseInt(st.nextToken());
        int bp = Integer.parseInt(st.nextToken());

        int rc = (ac*bp) + (bc*ap);
        int rp = ap*bp;

        int n = 2;
        while(true){
            if(n > 30000) break;
            if(rc%n == 0 && rp%n == 0){
                rc /= n;
                rp /= n;
                n = 2;
            } else n++;
        }

        System.out.println(rc + " " + rp);
    }
}
/*
23
46
*/

/*
분수 합

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	18977	8811	7472	48.244%
문제
분수 A/B는 분자가 A, 분모가 B인 분수를 의미한다. A와 B는 모두 자연수라고 하자.

두 분수의 합 또한 분수로 표현할 수 있다. 두 분수가 주어졌을 때, 그 합을 기약분수의 형태로 구하는 프로그램을 작성하시오.
기약분수란 더 이상 약분되지 않는 분수를 의미한다.

입력
첫째 줄과 둘째 줄에, 각 분수의 분자와 분모를 뜻하는 두 개의 자연수가 순서대로 주어진다. 입력되는 네 자연수는 모두 30,000 이하이다.

출력
첫째 줄에 구하고자 하는 기약분수의 분자와 분모를 뜻하는 두 개의 자연수를 빈 칸을 사이에 두고 순서대로 출력한다.

예제 입력 1
2 7
3 5
예제 출력 1
31 35
출처
문제를 만든 사람: author5
알고리즘 분류
수학
정수론
유클리드 호제법

 */