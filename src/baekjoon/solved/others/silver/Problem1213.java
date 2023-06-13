package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1213 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception{
        String str = r.readLine();

        int[][] arr = new int[26][2];
        for(int i=65; i<=90; i++){
            int cnt = 0;
            for(int j=0; j<str.length(); j++){
                if((int)str.charAt(j) == i) cnt++;
            }
            if(cnt > 0) {
                arr[i-65][0] = i;
                arr[i-65][1] = cnt;
            }
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        char[] r = new char[str.length()];

        int front = -1;
        int rear = str.length();

        for(int i=0; i<arr.length; i++){
            while(arr[i][1] > 1){
                r[++front] = (char) arr[i][0];
                r[--rear] = (char) arr[i][0];
                arr[i][1] -= 2;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i][1] > 0){
                r[++front] = (char) arr[i][0];
            }
        }

        StringBuilder result = new StringBuilder();
        StringBuilder reverse = new StringBuilder();

        for(int i=0; i<r.length; i++){
            result.append(r[i]);
            reverse.append(r[r.length-1-i]);
        }

        if(result.toString().equals(reverse.toString())){
            System.out.println(result);
        } else {
            System.out.println("I'm Sorry Hansoo");
        }
    }
}
/*
23
46
*/

/*
팰린드롬 만들기

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	19792	8227	6495	40.880%
문제
임한수와 임문빈은 서로 사랑하는 사이이다.

임한수는 세상에서 팰린드롬인 문자열을 너무 좋아하기 때문에, 둘의 백일을 기념해서 임문빈은 팰린드롬을 선물해주려고 한다.
임문빈은 임한수의 영어 이름으로 팰린드롬을 만들려고 하는데, 임한수의 영어 이름의 알파벳 순서를 적절히 바꿔서 팰린드롬을 만들려고 한다.
임문빈을 도와 임한수의 영어 이름을 팰린드롬으로 바꾸는 프로그램을 작성하시오.

입력
첫째 줄에 임한수의 영어 이름이 있다. 알파벳 대문자로만 된 최대 50글자이다.

출력
첫째 줄에 문제의 정답을 출력한다. 만약 불가능할 때는 "I'm Sorry Hansoo"를 출력한다. 정답이 여러 개일 경우에는 사전순으로 앞서는 것을 출력한다.

예제 입력 1
AABB
예제 출력 1
ABBA
예제 입력 2
AAABB
예제 출력 2
ABABA
예제 입력 3
ABACABA
예제 출력 3
AABCBAA
예제 입력 4
ABCD
예제 출력 4
I'm Sorry Hansoo
출처
문제를 번역한 사람: baekjoon
알고리즘 분류
구현
문자열
그리디 알고리즘

 */