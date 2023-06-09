package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem17298 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        StringTokenizer st = new StringTokenizer(r.readLine());

        int[] arr = new int[n];
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while(!stack.isEmpty()) {
            result[stack.pop()] = -1;
        }

        for(int i=0; i<n; i++) {
            sb.append(result[i]).append(" ");
        }

        System.out.println(sb.toString());
    }

}

/*
오큰수

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	62287	21157	15141	32.805%
문제
크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다.
Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.

예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다.
A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.

출력
총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.

예제 입력 1
4
3 5 2 7
예제 출력 1
5 7 7 -1
예제 입력 2
4
9 5 4 8
예제 출력 2
-1 8 8 -1
출처
문제를 만든 사람: baekjoon
데이터를 추가한 사람: rhdqor213
알고리즘 분류
자료 구조
스택
 */
