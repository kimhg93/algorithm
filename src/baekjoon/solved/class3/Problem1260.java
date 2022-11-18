package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem1260 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main (String[]args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        ArrayList<Integer>[] arr = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            st = new StringTokenizer(r.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[A].add(B);
            arr[B].add(A);
            Collections.sort(arr[A]);
            Collections.sort(arr[B]);
        }

        // dfs
        DFS(n, start, arr);
        // bfs
        BFS(n, start, arr);
    }

    public static void BFS(int n, int start, ArrayList<Integer>[] arr){
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n+1];
        sb.setLength(0);
        q.offer(start);
        visit[start] = true;

        while (!q.isEmpty()){
            int num = q.poll();
            sb.append(num).append(" ");
            for(int i=0; i<arr[num].size(); i++){
                int next = arr[num].get(i);
                if(!visit[next]){
                    q.offer(next);
                    visit[next] = true;
                }
            }
        }
        System.out.println(sb);
    }
    public static void DFS(int n, int start, ArrayList<Integer>[] arr){
        Stack<Integer> st = new Stack();
        boolean[] visit = new boolean[n+1];
        sb.setLength(0);
        st.push(start);

        while(!st.isEmpty()){
            int num = st.pop();
            if(!visit[num]){
                sb.append(num).append(" ");
                visit[num] = true;
                for(int i=arr[num].size()-1; i>=0; i--){ // 정렬되어 있어 거꾸로 순회
                    int next = arr[num].get(i);
                    if(!visit[next]) st.push(next);
                }
            }
        }
        System.out.println(sb);
    }
}
/*


DFS와 BFS
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	205663	75883	45017	35.894%
문제
그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고,
더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

입력
첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.

출력
첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.

예제 입력 1
4 5 1
1 2
1 3
1 4
2 4
3 4
예제 출력 1
1 2 4 3
1 2 3 4
예제 입력 2
5 5 3
5 4
5 2
1 2
3 4
3 1
예제 출력 2
3 1 2 5 4
3 1 4 2 5
예제 입력 3
1000 1 1000
999 1000
예제 출력 3
1000 999
1000 999
 */