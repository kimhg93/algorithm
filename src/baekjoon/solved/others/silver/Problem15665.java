package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem15665 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        Set<String> visit = new HashSet<>();
        st = new StringTokenizer(r.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        combi(arr, new int[m], visit,0);
        System.out.println(sb.toString().replaceAll("[\\[\\],]", ""));
    }

    static void combi(int[] arr, int[] re, Set<String> visit, int d){
        if(d == re.length){
            String str = Arrays.toString(re);
            int bf = visit.size();
            visit.add(str);
            if(bf < visit.size()) sb.append(str).append("\n");
            return;
        }

        for(int i=0; i<arr.length; i++){
            re[d] = arr[i];
            combi(arr, re, visit, d+1);

        }

    }
}


/*

N과 M (11)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	10245	7745	6272	76.283%
문제
N개의 자연수와 자연수 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.

N개의 자연수 중에서 M개를 고른 수열
같은 수를 여러 번 골라도 된다.
입력
첫째 줄에 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)

둘째 줄에 N개의 수가 주어진다. 입력으로 주어지는 수는 10,000보다 작거나 같은 자연수이다.

출력
한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.

수열은 사전 순으로 증가하는 순서로 출력해야 한다.

예제 입력 1
3 1
4 4 2
예제 출력 1
2
4
예제 입력 2
4 2
9 7 9 1
예제 출력 2
1 1
1 7
1 9
7 1
7 7
7 9
9 1
9 7
9 9
예제 입력 3
4 4
1 1 2 2
예제 출력 3
1 1 1 1 / 1 1 1 1
1 1 1 2 / 1 1 1 2
1 1 2 1 / 1 1 2 1
1 1 2 2 / 1 1 2 2
1 2 1 1 / 1 2 1 1
1 2 1 2 / 1 2 1 2
1 2 2 1 / 1 2 2 1
1 2 2 2 / 1 2 2 2
2 1 1 1 / 2 1 1 1
2 1 1 2 / 2 1 1 2
2 1 2 1 / 2 1 2 1
2 1 2 2 / 2 1 2 2
2 2 1 1 / 2 2 1 1
2 2 1 2 / 2 2 1 2
2 2 2 1 / 2 2 2 1
2 2 2 2 / 2 2 2 2

4ms

Process finished with exit code 0

 */
