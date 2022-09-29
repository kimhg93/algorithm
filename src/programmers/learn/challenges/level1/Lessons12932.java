package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 자연수 뒤집어 배열로 만들기
 */
public class Lessons12932 {

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        System.err.println( solution(12345) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            answer[answer.length-i-1] = Integer.parseInt(str.substring(i, i+1));
        }
        return answer;
    }
}

/*
자연수 뒤집어 배열로 만들기
문제 설명
자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

제한 조건
n은 10,000,000,000이하인 자연수입니다.
입출력 예
n	return
12345	[5,4,3,2,1]
 */