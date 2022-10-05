package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 가운데 글자 가져오기
 */
public class Lessons12903 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution("abcde") );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(String s) {
        String answer = "";
        int n = s.length()/2;
        if(s.length()%2==0) answer = s.substring(n-1,n+1);
        else answer = s.substring(n,n+1);
        return answer;
    }
}

/*
가운데 글자 가져오기
문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
"abcde"	"c"
"qwer"	"we"
 */