package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem14503 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    private static int cleanCnt = 2;

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];

        st = new StringTokenizer(r.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int dir = Integer.parseInt(st.nextToken());

        Robot robot = new Robot(x, y, dir);

        for(int i=0; i<n; i++){
            st = new StringTokenizer(r.readLine());
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        if(arr[robot.getY()][robot.getX()] == 0) clean(arr, robot);

        while(true){
            if(check(arr, robot)){
                find(arr, robot);
            } else {
                if(stop(arr, robot)) break;
            }
        }

        System.out.println(cleanCnt-=2);
    }

    // 주위에 청소할곳 있는지 체크
    public static boolean check(int[][] arr, Robot robot){
        int x = robot.getX();
        int y = robot.getY();

        int cnt = 0;
        if(x > 0 && y-1 > 0 && arr[y-1][x] == 0) cnt++;
        if(x-1 > 0 && y > 0 && arr[y][x-1] == 0) cnt++;
        if(x+1 > 0 && y > 0 && arr[y][x+1] == 0) cnt++;
        if(x > 0 && y+1 > 0 && arr[y+1][x] == 0) cnt++;

        if(cnt == 0) return false;
        else return true;
    }

    // 청소
    public static void clean(int[][] arr, Robot robot){
        int x = robot.getX();
        int y = robot.getY();
        if(arr[y][x] == 0) arr[y][x] = ++cleanCnt;
    }

    // 청소할 곳 찾기
    public static void find(int[][] arr, Robot robot){
        while(true){
            int x = robot.getX();
            int y = robot.getY();
            int dir = robot.getDir();

            if(dir == 0) robot.setDir(3);
            else if(dir == 3) robot.setDir(2);
            else if(dir == 2) robot.setDir(1);
            else if(dir == 1) robot.setDir(0);

            dir = robot.getDir();
            if(dir == 0) { // 북
                if(arr[y-1][x] == 0){
                    robot.setY(y-1);
                    clean(arr, robot);
                    break;
                }
            } else if(dir == 1){ // 동
                if(arr[y][x+1] == 0){
                    robot.setX(x+1);
                    clean(arr, robot);
                    break;
                }
            } else if(dir == 2){ // 남
                if(arr[y+1][x] == 0){
                    robot.setY(y+1);
                    clean(arr, robot);
                    break;
                }
            } else if(dir == 3){ // 서
                if(arr[y][x-1] == 0){
                    robot.setX(x-1);
                    clean(arr, robot);
                    break;
                }
            }
        }
    }

    // 후진 및 종료
    public static boolean stop(int[][] arr, Robot robot){
        int x = robot.getX();
        int y = robot.getY();
        int dir = robot.getDir();
        boolean stop = false;

        if(!check(arr, robot)){
            switch (dir) {
                case 0:
                    if(arr[y+1][x] == 1) stop = true;
                    else robot.setY(y+1);
                    break;
                case 1:
                    if(arr[y][x-1] == 1) stop = true;
                    else robot.setX(x-1);
                    break;
                case 2:
                    if(arr[y-1][x] == 1) stop = true;
                    else robot.setY(y-1);
                    break;
                case 3:
                    if(arr[y][x+1] == 1) stop = true;
                    else robot.setX(x+1);
                    break;
            }
        }
        return stop;
    }
}

class Robot {
    private int x;
    private int y;
    private int dir;

    public Robot(int x, int y, int dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getDir() { return dir; }
    public void setDir(int dir) { this.dir = dir; }
}

/*
로봇 청소기

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	51850	28209	19001	53.687%
문제
로봇 청소기와 방의 상태가 주어졌을 때, 청소하는 영역의 개수를 구하는 프로그램을 작성하시오.

로봇 청소기가 있는 방은
N * M 크기의 직사각형으로 나타낼 수 있으며, 1 * 1 크기의 정사각형 칸으로 나누어져 있다. 각각의 칸은 벽 또는 빈 칸이다.
청소기는 바라보는 방향이 있으며, 이 방향은 동, 서, 남, 북 중 하나이다. 방의 각 칸은 좌표 (r, c)로 나타낼 수 있고,
가장 북쪽 줄의 가장 서쪽 칸의 좌표가 (0, 0), 가장 남쪽 줄의 가장 동쪽 칸의 좌표가 (N-1, M-1)이다. 즉, 좌표
(r, c)는 북쪽에서 (r+1)번째에 있는 줄의 서쪽에서 (c+1)번째 칸을 가리킨다. 처음에 빈 칸은 전부 청소되지 않은 상태이다.

로봇 청소기는 다음과 같이 작동한다.

1. 현재 칸이 아직 청소되지 않은 경우, 현재 칸을 청소한다.
2. 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 없는 경우,
 1) 바라보는 방향을 유지한 채로 한 칸 후진할 수 있다면 한 칸 후진하고 1번으로 돌아간다.
 2) 바라보는 방향의 뒤쪽 칸이 벽이라 후진할 수 없다면 작동을 멈춘다.
3. 현재 칸의 주변 4칸 중 청소되지 않은 빈 칸이 있는 경우,
 1) 반시계 방향으로 90도 회전한다.
 2) 바라보는 방향을 기준으로 앞쪽 칸이 청소되지 않은 빈 칸인 경우 한 칸 전진한다.
 3) 1번으로 돌아간다.

입력
첫째 줄에 방의 크기 N과 M이 입력된다.
(3 <= N, M <= 50)  둘째 줄에 처음에 로봇 청소기가 있는 칸의 좌표 (r, c)와 처음에 로봇 청소기가 바라보는 방향 d가 입력된다.
d가 0인 경우 북쪽, 1인 경우 동쪽, 2인 경우 남쪽, 3인 경우 서쪽을 바라보고 있는 것이다.

셋째 줄부터 N개의 줄에 각 장소의 상태를 나타내는 N * M개의 값이 한 줄에 M개씩 입력된다.
i번째 줄의 j번째 값은 칸 (i, j)의 상태를 나타내며, 이 값이 0인 경우 (i, j)가 청소되지 않은 빈 칸이고,
1인 경우 (i, j)에 벽이 있는 것이다. 방의 가장 북쪽, 가장 남쪽, 가장 서쪽, 가장 동쪽 줄 중 하나 이상에 위치한 모든 칸에는 벽이 있다.
로봇 청소기가 있는 칸은 항상 빈 칸이다.

출력
로봇 청소기가 작동을 시작한 후 작동을 멈출 때까지 청소하는 칸의 개수를 출력한다.

예제 입력 1
3 3
1 1 0
1 1 1
1 0 1
1 1 1
예제 출력 1
1
예제 입력 2
11 10
7 4 0
1 1 1 1 1 1 1 1 1 1
1 0 0 0 0 0 0 0 0 1
1 0 0 0 1 1 1 1 0 1
1 0 0 1 1 0 0 0 0 1
1 0 1 1 0 0 0 0 0 1
1 0 0 0 0 0 0 0 0 1
1 0 0 0 0 0 0 1 0 1
1 0 0 0 0 0 1 1 0 1
1 0 0 0 0 0 1 1 0 1
1 0 0 0 0 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1
예제 출력 2
57

알고리즘 분류
구현
시뮬레이션
 */
