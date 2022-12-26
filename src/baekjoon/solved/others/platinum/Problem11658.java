package baekjoon.solved.others.platinum;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem11658 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(r.readLine());
            for(int j=1; j<=n; j++){
                arr[i][j] = arr[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(r.readLine());
            int w = Integer.parseInt(st.nextToken());
            if(w == 0){
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int num = Integer.parseInt(st.nextToken());
                arr[x] = add(arr[x], y, num);
            } else {
                int x1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());
                int sum = 0;
                for(int j=x1; j<=y1; j++){
                    sum += arr[j][y2] - arr[j][x2-1];
                }
                sb.append(sum).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static int[] add(int[] arr, int y, int n){
        int m = n - (arr[y]-arr[y-1]);
        for(int i=y; i<arr.length; i++){
            arr[i] += m;
        }
        return arr;
    }
}
/*
구간 합 구하기 3
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	5374	1883	1221	35.046%
문제
N×N개의 수가 N×N 크기의 표에 채워져 있다. 그런데 중간에 수의 변경이 빈번히 일어나고 그 중간에 어떤 부분의 합을 구하려 한다. 표의 i행 j열은 (i, j)로 나타낸다.

예를 들어, N = 4이고, 표가 아래와 같이 채워져 있는 경우를 살펴보자.

1	2	3	4
2	3	4	5
3	4	5	6
4	5	6	7
여기서 (2, 2)부터 (3, 4)까지 합을 구하면 3+4+5+4+5+6 = 27이 된다. (2, 3)을 7로 바꾸고 (2, 2)부터 (3, 4)까지 합을 구하면 3+7+5+4+5+6=30 이 된다.

표에 채워져 있는 수와 변경하는 연산과 합을 구하는 연산이 주어졌을 때, 이를 처리하는 프로그램을 작성하시오.

입력
첫째 줄에 표의 크기 N과 수행해야 하는 연산의 수 M이 주어진다. (1 ≤ N ≤ 1024, 1 ≤ M ≤ 100,000) 둘째 줄부터 N개의 줄에는 표에 채워져있는 수가 1행부터 차례대로 주어진다.
다음 M개의 줄에는 네 개의 정수 w, x, y, c 또는 다섯 개의 정수 w, x1, y1, x2, y2 가 주어진다. w = 0인 경우는 (x, y)를 c로 바꾸는 연산이고,
w = 1인 경우는 (x1, y1)부터 (x2, y2)의 합을 구해 출력하는 연산이다. (1 ≤ c ≤ 1,000) 표에 채워져 있는 수는 1,000보다 작거나 같은 자연수이다.

출력
w = 1인 입력마다 구한 합을 순서대로 한 줄에 하나씩 출력한다.

예제 입력 1
4 5
1 2 3 4
2 3 4 5
3 4 5 6
4 5 6 7
1 2 2 3 4
0 2 3 7
1 2 2 3 4
0 3 4 5
1 3 4 3 4
예제 출력 1
27
30
5
 */
