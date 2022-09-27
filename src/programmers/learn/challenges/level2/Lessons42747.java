package programmers.learn.challenges.level2;

import java.util.ArrayList;
import java.util.List;

/**
 * 정렬
 * H-Index
 */
public class Lessons42747 {

    public static void main(String[] args) throws Exception {
        int[] arr = {3, 0, 6, 1, 5};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution(arr) );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(int[] citations) {
        int answer = 0;
        for(int i=0; i<=citations.length; i++){
            int a = 0; // 초과
            int b = 0; // 미만
            int c = 0; // 같음
            for(int j=0; j<citations.length; j++){
                if(citations[j] != i){
                    if(citations[j] > i) a++;
                    if(citations[j] < i) b++;
                } else c++;
            }
            // 같은 값이 있을경우 한군데만 들어가야 함. 위 아래 붙여서 가능한 케이스 찾음
            if(i == a && a == citations.length - (b+c)) answer = i; // 같은걸 초과에 포함(이상)
            if(i == a+c && a+c == citations.length-b) answer = i; // 같은걸 미만에 포함(이하)
        }
        return answer;
    }
}

/*
H-Index
문제 설명
H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.

어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.

어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.

제한사항
과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
입출력 예
citations	return
[3, 0, 6, 1, 5]	3
입출력 예 설명
이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.

문제가 잘 안풀린다면😢
힌트가 필요한가요? [코딩테스트 연습 힌트 모음집]으로 오세요! → 클릭

※ 공지 - 2019년 2월 28일 테스트 케이스가 추가되었습니다.
 */