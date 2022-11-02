package programmers.learn.challenges.level1;

import java.util.Arrays;

/**
 * 완전탐색
 * 모의고사
 */
public class Lessons42840 {

    public static void main(String[] args) throws Exception {
        int[] arr = {1,2,3,4,5};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(arr) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(int[] answers) {
        int[][] arr = {{0,0,0}, {1,2,3}};
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};

        int aIdx = 0;
        int bIdx = 0;
        int cIdx = 0;

        for(int i=0; i<answers.length; i++){
            if(aIdx == 5) aIdx = 0;
            if(a[aIdx] == answers[i]) arr[0][0]++;
            aIdx++;
            if(bIdx == 8) bIdx = 0;
            if(b[bIdx] == answers[i]) arr[0][1]++;
            bIdx++;
            if(cIdx == 10) cIdx = 0;
            if(c[cIdx] == answers[i]) arr[0][2]++;
            cIdx++;
        }
        int cnt = 3;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<3; i++){
            if(arr[0][i] > max) max = arr[0][i];
        }
        for(int i=0; i<3; i++){
            if(arr[0][i] < max) cnt--;
        }
        for(int i=0; i<3; i++){
            if(arr[0][i] < max) arr[1][i] = Integer.MAX_VALUE;
        }

        Arrays.sort(arr[1]);

        int[] re = Arrays.copyOfRange(arr[1], 0, cnt);

        return re;
    }
}

/*
모의고사
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.
입출력 예
answers	return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
입출력 예 설명
입출력 예 #1

수포자 1은 모든 문제를 맞혔습니다.
수포자 2는 모든 문제를 틀렸습니다.
수포자 3은 모든 문제를 틀렸습니다.
따라서 가장 문제를 많이 맞힌 사람은 수포자 1입니다.

입출력 예 #2

모든 사람이 2문제씩을 맞췄습니다.
 */