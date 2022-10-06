package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 소수 찾기
 */
public class Lessons12921 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 10;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(n) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(int n) {
        int answer = 0;
        for(int i=2; i<=n; i++){
            int cnt = 0;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j == 0) {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0) answer++;
        }
        return answer;
    }
}

/*
소수 찾기
문제 설명
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다.
입출력 예
n	result
10	4
5	3
입출력 예 설명
입출력 예 #1
1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환

입출력 예 #2
1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
 */