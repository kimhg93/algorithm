package structure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * BFS
 */
public class Bfs {

    static int[] arr = {1,2,3,4,5,6,7,8};
    static boolean[] visited = new boolean[arr.length+1];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        bfs(3);
        System.out.println(sb);
    }

    public static void bfs(int n){
        Queue<Integer> q = new LinkedList<>();  // 방문할 노드를 저장하는 용도
        q.offer(n);         // 처음 값 추가
        visited[n] = true;    // 처음 값 방문처리

        while(!q.isEmpty()){
            int x = q.poll();   // 먼저 삽입된 값 pop
            sb.append(x).append(" ");   // 결과 추가

            // 현재 노드에서 방문 가능한 노드중에 아직 방문 안한 노드 체크하며 큐에 추가
            for(int i=0; i<arr.length; i++){
                if(!visited[arr[i]]) {
                    visited[arr[i]] = true;
                    q.add(arr[i]);
                }
            }
        }
    }
}
