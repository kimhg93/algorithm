package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem15651 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = i+1;
        }
        combi(arr, new int[m], new boolean[n], 0);
        System.out.println(sb.toString().replaceAll("[\\[\\],]", ""));
    }

    static void combi(int[] arr, int[] re, boolean[] visit, int d){
        if(d == re.length){
            sb.append(Arrays.toString(re)).append("\n");
            return;
        }
        for(int i=0; i<arr.length; i++){
                re[d] = arr[i];
                visit[i] = true;
                combi(arr, re, visit,  d+1);
                visit[i] = false;
        }
    }
}


/*
N과 M (3)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	48413	32240	24415	66.865%
문제
자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

1부터 N까지 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
입력
첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)

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
1 1
1 2
1 3
1 4
2 1
2 2
2 3
2 4
3 1
3 2
3 3
3 4
4 1
4 2
4 3
4 4
예제 입력 3
3 3
예제 출력 3
1 1 1
1 1 2
1 1 3
1 2 1
1 2 2
1 2 3
1 3 1
1 3 2
1 3 3
2 1 1
2 1 2
2 1 3
2 2 1
2 2 2
2 2 3
2 3 1
2 3 2
2 3 3
3 1 1
3 1 2
3 1 3
3 2 1
3 2 2
3 2 3
3 3 1
3 3 2
3 3 3
출처
 */
