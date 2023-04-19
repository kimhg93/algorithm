package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2023 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(r.readLine());

        int start = (int) Math.pow(10, n-1);
        int length = start;

        if(start > 100000) length = 100000;
        int[] prime = new int[length*10];
        prime[0] = -1;
        prime[1] = -1;

        for(int i=2; i<prime.length; i++){
            for(int j=i; j<prime.length; j+=i){
                if(j==i && prime[i] != -1) prime[i] = i;
                if(j!=i) prime[j] = -1;
            }
        }

        for(int i=start; i<start*10; i++){
            int m = start;
            while(true){
                if(m == 1 && isPrime(i)) {
                    sb.append(i).append("\n");
                    break;
                }
                if(i/m < prime.length && prime[i/m] != -1) m/=10;
                else if(isPrime(i/m)) m/=10;
                else break;
            }
        }

        System.out.println(sb);
    }

    public static boolean isPrime(long num){
        if(num < 2) return false;
        else if(num == 2) return true;
        else {
            for(int i=2; i<=Math.sqrt(num)+1; i++){
                if(num%i == 0) return false;
            }
            return true;
        }
    }

}
/*
신기한 소수

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	4 MB	14544	6804	4973	44.907%
문제
수빈이가 세상에서 가장 좋아하는 것은 소수이고, 취미는 소수를 가지고 노는 것이다. 요즘 수빈이가 가장 관심있어 하는 소수는 7331이다.

7331은 소수인데, 신기하게도 733도 소수이고, 73도 소수이고, 7도 소수이다. 즉, 왼쪽부터 1자리, 2자리, 3자리, 4자리 수 모두 소수이다! 수빈이는 이런 숫자를 신기한 소수라고 이름 붙였다.

수빈이는 N자리의 숫자 중에서 어떤 수들이 신기한 소수인지 궁금해졌다. N이 주어졌을 때, 수빈이를 위해 N자리 신기한 소수를 모두 찾아보자.

입력
첫째 줄에 N(1 ≤ N ≤ 8)이 주어진다.

출력
N자리 수 중에서 신기한 소수를 오름차순으로 정렬해서 한 줄에 하나씩 출력한다.

예제 입력 1
4
예제 출력 1
2333
2339
2393
2399
2939
3119
3137
3733
3739
3793
3797
5939
7193
7331
7333
7393
출처
문제의 오타를 찾은 사람: herdson, qkrwjddn, uk7880
알고리즘 분류
수학
정수론
백트래킹
소수 판정

 */
