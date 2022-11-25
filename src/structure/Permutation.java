package structure;

import java.util.Arrays;
import java.util.List;

/**
 * 순열
 */
public class Permutation {

    public static void main(String[] args){
        int[] arr = {1,2,3};
        per1(arr, 0);

        boolean[] visit = new boolean[arr.length];
        per2(arr, new int[2], visit, 0);

    }

    /**
     *
     * @param arr 대상
     * @param d 깊이
     */
    static void per1(int[] arr, int d) {
        if(d == arr.length) {
            System.err.println(Arrays.toString(arr));
            return;
        }

        for (int i=d; i<arr.length; i++) {
            swap(arr, d, i);
            per1(arr, d+1);
            swap(arr, d, i);
        }
    }
    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    /**
     *
     * @param arr 대상 arr
     * @param re 결과 배열 (필요한 개수만큼 길이 지정)
     * @param visit 입력 여부
     * @param d 깊이
     */
    static void per2(int[] arr, int[] re, boolean[] visit, int d) {

        if(d == re.length) {
            System.out.println(Arrays.toString(re));
            return;
        }

        for(int i = 0; i < arr.length; i++) {
            if(visit[i] != true) {
                visit[i] = true;
                re[d] = arr[i];
                per2(arr, re, visit, d + 1);
                visit[i] = false;
            }
        }
    }

}
