package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 연습문제
 * N개의 최소공배수
 */
public class Lessons12953 {

    public static void main(String[] args) throws Exception {
        int[] arr = {2,6,8,14,125,75,99,62};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println(solution(arr));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);

        for(int i=arr[arr.length-1]*arr[0]; i<=Integer.MAX_VALUE; i++){
            int cnt = 0;
            for(int j=0; j<arr.length; j++){
                if(i%arr[j]==0) cnt++;
                else break;
            }
            if(cnt == arr.length) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    
}

/*

N개의 최소공배수
문제 설명
두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

제한 사항
arr은 길이 1이상, 15이하인 배열입니다.
arr의 원소는 100 이하인 자연수입니다.
입출력 예
arr	result
[2,6,8,14]	168
[1,2,3]	6

 */