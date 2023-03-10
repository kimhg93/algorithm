package structure;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(j >= arr.length-i-1) break;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    cnt++;
                }
            }
        }

        System.err.println(Arrays.toString(arr));
    }

}
