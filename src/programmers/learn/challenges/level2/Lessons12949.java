package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 연습문제
 * 행렬의 곱셈
 */
public class Lessons12949 {

    public static void main(String[] args) throws Exception {
        int[][] arr = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4}, {2, 4}, {3, 1}};

        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(arr, arr2) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int h = arr1.length;
        int w = arr2[0].length;
        int[][] answer = new int[h][w];

        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                int n = 0;
                for(int k=0; k<arr2.length; k++){
                    n += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = n;
            }
        }
        return answer;
    }
}

/*
행렬의 곱셈
문제 설명
2차원 행렬 arr1과 arr2를 입력받아, arr1에 arr2를 곱한 결과를 반환하는 함수, solution을 완성해주세요.

제한 조건
행렬 arr1, arr2의 행과 열의 길이는 2 이상 100 이하입니다.
행렬 arr1, arr2의 원소는 -10 이상 20 이하인 자연수입니다.
곱할 수 있는 배열만 주어집니다.
입출력 예
arr1	arr2	return
[[1, 4], [3, 2], [4, 1]]	[[3, 3], [3, 3]]	[[15, 15], [15, 15], [15, 15]]
[[2, 3, 2], [4, 2, 4], [3, 1, 4]]	[[5, 4, 3], [2, 4, 1], [3, 1, 1]]	[[22, 22, 11], [36, 28, 18], [29, 20, 14]]
 */
