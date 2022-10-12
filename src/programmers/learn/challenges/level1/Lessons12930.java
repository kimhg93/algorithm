package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 이상한 문자 만들기
 */
public class Lessons12930 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "try hello world";

        long s = System.currentTimeMillis();
        System.err.println( solution(str) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i=0; i<s.length(); i++){
            String c = s.substring(i, i+1);
            if(c.equals(" ")){
                sb.append(c);
                flag = true;
            } else {
                if(flag){
                    sb.append(c.toUpperCase());
                    flag = false;
                } else {
                    sb.append(c.toLowerCase());
                    flag = true;
                }
            }
        }
        return sb.toString();
    }
    
}

/*
이상한 문자 만들기
문제 설명
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

제한 사항
문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
입출력 예
s	return
"try hello world"	"TrY HeLlO WoRlD"
입출력 예 설명
 */