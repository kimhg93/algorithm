package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 수박수박수박수박수박수?
 */
public class Lessons12922 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(4) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++){
            if(i%2==1) sb.append("수");
            else sb.append("박");
        }
        answer = sb.toString();
        return answer;
    }
}

/*
수박수박수박수박수박수?
문제 설명
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요. 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

제한 조건
n은 길이 10,000이하인 자연수입니다.
입출력 예
n	return
3	"수박수"
4	"수박수박"
 */