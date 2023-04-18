package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem9251 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        String str1 = r.readLine();
        String str2 = r.readLine();

        char[] arr1 = new char[str1.length()+1];
        char[] arr2 = new char[str2.length()+1];

        for(int i=1; i<arr1.length; i++){
            arr1[i] = str1.charAt(i-1);
        }

        for(int i=1; i<arr2.length; i++){
            arr2[i] = str2.charAt(i-1);
        }

        int[][] d = new int[arr1.length][arr2.length];

        for(int i=1; i<arr1.length; i++){
            for(int j=1; j<arr2.length; j++){
                if(arr1[i] == arr2[j]) d[i][j] = d[i-1][j-1]+1;
                else d[i][j] = Math.max(d[i-1][j], d[i][j-1]);
            }
        }

        System.out.println(d[str1.length()][str2.length()]);


    }
}

/*

https://ko.wikipedia.org/wiki/%EC%B5%9C%EC%9E%A5_%EA%B3%B5%ED%86%B5_%EB%B6%80%EB%B6%84_%EC%88%98%EC%97%B4

LCS

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.1 초 (하단 참고)	256 MB	68237	27761	20363	40.261%
문제
LCS(Longest Common Subsequence, 최장 공통 부분 수열)문제는 두 수열이 주어졌을 때, 모두의 부분 수열이 되는 수열 중 가장 긴 것을 찾는 문제이다.

예를 들어, ACAYKP와 CAPCAK의 LCS는 ACAK가 된다.

입력
첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다.

출력
첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를 출력한다.

예제 입력 1
ACAYKP
CAPCAK
예제 출력 1
4
출처
문제를 만든 사람: baekjoon
데이터를 추가한 사람: bang627, eric00513, qpwoeiruty
알고리즘 분류
다이나믹 프로그래밍
문자열
시간 제한
Java 8: 0.4 초
Python 3: 2 초
PyPy3: 2 초
Java 8 (OpenJDK): 0.4 초
Java 11: 0.4 초
Kotlin (JVM): 0.4 초
Java 15: 0.4 초

 */

