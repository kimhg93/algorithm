package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem15655 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        st = new StringTokenizer(r.readLine());
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        combi(arr, new int[m], new boolean[n], 0);
        System.out.println(sb.toString().replaceAll("[\\[\\],]", ""));
    }

    static void combi(int[] arr, int[] re, boolean[] visit,  int d){
        if(d == re.length){
            sb.append(Arrays.toString(re)).append("\n");
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!visit[i]){
                if(d == 0 || re[d-1] < arr[i]){
                    re[d] = arr[i];
                    visit[i] = true;
                    combi(arr, re, visit,d+1);
                    visit[i] = false;
                }
            }
        }
    }
}


/*
N과 M (6)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	14761	12427	10085	84.976%
문제
N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오. N개의 자연수는 모두 다른 수이다.

N개의 자연수 중에서 M개를 고른 수열
고른 수열은 오름차순이어야 한다.
입력
첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)

둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1
3 1
4 5 2
예제 출력 1
2
4
5
예제 입력 2
4 2
9 8 7 1
예제 출력 2
1 7
1 8
1 9
7 8
7 9
8 9
예제 입력 3
4 4
1231 1232 1233 1234
예제 출력 3
1231 1232 1233 1234
 */
