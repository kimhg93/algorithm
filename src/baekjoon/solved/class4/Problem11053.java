package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11053 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] d = new int[n+1];
        st = new StringTokenizer(r.readLine());
        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        for(int i=1; i<arr.length; i++){
            int min = Integer.MIN_VALUE;
            int idx = 0;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    if(min < d[j]){
                        min = d[j];
                        idx = j;
                    }
                    if(min == max) break;
                }
            }
            d[i] = d[idx]+1;
            if(d[i] > max) max = d[i];
        }

        System.out.println(Arrays.stream(d).max().getAsInt());
    }
}
/*

가장 긴 증가하는 부분 수열
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	123893	48828	32170	37.381%
문제
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.

예제 입력 1
6
10 20 10 30 20 50
예제 출력 1
4

 */
