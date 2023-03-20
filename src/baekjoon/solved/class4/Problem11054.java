package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem11054 {
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
            int min = Integer.MIN_VALUE;
            int idx = 0;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    if(min < d[j]){
                        min = d[j];
                        idx = j;
                    }
                }
            }
            d[i] = d[idx]+1;
        }

        for(int i=1; i<=n; i++){
            int[] d2 = new int[n+1];
            d2[i] = 1;
            int mv = 0;

            for(int j=i+1; j<=n; j++){
                int max2 = Integer.MIN_VALUE;
                int idx = 0;
                for(int k=i; k<=j; k++){
                    if(arr[j] < arr[k] && arr[j] < arr[i]){
                        if(max2 < d2[k]){
                            max2 = d2[k];
                            idx = k;
                        }
                    }
                }
                d2[j] = d2[idx]+1;
                if(mv < d2[j]) mv = d2[j];
            }
            if(mv > 0) d[i] += (mv-1);
            else d[i] += mv;
        }

        System.out.println(Arrays.stream(d).max().getAsInt());
    }
}
/*

가장 긴 바이토닉 부분 수열
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	41083	20959	16398	50.713%
문제
수열 S가 어떤 수 Sk를 기준으로 S1 < S2 < ... Sk-1 < Sk > Sk+1 > ... SN-1 > SN을 만족한다면, 그 수열을 바이토닉 수열이라고 한다.

예를 들어, {10, 20, 30, 25, 20}과 {10, 20, 30, 40}, {50, 40, 25, 10} 은 바이토닉 수열이지만,  {1, 2, 3, 2, 1, 2, 3, 2, 1}과 {10, 20, 30, 40, 20, 30} 은 바이토닉 수열이 아니다.

수열 A가 주어졌을 때, 그 수열의 부분 수열 중 바이토닉 수열이면서 가장 긴 수열의 길이를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 수열 A의 크기 N이 주어지고, 둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ N ≤ 1,000, 1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 부분 수열 중에서 가장 긴 바이토닉 수열의 길이를 출력한다.

예제 입력 1
10
1 5 2 1 4 3 4 5 2 1
예제 출력 1
7
힌트
예제의 경우 {1 2 3 4 5 2 1}이 가장 긴 바이토닉 부분 수열이다.

 */
