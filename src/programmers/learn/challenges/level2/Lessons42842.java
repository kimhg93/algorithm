package programmers.learn.challenges.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 완전탐색
 * 카펫
 */
public class Lessons42842 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println(Arrays.toString(solution(4900,20)));
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int a = brown+yellow;

        List<Integer> list = measure(yellow);

        if(brown == 8) return new int[] {3,3};

        for(int i=0; i<list.size()/2+1; i++){
            int l = list.get(i);
            int s = list.get(list.size()-1-i);
            if(l > s && (l+2+s)*2 == brown){ // 직사각
                answer[0] = l+2;
                answer[1] = s+2;
                break;
            } else if((l+l+2)*2 == brown || (s+s+2)*2 == brown) { // 정사각
                answer[0] = l+2;
                answer[1] = s+2;
                break;
            }
        }
        return answer;
    }

    public static List<Integer> measure(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=n; i>=1; i--){
            if(n%i==0) list.add(i);
        }
        return list;
    }
    
}

/*
Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.

carpet.png

Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.

Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
입출력 예
brown	yellow	return
10	2	[4, 3]
8	1	[3, 3]
24	24	[8, 6]

 */


/*
48
20 1 2 4 5 10 20
28

111111
122221
122221
122221
122221
111111


111111111111
122222222221
122222222221
111111111111
 */