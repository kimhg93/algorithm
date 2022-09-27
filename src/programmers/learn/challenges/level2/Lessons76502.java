package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 월간 코드 챌린지 시즌2
 * 괄호 회전하기
 */
public class Lessons76502 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "}}}";
        /*
         */
        long s = System.currentTimeMillis();
        System.err.println( solution(str) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(String str) {
        int answer = 0;
        char[] arr = str.toCharArray();
        for(int i=0; i<arr.length; i++){ // 앞에거 잘라서 뒤에 붙이기
            char tmp = str.charAt(0);
            str = str.substring(1);
            str += tmp;
            if(check(str) == 0) answer++;
        }
        return answer;
    }

    public static int check(String str){
        while(true){
            int len = str.length();
            str = str.replace("()", "");
            str = str.replace("{}", "");
            str = str.replace("[]", "");
            if(len == str.length()) break; // 한번 돌렸는데도 그대로면 안되는거라고 치자
            if(str.length() == 0) break;
        }
        return str.length();
    }
}

/*
괄호 회전하기
문제 설명
다음 규칙을 지키는 문자열을 올바른 괄호 문자열이라고 정의합니다.

(), [], {} 는 모두 올바른 괄호 문자열입니다.
만약 A가 올바른 괄호 문자열이라면, (A), [A], {A} 도 올바른 괄호 문자열입니다. 예를 들어, [] 가 올바른 괄호 문자열이므로, ([]) 도 올바른 괄호 문자열입니다.
만약 A, B가 올바른 괄호 문자열이라면, AB 도 올바른 괄호 문자열입니다. 예를 들어, {} 와 ([]) 가 올바른 괄호 문자열이므로, {}([]) 도 올바른 괄호 문자열입니다.
대괄호, 중괄호, 그리고 소괄호로 이루어진 문자열 s가 매개변수로 주어집니다.
이 s를 왼쪽으로 x (0 ≤ x < (s의 길이)) 칸만큼 회전시켰을 때 s가 올바른 괄호 문자열이 되게 하는 x의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
s의 길이는 1 이상 1,000 이하입니다.
입출력 예
s	result
"[](){}"	3
"}]()[{"	2
"[)(]"	0
"}}}"	0
입출력 예 설명
입출력 예 #1

다음 표는 "[](){}" 를 회전시킨 모습을 나타낸 것입니다.
x	s를 왼쪽으로 x칸만큼 회전	올바른 괄호 문자열?
0	"[](){}"	O
1	"](){}["	X
2	"(){}[]"	O
3	"){}[]("	X
4	"{}[]()"	O
5	"}[](){"	X
올바른 괄호 문자열이 되는 x가 3개이므로, 3을 return 해야 합니다.
입출력 예 #2

다음 표는 "}]()[{" 를 회전시킨 모습을 나타낸 것입니다.
x	s를 왼쪽으로 x칸만큼 회전	올바른 괄호 문자열?
0	"}]()[{"	X
1	"]()[{}"	X
2	"()[{}]"	O
3	")[{}]("	X
4	"[{}]()"	O
5	"{}]()["	X
올바른 괄호 문자열이 되는 x가 2개이므로, 2를 return 해야 합니다.
입출력 예 #3

s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.
입출력 예 #4

s를 어떻게 회전하더라도 올바른 괄호 문자열을 만들 수 없으므로, 0을 return 해야 합니다.
 */