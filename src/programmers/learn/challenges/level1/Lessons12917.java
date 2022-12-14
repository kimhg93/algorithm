package programmers.learn.challenges.level1;

import java.util.Arrays;

/**
 * 연습문제
 * 문자열 내림차순으로 배치하기
 */
public class Lessons12917 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "Zbcdefg";

        long s = System.currentTimeMillis();
        System.err.println( solution(str) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[s.length()];
        for(int i=0; i<arr.length; i++){
            arr[i] = s.charAt(i);
        }
        Arrays.sort(arr);
        for(int i=arr.length-1; i>=0; i--){
            sb.append(Character.toString(arr[i]));
        }
        return sb.toString();
    }
}

/*
문자열 내림차순으로 배치하기
문제 설명
문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
입출력 예
s	return
"Zbcdefg"	"gfedcbZ"
 */