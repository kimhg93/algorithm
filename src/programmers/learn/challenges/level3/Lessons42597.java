package programmers.learn.challenges.level3;

import java.util.*;

/**
 * 연습문제
 * 최고의 집합
 */
public class Lessons42597 {

    public static void main(String[] args) throws Exception {
        long s = System.currentTimeMillis();


        System.err.println(
                Arrays.toString(
                        solution(new String[] {"classic", "pop", "classic", "classic", "pop"}, new int[] {500, 600, 150, 800, 2500})
                )
        );

        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> cnt = new HashMap<>();
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<genres.length; i++){
            cnt.put(genres[i], 0);
            if(map.containsKey(genres[i])){
                map.put(genres[i], map.get(genres[i])+plays[i]);
            } else map.put(genres[i], plays[i]);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> {
            if(o1[2] == o2[2]) return o2[1] - o1[1];
            else return o2[2] - o1[2];
        });

        map.forEach((k, v) -> {
            // sum, play, idx
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(k)){
                    pq.offer(new int[] {i, plays[i], v});
                }
            }
        });

        List<Integer> list = new ArrayList<>();

        while(!pq.isEmpty()){
            int[] arr = pq.poll();
            if(cnt.get(genres[arr[0]]) < 2){
                list.add(arr[0]);
                cnt.put(genres[arr[0]], cnt.get(genres[arr[0]])+1);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

}

/*
코딩테스트 연습
해시
베스트앨범
도움말
컴파일 옵션
베스트앨범
문제 설명
스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.

제한사항
genres[i]는 고유번호가 i인 노래의 장르입니다.
plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
장르 종류는 100개 미만입니다.
장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
모든 장르는 재생된 횟수가 다릅니다.
입출력 예
genres	plays	return
["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
입출력 예 설명
classic 장르는 1,450회 재생되었으며, classic 노래는 다음과 같습니다.

고유 번호 3: 800회 재생
고유 번호 0: 500회 재생
고유 번호 2: 150회 재생
pop 장르는 3,100회 재생되었으며, pop 노래는 다음과 같습니다.

고유 번호 4: 2,500회 재생
고유 번호 1: 600회 재생
따라서 pop 장르의 [4, 1]번 노래를 먼저, classic 장르의 [3, 0]번 노래를 그다음에 수록합니다.

장르 별로 가장 많이 재생된 노래를 최대 두 개까지 모아 베스트 앨범을 출시하므로 2번 노래는 수록되지 않습니다.
※ 공지 - 2019년 2월 28일 테스트케이스가 추가되었습니다.
 */