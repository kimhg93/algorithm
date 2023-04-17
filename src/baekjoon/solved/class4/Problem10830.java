package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem10830 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        long[][] arr = new long[n][n];

        for(int i=0; i<n; i++){
            st = new StringTokenizer(r.readLine());
            for(int j=0; j<n; j++){
                long num = Long.parseLong(st.nextToken());
                arr[i][j] = num%1000;
            }
        }

        long p = 100000000000L;

        while(true){
            if(b/p == 0) p/=10;
            else break;
        }

        if(p > 1000000) p = 1000000;

        if(b < 10000){
            long[][] result = mul(arr, arr, n, b);

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }

        } else {

            long[][] ten = mul(arr, arr, n, p);
            long[][] pow = mul(ten, ten, n, b/p);
            long[][] remain = mul(arr, arr, n, b%p);

            long[][] result = new long[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    long num = 0;
                    for(int k=0; k<n; k++){
                        num += (remain[i][k] * pow[k][j]);
                    }
                    result[i][j] = num % 1000;
                }
            }

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static long[][] mul(long[][] arr, long[][] arr2, int n, long b){
        long[][] result = arr2;

        for(int l=1; l<b; l++){
            long[][] temp = new long[n][n];
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    long num = 0;
                    for(int k=0; k<n; k++){
                        num += (arr[i][k] * result[k][j]);
                    }
                    temp[i][j] = num % 1000;
                }
            }
            result = temp;
        }
        return result;
    }
}
/*

행렬 제곱

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	29014	10268	8128	34.189%
문제
크기가 N*N인 행렬 A가 주어진다. 이때, A의 B제곱을 구하는 프로그램을 작성하시오. 수가 매우 커질 수 있으니, A^B의 각 원소를 1,000으로 나눈 나머지를 출력한다.

입력
첫째 줄에 행렬의 크기 N과 B가 주어진다. (2 ≤ N ≤  5, 1 ≤ B ≤ 100,000,000,000)

둘째 줄부터 N개의 줄에 행렬의 각 원소가 주어진다. 행렬의 각 원소는 1,000보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄부터 N개의 줄에 걸쳐 행렬 A를 B제곱한 결과를 출력한다.

예제 입력 1
2 5
1 2
3 4
예제 출력 1
69 558
337 406
예제 입력 2
3 3
1 2 3
4 5 6
7 8 9
예제 출력 2
468 576 684
62 305 548
656 34 412
예제 입력 3
5 10
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
1 0 0 0 1
예제 출력 3
512 0 0 0 512
512 0 0 0 512
512 0 0 0 512
512 0 0 0 512
512 0 0 0 512

 */
