package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 월간 코드 챌린지 시즌3
 * n^2 배열 자르기
 */
public class Lessons87390 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        //System.err.println(Arrays.toString(solution(45689,71,14669)) );
        solution(400000,0,100);
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(int n, long left, long right) {
        int[] answer = {};

        long row = left/n+1;
        long col = left%n+1;
        long m = right-left+1;

        int cnt = 0;

        int[] arr = new int[(int)(m)];

        int startVal = 0;
        if(col <= row) startVal = (int) row;
        else startVal = (int) (row + (col-row));

        if(col <= row){
            for(int i=0; i<n-col+1; i++){
                if(i >= m) break;
                if(i <= row-col) arr[i] = startVal;
                else arr[i] = arr[i-1]+1;
                cnt++;
            }
        } else {
            for(int i=0; i<n-col+1; i++){
                if(i >= m) break;
                if(i == 0) arr[i] = startVal;
                else arr[i] = arr[i-1]+1;
                cnt++;
            }
        }

        int s = (int) (row+1);
        int idx = cnt;
        for(int i=0; i<m-cnt-1; i++){
            int cnt2 = n;
            for(int j=0; j<s; j++){
                if(idx >= m) break;
                arr[idx] = s;
                idx++;
                cnt2--;
            }
            for(int j=0; j<cnt2; j++){
                if(idx >= m) break;
                arr[idx] = arr[idx-1]+1;
                idx++;
            }
            s++;
        }

        System.err.println(Arrays.toString(arr));
        return arr;
    }
}

/*
n^2 배열 자르기
문제 설명
정수 n, left, right가 주어집니다. 다음 과정을 거쳐서 1차원 배열을 만들고자 합니다.

n행 n열 크기의 비어있는 2차원 배열을 만듭니다.
i = 1, 2, 3, ..., n에 대해서, 다음 과정을 반복합니다.
1행 1열부터 i행 i열까지의 영역 내의 모든 빈 칸을 숫자 i로 채웁니다.
1행, 2행, ..., n행을 잘라내어 모두 이어붙인 새로운 1차원 배열을 만듭니다.
새로운 1차원 배열을 arr이라 할 때, arr[left], arr[left+1], ..., arr[right]만 남기고 나머지는 지웁니다.
정수 n, left, right가 매개변수로 주어집니다. 주어진 과정대로 만들어진 1차원 배열을 return 하도록 solution 함수를 완성해주세요.

제한사항
1 ≤ n ≤ 10^7
0 ≤ left ≤ right < n^2
right - left < 10^5
입출력 예
n	left	right	result
3	2	5	[3,2,2,3]
4	7	14	[4,3,3,3,4,4,4,4]
 */