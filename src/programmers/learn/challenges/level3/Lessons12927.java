package programmers.learn.challenges.level3;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 코딩테스트 연습
 * 연습문제
 * 야근 지수
 */
public class Lessons12927 {

    public static void main(String[] args) throws Exception {
        int[] arr = {4, 3, 3};
        int n = 4;

        long s = System.currentTimeMillis();
        System.err.println(solution(n, arr));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static long solution(int n, int[] works) {
        Comparator<Integer> reverseOrder = Comparator.reverseOrder();
        Queue<Integer> pq = new PriorityQueue<>(reverseOrder);
        for(int i=0; i<works.length; i++){
            pq.offer(works[i]);
        }

        long answer = 0;

        for(int i=0; i<n; i++){
            int a = pq.poll();
            if(a > 0) a -= 1;
            pq.offer(a);
        }

        while(pq.size() > 0) {
            answer += (long) Math.pow(pq.poll(), 2);
        }

        return answer;
    }

}

/*
문제 설명
회사원 Demi는 가끔은 야근을 하는데요, 야근을 하면 야근 피로도가 쌓입니다. 야근 피로도는 야근을 시작한 시점에서 남은 일의 작업량을 제곱하여 더한 값입니다.
Demi는 N시간 동안 야근 피로도를 최소화하도록 일할 겁니다.Demi가 1시간 동안 작업량 1만큼을 처리할 수 있다고 할 때,
퇴근까지 남은 N 시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값을 리턴하는 함수 solution을 완성해주세요.

제한 사항
works는 길이 1 이상, 20,000 이하인 배열입니다.
works의 원소는 50000 이하인 자연수입니다.
n은 1,000,000 이하인 자연수입니다.
입출력 예
works	n	result
[4, 3, 3]	4	12
[2, 1, 2]	1	6
[1,1]	3	0
입출력 예 설명
입출력 예 #1
n=4 일 때, 남은 일의 작업량이 [4, 3, 3] 이라면 야근 지수를 최소화하기 위해 4시간동안 일을 한 결과는 [2, 2, 2]입니다.
이 때 야근 지수는 2^2 + 2^2 + 2^2 = 12 입니다.

입출력 예 #2
n=1일 때, 남은 일의 작업량이 [2,1,2]라면 야근 지수를 최소화하기 위해 1시간동안 일을 한 결과는 [1,1,2]입니다.
야근지수는 1^2 + 1^2 + 2^2 = 6입니다.

입출력 예 #3

남은 작업량이 없으므로 피로도는 0입니다.
 */