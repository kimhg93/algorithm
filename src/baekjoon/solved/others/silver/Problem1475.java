package baekjoon.solved.others.silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1475 {
    private static final BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception{
        String str = r.readLine();
        int[] arr = new int[10];

        int cnt = 1;
        for(int i=0; i<str.length(); i++){
            int n = Integer.parseInt(str.substring(i, i+1));
            if(n == 6 && arr[9] > arr[6]) arr[9]--;
            else if(n == 9 && arr[6] > arr[9]) arr[6]--;
            else arr[n]--;
        }
        Arrays.sort(arr);
        System.out.println(Math.abs(arr[0]));

    }
}

/*

방 번호
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	50380	23023	16687	44.345%
문제
다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.

다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다.
다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최솟값을 출력하시오. (6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

입력
첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 필요한 세트의 개수를 출력한다.

예제 입력 1
9999
예제 출력 1
2
예제 입력 2
122
예제 출력 2
2
예제 입력 3
12635
예제 출력 3
1
예제 입력 4
888888
예제 출력 4
6

 */