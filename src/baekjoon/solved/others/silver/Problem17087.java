package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Problem17087 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(r.readLine());

        int[] arr = new int[n+1];
        arr[0] = m;

        for(int i=1; i<=n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<arr.length-1; i++){
            int d = arr[i+1]-arr[i];
            pq.offer(d);
        }

        int x = 0;
        int y = 0;
        int r = 0;
        if(pq.size() > 1){
            while(!pq.isEmpty()){
                if(x==0 && y==0){
                    x = pq.poll();
                    y = pq.poll();
                } else x = pq.poll();
                while(true){
                    r = x%y;
                    if(r==0) break;
                    x = y;
                    y = r;
                }
            }
            System.out.println(y);
        } else System.out.println(pq.poll());
    }
}
/*

숨바꼭질 6
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	9541	4733	3785	48.569%
문제
수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.
수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다.
수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.

모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.

입력
첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다.
동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.

출력
가능한 D값의 최댓값을 출력한다.

예제 입력 1
3 3
1 7 11
예제 출력 1
2
예제 입력 2
3 81
33 105 57
예제 출력 2
24
예제 입력 3
1 1
1000000000
예제 출력 3
999999999


 */
