package programmers.learn.challenges.level2;

import java.util.Arrays;

/**
 * 코딩테스트 연습
 * 월간 코드 챌린지 시즌1
 * 쿼드압축 후 개수 세기
 */
public class Lessons68936 {

    public static void main(String[] args) throws Exception {
        int[][] arr = {{1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1},{0,0,0,0,1,1,1,1},{0,1,0,0,1,1,1,1},{0,0,0,0,0,0,1,1},{0,0,0,0,0,0,0,1},{0,0,0,0,1,0,0,1},{0,0,0,0,1,1,1,1}};

        long s = System.currentTimeMillis();
        System.err.println(Arrays.toString(solution(arr)));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(int[][] arr) {

        for(int k=arr.length; k>=2; k/=2){
            int size = k;
            int repeat = arr.length / size;
            for(int x=0; x<repeat; x++){
                for(int y=0; y<repeat; y++){
                    int val = 0;
                    for(int i=1; i<=size; i++){
                        for(int j=1; j<=size; j++){
                            int a = (size*x)+i-1;
                            int b = (size*y)+j-1;
                            val += arr[a][b];
                        }
                    }
                    if(val == Math.pow(size, 2) || val == 0) arr = compression(arr, x, y, size);
                }
            }
        }

        int one = 0;
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j] == 1) one++;
                if(arr[i][j] == 0) zero++;
            }
        }

        return new int[] {zero, one};
    }

    public static int[][] compression(int[][] arr, int x, int y, int size) {

        for(int i=1; i<=size; i++){
            for(int j=1; j<=size; j++){
                int a = (size*x)+i-1;
                int b = (size*y)+j-1;
                if(!(i == 1 && j == 1)) arr[a][b] = -1;
            }
        }

        return arr;
    }


    /*
    8 4 2 1

     */

}
/*

문제 설명
0과 1로 이루어진 2n x 2n 크기의 2차원 정수 배열 arr이 있습니다. 당신은 이 arr을 쿼드 트리와 같은 방식으로 압축하고자 합니다.
구체적인 방식은 다음과 같습니다.

당신이 압축하고자 하는 특정 영역을 S라고 정의합니다.
만약 S 내부에 있는 모든 수가 같은 값이라면, S를 해당 수 하나로 압축시킵니다.
그렇지 않다면, S를 정확히 4개의 균일한 정사각형 영역(입출력 예를 참고해주시기 바랍니다.)으로 쪼갠 뒤, 각 정사각형 영역에 대해 같은 방식의 압축을 시도합니다.
arr이 매개변수로 주어집니다. 위와 같은 방식으로 arr을 압축했을 때, 배열에 최종적으로 남는 0의 개수와 1의 개수를 배열에 담아서 return 하도록 solution 함수를 완성해주세요.

제한사항
arr의 행의 개수는 1 이상 1024 이하이며, 2의 거듭 제곱수 형태를 하고 있습니다. 즉, arr의 행의 개수는 1, 2, 4, 8, ..., 1024 중 하나입니다.
arr의 각 행의 길이는 arr의 행의 개수와 같습니다. 즉, arr은 정사각형 배열입니다.
arr의 각 행에 있는 모든 값은 0 또는 1 입니다.
입출력 예
arr	result
[[1,1,0,0],[1,0,0,0],[1,0,0,1],[1,1,1,1]]	[4,9]
[[1,1,1,1,1,1,1,1],[0,1,1,1,1,1,1,1],[0,0,0,0,1,1,1,1],[0,1,0,0,1,1,1,1],[0,0,0,0,0,0,1,1],[0,0,0,0,0,0,0,1],[0,0,0,0,1,0,0,1],[0,0,0,0,1,1,1,1]]	[10,15]
입출력 예 설명
입출력 예 #1

다음 그림은 주어진 arr을 압축하는 과정을 나타낸 것입니다.
ex1.png
최종 압축 결과에 0이 4개, 1이 9개 있으므로, [4,9]를 return 해야 합니다.
입출력 예 #2

다음 그림은 주어진 arr을 압축하는 과정을 나타낸 것입니다.
ex2.png
최종 압축 결과에 0이 10개, 1이 15개 있으므로, [10,15]를 return 해야 합니다.
 */
