package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem5582 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        String s1 = r.readLine();
        String s2 = r.readLine();

        int[][] d = new int[s1.length()+1][s2.length()+1];
        int max = 0;

        char[] arr1 = new char[s1.length()+1];
        char[] arr2 = new char[s2.length()+1];

        for(int i=1; i<arr1.length; i++){
            arr1[i] = s1.charAt(i-1);
        }

        for(int i=1; i<arr2.length; i++){
            arr2[i] = s2.charAt(i-1);
        }

        for(int i=1; i<arr1.length; i++){
            for(int j=1; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    d[i][j] = d[i-1][j-1] + 1;
                    if(d[i][j] > max) max = d[i][j];
                }

            }
        }
        System.out.println(max);
    }


}
/*
공통 부분 문자열 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	15662	6311	4956	42.370%
문제
두 문자열이 주어졌을 때, 두 문자열에 모두 포함된 가장 긴 공통 부분 문자열을 찾는 프로그램을 작성하시오.

어떤 문자열 s의 부분 문자열 t란, s에 t가 연속으로 나타나는 것을 말한다. 예를 들어, 문자열 ABRACADABRA의 부분 문자열은 ABRA, RAC, D, ACADABRA, ABRACADABRA, 빈 문자열 등이다. 하지만, ABRC, RAA, BA, K는 부분 문자열이 아니다.

두 문자열 ABRACADABRA와 ECADADABRBCRDARA의 공통 부분 문자열은 CA, CADA, ADABR, 빈 문자열 등이 있다. 이 중에서 가장 긴 공통 부분 문자열은 ADABR이며, 길이는 5이다. 또, 두 문자열이 UPWJCIRUCAXIIRGL와 SBQNYBSBZDFNEV인 경우에는 가장 긴 공통 부분 문자열은 빈 문자열이다.

입력
첫째 줄과 둘째 줄에 문자열이 주어진다. 문자열은 대문자로 구성되어 있으며, 길이는 1 이상 4000 이하이다.

출력
첫째 줄에 두 문자열에 모두 포함 된 부분 문자열 중 가장 긴 것의 길이를 출력한다.

예제 입력 1
ABRACADABRA
ECADADABRBCRDARA
예제 출력 1
5
예제 입력 2
UPWJCIRUCAXIIRGL
SBQNYBSBZDFNEV
예제 출력 2
0
출처


Olympiad > Japanese Olympiad in Informatics > JOI 2008 2번

문제를 번역한 사람: baekjoon
데이터를 추가한 사람: eric00513
문제의 오타를 찾은 사람: scka
알고리즘 분류
다이나믹 프로그래밍
문자열
메모
 */
