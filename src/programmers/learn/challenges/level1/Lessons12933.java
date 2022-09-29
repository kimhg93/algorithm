package programmers.learn.challenges.level1;

/**
 * 연습문제
 * 정수 내림차순으로 배치하기
 */
public class Lessons12933 {

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();
        System.err.println( solution(118372) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);
        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }

        for(int i=0; i<arr.length; i++){
            int temp = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        long m = 1;
        int l = arr.length;
        while(n > m){
            answer += arr[l-1]*m;
            m*=10;
            l--;
        }
        return answer;
    }
}

/*
정수 내림차순으로 배치하기
문제 설명
함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

제한 조건
n은 1이상 8000000000 이하인 자연수입니다.
입출력 예
n	return
118372	873211
 */