package baekjoon.solved.class3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Problem11723 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String args[]) throws Exception {

        int n = Integer.parseInt(r.readLine());

        Set<Integer> set = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for(int i=1; i<=20; i++){
            temp.add(i);
        }
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(r.readLine());
            String type = st.nextToken();

            if(type.equals("all")) set = new HashSet<>(temp);
            else if(type.equals("empty")) set.clear();
            else {
                int num = Integer.parseInt(st.nextToken());

                if(type.equals("add")) set.add(num);
                else if(type.equals("remove")) set.remove(num);
                else if(type.equals("toggle")) {
                    if(set.contains(num)) set.remove(num);
                    else set.add(num);
                } else if(type.equals("check")){
                    if(set.contains(num)) sb.append(1);
                    else sb.append(0);
                    sb.append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}


/*

집합
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1.5 초	4 MB (하단 참고)	65663	20160	14443	29.274%
문제
비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.

add x: S에 x를 추가한다. (1 ≤ x ≤ 20) S에 x가 이미 있는 경우에는 연산을 무시한다.
remove x: S에서 x를 제거한다. (1 ≤ x ≤ 20) S에 x가 없는 경우에는 연산을 무시한다.
check x: S에 x가 있으면 1을, 없으면 0을 출력한다. (1 ≤ x ≤ 20)
toggle x: S에 x가 있으면 x를 제거하고, 없으면 x를 추가한다. (1 ≤ x ≤ 20)
all: S를 {1, 2, ..., 20} 으로 바꾼다.
empty: S를 공집합으로 바꾼다.
입력
첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.

둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.

출력
check 연산이 주어질때마다, 결과를 출력한다.

예제 입력 1
26
add 1
add 2
check 1
check 2
check 3
remove 2
check 1
check 2
toggle 3
check 1
check 2
check 3
check 4
all
check 10
check 20
toggle 10
remove 20
check 10
check 20
empty
check 1
toggle 1
check 1
toggle 1
check 1
예제 출력 1
1
1
0
1
0
1
0
1
0
1
1
0
0
0
1
0
출처
문제를 만든 사람: baekjoon
빠진 조건을 찾은 사람: djm03178
데이터를 추가한 사람: houma757
문제의 오타를 찾은 사람: pichulia
알고리즘 분류
보기

메모리 제한
Java 8: 448 MB
Java 8 (OpenJDK): 448 MB
Java 11: 448 MB
Kotlin (JVM): 448 MB
C#: 64 MB
Java 15: 448 MB
F#: 64 MB
Visual Basic: 64 MB

*/
