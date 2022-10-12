package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 제일 작은 수 제거하기
 */
public class Lessons12935 {

    public static void main(String[] args) throws Exception {
        int[] arr = {4,3,2,1};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(arr) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(int[] arr) {
        int[] answer;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min) cnt++;
        }
        if(arr.length == cnt) {
            answer = new int[] {-1};
        } else {
            answer = new int[arr.length-cnt];
        }

        int idx = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min) {
                answer[idx] = arr[i];
                idx++;
            }
        }
        return answer;
    }
}

/*
제일 작은 수 제거하기
문제 설명
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.

제한 조건
arr은 길이 1 이상인 배열입니다.
인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
입출력 예
arr	return
[4,3,2,1]	[4,3,2]
[10]	[-1]
 */