package baekjoon.solved.others.gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Problem1662 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        String str = r.readLine();
        List<String> list = new ArrayList<>();

        for(int i=0; i<str.length(); i++){
            list.add(str.substring(i, i+1));
        }

        while(true){
            int start = list.lastIndexOf("(");
            if(start == -1) break;

            int l = 0;
            int end = start+1;

            while(true){
                String s = list.get(end);
                if(s.equals(")")) break;
                if(s.charAt(0) == 'n') l+=Integer.parseInt(s.substring(1));
                else l++;
                end++;
            }
            int mul = start-1;
            l *= Integer.parseInt(list.get(mul));

            for(int i=mul; i<=end; i++){
                list.remove(mul);
            }
            list.add(mul, "n"+ l);
        }

        int cnt = 0;

        for(int i=0; i<list.size(); i++){
            if(list.get(i).charAt(0) == 'n'){
                cnt+=Integer.parseInt(list.get(i).substring(1));
            } else cnt++;
        }

        System.out.println(cnt);
    }
}

/*

F압축
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	6490	2096	1667	35.036%
문제
압축되지 않은 문자열 S가 주어졌을 때, 이 문자열중 어떤 부분 문자열은 K(Q)와 같이 압축 할 수 있다. K는 한자리 정수이고, Q는 0자리 이상의 문자열이다.
이 Q라는 문자열이 K번 반복된다는 뜻이다. 압축된 문자열이 주어졌을 때, 이 문자열을 다시 압축을 푸는 프로그램을 작성하시오.

입력
첫째 줄에 압축된 문자열 S가 들어온다. S의 길이는 최대 50이다. 문자열은 (, ), 0-9사이의 숫자로만 들어온다.

출력
첫째 줄에 압축되지 않은 문자열의 길이를 출력한다. 이 값은 2,147,473,647 보다 작거나 같다.

예제 입력 1
33(562(71(9)))
예제 출력 1
19
예제 입력 2
123
예제 출력 2
3
예제 입력 3
10342(76)
예제 출력 3
8
예제 입력 4
0(0)
예제 출력 4
0
예제 입력 5
1(1(1(1(1(1(1(0(1234567890))))))))
예제 출력 5
0
예제 입력 6
1()66(5)
예제 출력 6
7

 */
