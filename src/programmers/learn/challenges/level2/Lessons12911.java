package programmers.learn.challenges.level2;

/**
 * 연습문제
 * 다음 큰 숫자
 */
public class Lessons12911 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println(solution(15));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(int n) {
        int answer = 0;
        String s = Integer.toBinaryString(n);
        int cnt = 0;
        for(int i=0; i<s.length(); i++){
            if(s.substring(i, i+1).equals("1")) cnt++;
        }
        for(int i=n+1; i<=Math.pow(10,6); i++){
            String b = Integer.toBinaryString(i);
            int bCnt = 0;
            for(int j=0; j<b.length(); j++){
                if(b.substring(j, j+1).equals("1")) bCnt++;
            }
            if(cnt == bCnt) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
}

/*
다음 큰 숫자
문제 설명
자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한 사항
n은 1,000,000 이하의 자연수 입니다.
입출력 예
n	result
78	83
15	23
입출력 예 설명
입출력 예#1
문제 예시와 같습니다.
입출력 예#2
15(1111)의 다음 큰 숫자는 23(10111)입니다.

 */