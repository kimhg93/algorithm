package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14002 {
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

        int maxIdx = 0;
        int max = 0;

        for(int i=1; i<arr.length; i++){
            int currentCnt = Integer.MIN_VALUE;
            int idx = 0;
            for(int j=0; j<i; j++){
                if(arr[j] < arr[i]){
                    if(currentCnt < d[j]){
                        currentCnt = d[j];
                        idx = j;
                    }
                    if(currentCnt == max) break;
                }
            }

            d[i] = d[idx]+1;
            if(d[i] > max) {
                max = d[i];
                maxIdx = i;
            }
        }

        sb.append(arr[maxIdx]).append(" ");

        for(int j=maxIdx; j>=0; j--){
            if(arr[j] < arr[maxIdx] && d[j] == d[maxIdx]-1){
                maxIdx = j;
                if(d[j] == 0) break;
                sb.insert(0, " ").insert(0, arr[maxIdx]);
            }
        }

        System.out.println(max);
        System.out.println(sb);
    }

}
/*

가장 긴 증가하는 부분 수열 4 스페셜 저지

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	33288	13101	9920	39.219%
문제
수열 A가 주어졌을 때, 가장 긴 증가하는 부분 수열을 구하는 프로그램을 작성하시오.

예를 들어, 수열 A = {10, 20, 10, 30, 20, 50} 인 경우에 가장 긴 증가하는 부분 수열은 A = {10, 20, 10, 30, 20, 50} 이고, 길이는 4이다.

입력
첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.

둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)

출력
첫째 줄에 수열 A의 가장 긴 증가하는 부분 수열의 길이를 출력한다.

둘째 줄에는 가장 긴 증가하는 부분 수열을 출력한다. 그러한 수열이 여러가지인 경우 아무거나 출력한다.

예제 입력 1
6
10 20 10 30 20 50
예제 출력 1
4
10 20 30 50
출처
문제를 만든 사람: baekjoon
데이터를 추가한 사람: harinboy, kkw564
문제의 오타를 찾은 사람: jh05013
비슷한 문제
11053번. 가장 긴 증가하는 부분 수열
11054번. 가장 긴 바이토닉 부분 수열
11055번. 가장 큰 증가하는 부분 수열
11722번. 가장 긴 감소하는 부분 수열
12015번. 가장 긴 증가하는 부분 수열 2
12738번. 가장 긴 증가하는 부분 수열 3
14003번. 가장 긴 증가하는 부분 수열 5
알고리즘 분류
다이나믹 프로그래밍

 */
