package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 월간 코드 챌린지 시즌2
 * 2개 이하로 다른 비트
 */
public class Lessons77885 {

    public static void main(String[] args) throws Exception {
        long[] arr = new long[1000000];
        for(int i=0; i<1000000; i++){
            arr[i] = 99999459624591999L;
        }
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(arr) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<numbers.length; i++){
            String str = "0"+Long.toString(numbers[i],2);
            for(int j=str.length()-1; j>=0; j--){
                sb.setLength(0);
                if(str.charAt(j) == '0'){
                    sb.append(str, 0, j);
                    if(j == str.length()-1) sb.append("1").append(str.substring(j+1));
                    else sb.append("10").append(str.substring(j+2));
                    answer[i] = Long.parseLong(sb.toString(), 2);
                    break;
                }
            }
        }
        return answer;
    }

}
/*
2개 이하로 다른 비트
문제 설명
양의 정수 x에 대한 함수 f(x)를 다음과 같이 정의합니다.

x보다 크고 x와 비트가 1~2개 다른 수들 중에서 제일 작은 수
예를 들어,

f(2) = 3 입니다. 다음 표와 같이 2보다 큰 수들 중에서 비트가 다른 지점이 2개 이하이면서 제일 작은 수가 3이기 때문입니다.
수	비트	다른 비트의 개수
2	000...0010
3	000...0011	1
f(7) = 11 입니다. 다음 표와 같이 7보다 큰 수들 중에서 비트가 다른 지점이 2개 이하이면서 제일 작은 수가 11이기 때문입니다.
수	비트	다른 비트의 개수
7	000...0111
8	000...1000	4
9	000...1001	3
10	000...1010	3
11	000...1011	2
정수들이 담긴 배열 numbers가 매개변수로 주어집니다. numbers의 모든 수들에 대하여 각 수의 f 값을 배열에 차례대로 담아 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ numbers의 길이 ≤ 100,000
0 ≤ numbers의 모든 수 ≤ 1015
입출력 예
numbers	result
[2,7]	[3,11]
입출력 예 설명
입출력 예 #1

문제 예시와 같습니다.
 */