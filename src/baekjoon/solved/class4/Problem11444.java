package baekjoon.solved.class4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem11444 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        long n = Long.parseLong(r.readLine());

        List<Long> list = new ArrayList<>();
        list.add(n);
        long m = n;

        while(m > 2){
            if(m%2 == 0) m /= 2;
            else m = (m+1)/2;
            list.add(m); // 리스트에 계산에 필요한 수 add
        }

        Map<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);
        map.put(1L, 1L);

        for(int i=list.size()-1; i>=0; i--){
            long num = list.get(i);

            if(map.get(num) == null){
                long k, v;
                if(num%2 == 0) k = num/2;
                else k = (num+1)/2;

                if(map.get(k-1) == null) { // 기존에 계산된게 없으면 list 추가
                    list.add(i+2, k-1);
                    i+=3; // 추가한거 부터 다시
                } else { // k, k-1 다 존재하면 계산
                    long kv = map.get(k);
                    long bkv = map.get(k-1);

                    if(num%2 == 0) v = (2*bkv + kv) * kv;
                    else v = ((kv*kv) + (bkv*bkv));

                    map.put(num, v%1000000007);
                }
            }
        }

        System.out.println(map.get(n));
    }
}

/*

피보나치 수 6
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	13626	6373	5292	49.793%
문제
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n ≥ 2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 n번째 피보나치 수를 1,000,000,007으로 나눈 나머지를 출력한다.

예제 입력 1
1000
예제 출력 1
517691607

 */
