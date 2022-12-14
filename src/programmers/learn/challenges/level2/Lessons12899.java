package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 연습문제
 * 124 나라의 숫자
 */
public class Lessons12899 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(3) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(int n) {
        StringBuilder sb = new StringBuilder();
        int t = 3; // target
        int idx = 2;
        while(n>t){
            t += Math.pow(3, idx);
            idx++;
        }

        int start = ((int)(t-Math.pow(3, idx-1))+1); // 자리수 시작 위치
        int m = n-start;
        int pow = idx-2;

        for(int i=0; i<idx-1; i++){
            int div = (int)(m/Math.pow(3, pow));

            if(div == 2) sb.append(4);
            else if(div == 1) sb.append(2);
            else sb.append(1);

            m %= Math.pow(3, pow);
            pow--;
        }

        return sb.toString();
    }
}

/*
124 나라의 숫자
문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

124 나라에는 자연수만 존재합니다.
124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.

10진법	124 나라	10진법	124 나라
1	1	6	14
2	2	7	21
3	4	8	22
4	11	9	24
5	12	10	41

자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

제한사항
n은 50,000,000이하의 자연수 입니다.
입출력 예
n	result
1	1
2	2
3	4
4	11
 */