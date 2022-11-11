package programmers.learn.challenges.level2;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 정렬
 * 가장 큰 수
 */
public class Lessons42746 {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[10000000];
        for(int i=0; i<10000000; i++){
            arr[i] = (int)(Math.random()*100);
        }


        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        solution(arr);
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        int sum = 0;

        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
            arr[i] = Integer.toString(numbers[i]);
        }

        if(sum == 0) return "0";

        Arrays.sort(arr,(s1, s2) -> {
            int n = Integer.parseInt(s1+s2);
            int m = Integer.parseInt(s2+s1);
            return m-n;
        });

        StringBuilder sb = new StringBuilder();
        Arrays.stream(arr).forEach(s -> sb.append(s));
        return sb.toString();
    }

}

/*
가장 큰 수
문제 설명
0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

제한 사항
numbers의 길이는 1 이상 100,000 이하입니다.
numbers의 원소는 0 이상 1,000 이하입니다.
정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
입출력 예
numbers	return
[6, 10, 2]	"6210"
[3, 30, 34, 5, 9]	"9534330"

 */