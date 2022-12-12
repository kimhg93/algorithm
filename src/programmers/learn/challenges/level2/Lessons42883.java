package programmers.learn.challenges.level2;

/**
 * 탐욕법(Greedy)
 * 큰 수 만들기
 */
public class Lessons42883 {

    public static void main(String[] args) throws Exception {
        int n = 4;
        String str = "4177252841";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<1000; i++){
            sb.append(str);
        }
        long s = System.currentTimeMillis();
        solution(str,4);
        long e = System.currentTimeMillis();
        System.err.println((e-s)+ "ms");
    }

    public static String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[number.length()];
        boolean[] arr2 = new boolean[number.length()];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(number.substring(i,i+1));
        }

        int idx = 0;
        int len = number.length()-k;
        for(int i=0; i<len; i++){
            int max = -1;
            for(int j=idx; j<=k; j++){
                if((!arr2[j]) && max < arr[j]){
                    max = arr[j];
                    idx = j;
                }
            }
            k++;
            arr2[idx] = true;
            sb.append(max);
            if(len-sb.length() == number.length()-idx-1) {
                sb.append(number.substring(idx+1));
                break;
            }
        }
        return sb.toString();
    }

}

/*

큰 수 만들기
문제 설명
어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.

예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 이 중 가장 큰 숫자는 94 입니다.

문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다.
number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 문자열 형태로 return 하도록 solution 함수를 완성하세요.

제한 조건
number는 2자리 이상, 1,000,000자리 이하인 숫자입니다.
k는 1 이상 number의 자릿수 미만인 자연수입니다.
입출력 예
number	k	return
"1924"	2	"94"
"1231234"	3	"3234"
"4177252841"	4	"775841"

*/