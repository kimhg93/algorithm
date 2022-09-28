package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 평균 구하기
 */
public class Lessons12944 {

    public static void main(String[] args) throws Exception {
        int[] arr = {1, 2, 3, 4};
        long s = System.currentTimeMillis();
        System.err.println( solution(arr) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static double solution(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return (double)sum/arr.length;
    }
}

/*
평균 구하기
문제 설명
정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

제한사항
arr은 길이 1 이상, 100 이하인 배열입니다.
arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
입출력 예
arr	return
[1,2,3,4]	2.5
[5,5]	5
 */