package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem2606 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());

        int cnt = 0;

        List<List<Integer>> adj = new ArrayList<>();
        for (int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<m; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            int pc1 = Integer.parseInt(st.nextToken());
            int pc2 = Integer.parseInt(st.nextToken());
            adj.get(pc1).add(pc2);
            adj.get(pc2).add(pc1);
        }

        boolean[] visit = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        int start = 1; // 시작 노드
        visit[start] = true;
        q.offer(start);

        while (!q.isEmpty()) {
            int curr = q.poll();

            for(int j=0; j <adj.get(curr).size(); j++) {
                int nbr = adj.get(curr).get(j);
                if (!visit[nbr]) {
                    visit[nbr] = true;
                    q.offer(nbr);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }
}

/*
 1 - 2 - 3      7
 |   |          |
   5  -  6      4
바이러스

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	138853	67176	44917	46.286%
문제
신종 바이러스인 웜 바이러스는 네트워크를 통해 전파된다.
한 컴퓨터가 웜 바이러스에 걸리면 그 컴퓨터와 네트워크 상에서 연결되어 있는 모든 컴퓨터는 웜 바이러스에 걸리게 된다.

예를 들어 7대의 컴퓨터가 <그림 1>과 같이 네트워크 상에서 연결되어 있다고 하자.
1번 컴퓨터가 웜 바이러스에 걸리면 웜 바이러스는 2번과 5번 컴퓨터를 거쳐 3번과 6번 컴퓨터까지 전파되어 2, 3, 5, 6 네 대의 컴퓨터는 웜 바이러스에 걸리게 된다.
하지만 4번과 7번 컴퓨터는 1번 컴퓨터와 네트워크상에서 연결되어 있지 않기 때문에 영향을 받지 않는다.

어느 날 1번 컴퓨터가 웜 바이러스에 걸렸다. 컴퓨터의 수와 네트워크 상에서 서로 연결되어 있는 정보가 주어질 때,
1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에는 컴퓨터의 수가 주어진다. 컴퓨터의 수는 100 이하이고 각 컴퓨터에는 1번 부터 차례대로 번호가 매겨진다.
둘째 줄에는 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수가 주어진다.
이어서 그 수만큼 한 줄에 한 쌍씩 네트워크 상에서 직접 연결되어 있는 컴퓨터의 번호 쌍이 주어진다.

출력
1번 컴퓨터가 웜 바이러스에 걸렸을 때, 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 첫째 줄에 출력한다.

예제 입력 1
7
6
1 2
2 3
1 5
5 2
5 6
4 7
예제 출력 1
4
출처
Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2004 > 초등부 3번

데이터를 추가한 사람: chansol, jh05013
잘못된 데이터를 찾은 사람: djm03178, jsa3824
알고리즘 분류
그래프 이론
그래프 탐색
너비 우선 탐색
깊이 우선 탐색
 */