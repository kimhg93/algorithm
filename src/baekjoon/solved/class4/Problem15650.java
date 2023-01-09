package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Problem15650 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        combi(Integer.parseInt(st.nextToken()), new Stack<>(), Integer.parseInt(st.nextToken()));
    }

    static void combi(int n, Stack<Integer> st, int m){
        if(st.size() == m){
            System.out.println(st.toString().replaceAll("[\\[\\],]", ""));
        }

        int s = st.isEmpty() ? 1 : st.peek()+1;

        for(int i=s; i<=n; i++){
            st.push(i);
            combi(n, st, m);
            st.pop();
        }
    }
}


/*
N과 M (2)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	51663	38587	27983	74.214%
문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1
3 1
예제 출력 1
1
2
3
예제 입력 2
4 2
예제 출력 2
1 2
1 3
1 4
2 3
2 4
3 4
예제 입력 3
4 4
예제 출력 3
1 2 3 4
 */
