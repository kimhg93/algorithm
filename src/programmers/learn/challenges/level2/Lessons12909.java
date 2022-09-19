package programmers.learn.challenges.level2;

/**
 * 스택/큐
 * 올바른 괄호
 */
public class Lessons12909 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = ")()((())()";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<10000000; i++){
            sb.append(str);
        }

        long s = System.currentTimeMillis();
        System.err.println(solution(sb.toString()));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static boolean solution(String s) {
        int open = 0;
        int close = 0;
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if(c.equals("(")){
                open++;
            } else{
                close++;
            }
            if(open < close) return false;
        }
        if(open==close) return true;
        else return false;
    }
}

/*
괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어
()())(
"()()" 또는 "(())()" 는 올바른 괄호입니다.
")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
'(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

제한사항
문자열 s의 길이 : 100,000 이하의 자연수
문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
입출력 예
s	answer
"()()"	true
"(())()"	true
")()("	false
"(()("	false
입출력 예 설명
입출력 예 #1,2,3,4
문제의 예시와 같습니다.
 */