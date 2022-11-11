package programmers.learn.challenges.level2;

import java.util.*;

/**
 * 완전탐색
 * 소수 찾기
 */
public class Lessons42839 {

    public static void main(String[] args) throws Exception {
        int[] arr = {0};
        String[] arr2 = {""};
        int n = 0;
        String str = "";

        long s = System.currentTimeMillis();
        System.err.println( solution("17") );
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static int solution(String numbers) {
        char[] num = numbers.toCharArray();
        Set<String> set = new HashSet<>();
        for(int i=0; i<num.length; i++){
            per(num, new char[i + 1], new boolean[num.length + 1], 0, set);
        }
        return set.size();
    }

    public static void per(char[] arr, char[] re, boolean[] visit, int d, Set<String> set) {
        if(d == re.length) {
            String s = Arrays.toString(re).replace("[", "")
                    .replace("]", "")
                    .replace(", ", "");
            if(s.charAt(0) != '0' && isPrime(Long.parseLong(s))) set.add(s);
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if(visit[i] != true) {
                visit[i] = true;
                re[d] = arr[i];
                per(arr, re, visit, d+1, set);
                visit[i] = false;
            }
        }
        return;
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
1, i=0
2, i=1
3, i=2
12, i=0,1
13, i=0,2
21, i=1,0
23, i=1.2
31, i=2,0
32, i=2,1
123, i=0,1,2
132, i=0,2,1
213, i=1.0.2
231, i=1,2,0
312, i=2,0,1
321, i=2,1,0




 */

/*
소수 찾기
문제 설명
한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.

각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

제한사항
numbers는 길이 1 이상 7 이하인 문자열입니다.
numbers는 0~9까지 숫자만으로 이루어져 있습니다.
"013"은 0, 1, 3 숫자가 적힌 종이 조각이 흩어져있다는 의미입니다.
입출력 예
numbers	return
"17"	3
"011"	2
입출력 예 설명
예제 #1
[1, 7]으로는 소수 [7, 17, 71]를 만들 수 있습니다.

예제 #2
[0, 1, 1]으로는 소수 [11, 101]를 만들 수 있습니다.


 */