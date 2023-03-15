package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1541 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        String str = r.readLine();

        String[] numbers = str.split("[+|-]");
        String[] arr = new String[numbers.length*2-1];

        int idx = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '+' && str.charAt(i) != '-'){
                if(null == arr[idx]) arr[idx] = String.valueOf(str.charAt(i));
                else arr[idx] += str.charAt(i);
            } else {
                ++idx;
                arr[idx] = String.valueOf(str.charAt(i));
                idx++;
            }
        }

        int sum = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] == null) break;
            if(i > 2 && arr[i-2].equals("-") && arr[i].equals("+")) {
               arr[i] = "-";
            }
        }

        for(int i=0; i<arr.length; i++){
            if(i == 0) sum = Integer.parseInt(arr[i]);
            else {
                int n = Integer.parseInt(arr[i+1]);
                if(arr[i].equals("+")) sum += n;
                else if(arr[i].equals("-")) sum -= n;
            }
        }

        System.out.println(sum);
    }
}

/*

잃어버린 괄호

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	64653	34124	26904	52.189%
문제
세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.

그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.

괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.

입력
첫째 줄에 식이 주어진다. 식은 ‘0’~‘9’, ‘+’, 그리고 ‘-’만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다. 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다. 수는 0으로 시작할 수 있다. 입력으로 주어지는 식의 길이는 50보다 작거나 같다.

출력
첫째 줄에 정답을 출력한다.

예제 입력 1
55-50+40
예제 출력 1
-35
예제 입력 2
10+20+30+40
예제 출력 2
100
예제 입력 3
00009-00009
예제 출력 3
0
 */