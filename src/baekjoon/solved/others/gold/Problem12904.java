package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem12904 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s = r.readLine();
        StringBuilder t = new StringBuilder();
        t.append(r.readLine());

        if(sameCheck(s, t.toString())) return;


        while(t.length() > s.length()){
            if(t.charAt(t.length()-1) == 'A'){
                t.delete(t.length()-1, t.length());
                if(sameCheck(s, t.toString())) break;
            } else {
                t.delete(t.length()-1, t.length());
                t.reverse();
                if(sameCheck(s, t.toString())) break;
            }
        }
    }

    public static boolean sameCheck(String s, String t){
        if(s.length() != t.length()) return false;
        if(s.equals(t)) System.out.println(1);
        else System.out.println(0);
        return true;
    }


}

/*

A와 B

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	11422	5430	4497	46.961%
문제
수빈이는 A와 B로만 이루어진 영어 단어가 존재한다는 사실에 놀랐다. 대표적인 예로 AB (Abdominal의 약자),
BAA (양의 울음 소리), AA (용암의 종류), ABBA (스웨덴 팝 그룹)이 있다.

이런 사실에 놀란 수빈이는 간단한 게임을 만들기로 했다. 두 문자열 S와 T가 주어졌을 때, S를 T로 바꾸는 게임이다.
문자열을 바꿀 때는 다음과 같은 두 가지 연산만 가능하다.

문자열의 뒤에 A를 추가한다.
문자열을 뒤집고 뒤에 B를 추가한다.
주어진 조건을 이용해서 S를 T로 만들 수 있는지 없는지 알아내는 프로그램을 작성하시오.

입력
첫째 줄에 S가 둘째 줄에 T가 주어진다. (1 ≤ S의 길이 ≤ 999, 2 ≤ T의 길이 ≤ 1000, S의 길이 < T의 길이)

출력
S를 T로 바꿀 수 있으면 1을 없으면 0을 출력한다.

예제 입력 1
B
ABBA
예제 출력 1
1
예제 입력 2
AB
ABB
예제 출력 2
0
출처
문제의 오타를 찾은 사람: apjw6112
문제를 번역한 사람: baekjoon
알고리즘 분류
구현
문자열
그리디 알고리즘

 */
