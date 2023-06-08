package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Problem15686 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken()); // n*n 배열
        int m = Integer.parseInt(st.nextToken()); // 치킨집 최대
        List<House> houses = new ArrayList<>();
        List<Chicken> chickens = new ArrayList<>();

        for(int i=1; i<=n; i++){
            st = new StringTokenizer(r.readLine());
            for(int j=1; j<=n; j++){
                int type = Integer.parseInt(st.nextToken());

                if(type == 1) houses.add(new House(i, j)); // 집 리스트
                else if(type == 2) chickens.add(new Chicken(i, j)); // 치킨집 리스트
            }
        }

        int[] arr = new int[chickens.size()];

        for(int i=0; i<arr.length; i++) { // combination 을 생성하기 위한 배열 만듬
            arr[i] = i;
        }

        List<List<Integer>> combination = combination(arr, m); // combination 리스트 생성
        // combination 리스트는 chickens 의 index 를 담고 있다

        int min = Integer.MAX_VALUE;

        for(int i=0; i<combination.size(); i++){ // combination 리스트 순회하며 가장 작은 값 찾기
            List<Integer> cIdxList = combination.get(i);
            int sum = 0;

            for(int j=0; j<houses.size(); j++){ // 각 집마다 가장 가까운 치킨집 찾기
                House h = houses.get(j);
                int minDis = Integer.MAX_VALUE;

                for(int k=0; k<cIdxList.size(); k++){ // 치킨집 인덱스
                    Chicken ck = chickens.get(cIdxList.get(k));
                    int dis = Math.abs(ck.getX()-h.getX()) + Math.abs(ck.getY()-h.getY());
                    if(minDis > dis) minDis = dis;
                }

                sum += minDis;
            }

            if(min > sum) min = sum;
        }

        System.out.println(min);

    }


    public static List<List<Integer>> combination(int[] arr, int r) {
        List<List<Integer>> result = new ArrayList<>();
        int[] index = new int[r];

        for (int i=0; i<r; i++) {
            index[i] = i;
        }

        while (true) {
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<r; i++) {
                list.add(arr[index[i]]);
            }
            result.add(list);

            int i = r-1;

            while (i >= 0) {
                if (index[i] == arr.length-r+i) i--;
                else break;
            }

            if (i < 0) break;

            index[i]++;
            for (int j= i+1; j<r; j++) {
                index[j] = index[j-1] + 1;
            }

        }
        return result;
    }

}

abstract class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
}

class House extends Point {
    public House(int x, int y) {
        super(x, y);
    }
}

class Chicken extends Point {
    public Chicken(int x, int y) {
        super(x, y);
    }
}

/*
치킨 배달

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	69544	33953	20324	45.559%
문제
크기가 N×N인 도시가 있다. 도시는 1×1크기의 칸으로 나누어져 있다. 도시의 각 칸은 빈 칸, 치킨집, 집 중 하나이다. 도시의 칸은 (r, c)와 같은 형태로 나타내고,
r행 c열 또는 위에서부터 r번째 칸, 왼쪽에서부터 c번째 칸을 의미한다. r과 c는 1부터 시작한다.

이 도시에 사는 사람들은 치킨을 매우 좋아한다. 따라서, 사람들은 "치킨 거리"라는 말을 주로 사용한다. 치킨 거리는 집과 가장 가까운 치킨집 사이의 거리이다.
즉, 치킨 거리는 집을 기준으로 정해지며, 각각의 집은 치킨 거리를 가지고 있다. 도시의 치킨 거리는 모든 집의 치킨 거리의 합이다.

임의의 두 칸 (r1, c1)과 (r2, c2) 사이의 거리는 |r1-r2| + |c1-c2|로 구한다.

예를 들어, 아래와 같은 지도를 갖는 도시를 살펴보자.

0 2 0 1 0
1 0 1 0 0
0 0 0 0 0
0 0 0 1 1
0 0 0 1 2
0은 빈 칸, 1은 집, 2는 치킨집이다.

(2, 1)에 있는 집과 (1, 2)에 있는 치킨집과의 거리는 |2-1| + |1-2| = 2,
(5, 5)에 있는 치킨집과의 거리는 |2-5| + |1-5| = 7이다. 따라서, (2, 1)에 있는 집의 치킨 거리는 2이다.

(5, 4)에 있는 집과 (1, 2)에 있는 치킨집과의 거리는 |5-1| + |4-2| = 6,
(5, 5)에 있는 치킨집과의 거리는 |5-5| + |4-5| = 1이다. 따라서, (5, 4)에 있는 집의 치킨 거리는 1이다.

이 도시에 있는 치킨집은 모두 같은 프랜차이즈이다. 프렌차이즈 본사에서는 수익을 증가시키기 위해 일부 치킨집을 폐업시키려고 한다.
오랜 연구 끝에 이 도시에서 가장 수익을 많이 낼 수 있는 치킨집의 개수는 최대 M개라는 사실을 알아내었다.

도시에 있는 치킨집 중에서 최대 M개를 고르고, 나머지 치킨집은 모두 폐업시켜야 한다.
어떻게 고르면, 도시의 치킨 거리가 가장 작게 될지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N(2 ≤ N ≤ 50)과 M(1 ≤ M ≤ 13)이 주어진다.

둘째 줄부터 N개의 줄에는 도시의 정보가 주어진다.

도시의 정보는 0, 1, 2로 이루어져 있고, 0은 빈 칸, 1은 집, 2는 치킨집을 의미한다.
집의 개수는 2N개를 넘지 않으며, 적어도 1개는 존재한다. 치킨집의 개수는 M보다 크거나 같고, 13보다 작거나 같다.

출력
첫째 줄에 폐업시키지 않을 치킨집을 최대 M개를 골랐을 때, 도시의 치킨 거리의 최솟값을 출력한다.

1,3 |1-2| + |3-3| = 1
2,3
2,3 |2-2| + |3-5| = 2
2,5
3,2 |3-3| + |2-3| = 1
3,3
4,3 |4-3| + |3-3| = 1
3,3


예제 입력 1
5 3
0 0 1 0 0
0 0 2 0 1
0 1 2 0 0
0 0 1 0 0
0 0 0 0 2
예제 출력 1
5
예제 입력 2
5 2
0 2 0 1 0
1 0 1 0 0
0 0 0 0 0
2 0 0 1 1
2 2 0 1 2
예제 출력 2
10
예제 입력 3
5 1
1 2 0 0 0
1 2 0 0 0
1 2 0 0 0
1 2 0 0 0
1 2 0 0 0
예제 출력 3
11
예제 입력 4
5 1
1 2 0 2 1
1 2 0 2 1
1 2 0 2 1
1 2 0 2 1
1 2 0 2 1
예제 출력 4
32
출처
문제를 만든 사람: baekjoon
문제의 오타를 찾은 사람: chaeeun218, wlsgussla123
알고리즘 분류
구현
브루트포스 알고리즘
백트래킹

 */

