package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Problem10827 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        String s = st.nextToken();
        int m = Integer.parseInt(st.nextToken());

        BigDecimal num = new BigDecimal(s);
        BigDecimal re = new BigDecimal(1);
        for(int i=0; i<m; i++){
            re = num.multiply(re);
        }
        System.out.println(re.toPlainString());
    }
}

/*
a^b
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	4067	1170	993	37.038%
문제
실수 a와 정수 b가 주어졌을 때, a의 b제곱을 정확하게 계산하는 프로그램을 작성하시오.

입력
첫째 줄에 a와 b가 주어진다. (0 < a < 100, 1 ≤ b ≤ 100) a는 최대 소수점 9자리이며, 소수가 0으로 끝나는 경우는 없다. a는 항상 소수점이 포함되어 있다.

출력
첫째 줄에 a의 b제곱을 출력한다.

예제 입력 1
3.141592 3
예제 출력 1
31.006257328285746688
예제 입력 2
0.1 10
예제 출력 2
0.0000000001
예제 입력 3
1.01 5
예제 출력 3
1.0510100501
 */
