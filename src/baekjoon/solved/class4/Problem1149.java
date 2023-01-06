package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem1149 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        int[][] d = new int[n+1][3];

        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            for(int j=0; j<3; j++){
                int[] bf = d[i-1];
                d[i][j] = Integer.parseInt(st.nextToken());

                if(j==0) d[i][j] += Math.min(bf[1], bf[2]);
                else if(j==1) d[i][j] += Math.min(bf[0], bf[2]);
                else if(j==2) d[i][j] += Math.min(bf[0], bf[1]);
            }
        }
        System.out.println(Arrays.stream(d[n]).min().getAsInt());
    }
}

/*
10
711 572 325
209 187 673
512 930 898
759 85 260
136 226 532
201 3 959
132 607 359
601 775 848
462 776 920
74 807 671

711 572 325 ///
209 187 673 /// 534 512 1245
512 930 898 /// 1024 1464 1410
759 85 260 /// 2169 1109 1284
136 226 532 /// 1245 1510 1641
201 3 959 /// 1711 1248 2204
132 607 359 /// 1380 2318 1607
601 775 848 /// 2208 2155 2228
462 776 920 /// 2617 2984 3075
74 807 671 /// 3058 3424 3288
         */
// 1499
/*
RGB거리
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.5 초 (추가 시간 없음)	128 MB	88412	46869	34983	52.386%
문제
RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.

집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때,
아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.

1번 집의 색은 2번 집의 색과 같지 않아야 한다.
N번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
입력
첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다.
 집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.

예제 입력 1
3
26 40 83
49 60 57
13 89 99
예제 출력 1
96
예제 입력 2
3
1 100 100
100 1 100
100 100 1
예제 출력 2
3
예제 입력 3
3
1 100 100
100 100 100
1 100 100
예제 출력 3
102
예제 입력 4
6
30 19 5
64 77 64
15 19 97
4 71 57
90 86 84
93 32 91
예제 출력 4
208
예제 입력 5
8
71 39 44
32 83 55
51 37 63
89 29 100
83 58 11
65 13 15
47 25 29
60 66 19
예제 출력 5
253
 */
