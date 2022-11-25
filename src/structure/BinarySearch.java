package structure;

/**
 * 이분탐색
 */
public class BinarySearch {

    // 정렬이 되어있어야 함
    public static int binarySearch(int[] arr, int n){
        int s = 0; // 시작위치
        int e = arr.length-1; // 종료위치

        while(e >= s) { // 종료랑 시작 만날때 까지
            int m = (s+e) / 2;  // 중간
            if(arr[m] == n) return m; // 찾음
            else if(arr[m] > n) e = m-1; // 찾는게 작으면 종료를 당겨옴
            else s = m+1; // 찾는게 크면 시작을 당겨옴
        }
        return 0;
    }
    /*
    {1,2,3,4,5,6,7} n=6
    s=0 e=6 m=3
    s=4 e=6 m=5
    return true
    */

}
