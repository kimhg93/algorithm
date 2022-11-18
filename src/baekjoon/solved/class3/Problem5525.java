package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem5525 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main (String[]args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());
        String str1 = r.readLine();

        sb.append("I").append("OI".repeat(n));
        String str = sb.toString();

        int cnt = 0;
        int[] arr = new int[str.length()];

        int idx = 0;

        for (int i = 1; i < str.length(); i++) {
            while (idx > 0 && str.charAt(i) != str.charAt(idx)) {
                idx = arr[idx - 1];
            }
            if (str.charAt(i) == str.charAt(idx)) {
                idx += 1;
                arr[i] = idx;
            }
        }

        int idx2 = 0;

        for (int i = 0; i < m; i++) {
            while (idx2 > 0 && str1.charAt(i) != str.charAt(idx2)) {
                idx2 = arr[idx2 - 1];
            }
            if (str1.charAt(i) == str.charAt(idx2)) {
                if (idx2 == str.length() - 1) {
                    idx2 = arr[idx2];
                    cnt++;
                } else idx2 += 1;
            }
        }
        System.out.println(cnt);
    }
}
/*
IOIOI 서브태스크다국어
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	21834	6504	5303	31.253%
문제
N+1개의 I와 N개의 O로 이루어져 있으면, I와 O이 교대로 나오는 문자열을 PN이라고 한다.

P1 IOI
P2 IOIOI
P3 IOIOIOI
PN IOIOI...OI (O가 N개)
I와 O로만 이루어진 문자열 S와 정수 N이 주어졌을 때, S안에 PN이 몇 군데 포함되어 있는지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다. 둘째 줄에는 S의 길이 M이 주어지며, 셋째 줄에 S가 주어진다.

출력
S에 PN이 몇 군데 포함되어 있는지 출력한다.

제한
1 ≤ N ≤ 1,000,000
2N+1 ≤ M ≤ 1,000,000
S는 I와 O로만 이루어져 있다.
서브태스크
번호	배점	제한
1	50
N ≤ 100, M ≤ 10 000.

2	50
추가적인 제약 조건이 없다.

예제 입력 1
1
13
OOIOIOIOIIOII
예제 출력 1
4
OOIOIOIOIIOII
OOIOIOIOIIOII
OOIOIOIOIIOII
OOIOIOIOIIOII
예제 입력 2
2
13
OOIOIOIOIIOII
예제 출력 2
2
OOIOIOIOIIOII
OOIOIOIOIIOII
 */