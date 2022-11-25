package structure;

/**
 * LowerBound, UpperBound
 */
public class LowerUpperBound {

    // 지정 값 이상 시점
    public static int lower(int[] arr, int n){
        int s = 0;
        int e = arr.length;
        while(s < e){
            int m = (s+e)/2;
            if (arr[m] >= n) e = m;
            else s = m + 1;
        }
        return e;
    }
    /*         _
    {1,2,3,4,5,6,6}, n=6
    s=0 e=6 m=3 false
    s=4 e=6 m=5 true
    s=4 e=5 m=4 false
    s=5 e=5 m=5
    return 5
    */


    // 지정 값 초과 시점
    public static int upper(int[] arr, int n){
        int s = 0;
        int e = arr.length;
        while (s < e){
            int m = (s+e)/2;
            if (arr[m] > n) e = m;
            else s = m + 1;
        }
        return e;
    }
    /* _
    {1,2,2,3,4,5,6}, n=1
    s=0 e=6 m=3 true
    s=0 e=3 m=1 true
    s=0 e=1 m=0 false
    s=1 e=1 m=1
    return 1
     */
}
