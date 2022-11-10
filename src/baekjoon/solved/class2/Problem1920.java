package baekjoon.solved.class2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Problem1920 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        int n = Integer.parseInt(r.readLine());
        StringTokenizer st1 = new StringTokenizer(r.readLine());
        int m = Integer.parseInt(r.readLine());
        StringTokenizer st2 = new StringTokenizer(r.readLine());

        Set<Integer> set = new HashSet();
        for(int i=0; i<n; i++){
            set.add(Integer.parseInt(st1.nextToken()));
        }
        for(int i=0; i<m; i++){
            if(set.contains(Integer.parseInt(st2.nextToken()))) sb.append("1").append("\n");
            else sb.append("0").append("\n");
        }

        System.out.println(sb.toString());
    }
}

/*

수 찾기
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	168586	50263	33379	29.785%
문제
N개의 정수 A[1], A[2], …, A[N]이 주어져 있을 때, 이 안에 X라는 정수가 존재하는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 N개의 정수 A[1], A[2], …, A[N]이 주어진다.
다음 줄에는 M(1 ≤ M ≤ 100,000)이 주어진다. 다음 줄에는 M개의 수들이 주어지는데, 이 수들이 A안에 존재하는지 알아내면 된다.
모든 정수의 범위는 -231 보다 크거나 같고 231보다 작다.

출력
M개의 줄에 답을 출력한다. 존재하면 1을, 존재하지 않으면 0을 출력한다.

예제 입력 1
5
4 1 5 2 3
5
1 3 7 9 5
예제 출력 1
1
1
0
0
1

 */