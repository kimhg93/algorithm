package programmers.learn.challenges.level2;

/**
 * 연습문제
 * JadenCase 문자열 만들기
 */
public class Lessons12951 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println(solution("for the last  3week"));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(String s) {
        for(int i=0; i<s.length(); i++){
            if(!s.substring(i, i+1).equals(" ")){
                if(i==0) s = upperCase(s, i);
                else {
                    if(s.substring(i-1,i).equals(" ")) s = upperCase(s, i);
                }
            }
        }
        return s;
    }

    public static String upperCase(String s, int idx){
        return s.substring(0,idx) +
                s.substring(idx,idx+1).toUpperCase() +
                s.substring(idx+1).toLowerCase();
    }
}
/*
문제 설명
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.
입출력 예
s	return
"3people unFollowed me"	"3people Unfollowed Me"
"for the last week"	"For The Last Week"
 */