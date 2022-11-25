package structure;

/**
 * 퀵 정렬
 */
public class QuickSort {

    private static void sort(int[] arr, int l, int h) { // 재귀 호출로 파티션을 무한 반목
        if (l >= h) return;
        int p = partition(arr, l, h);
        sort(arr, l, p - 1);
        sort(arr, p, h);
    }

    /**
     *
     * @param arr 대상
     * @param l low(left)
     * @param h hight(right)
     * @return
     */
    private static int partition(int[] arr, int l, int h) {
        int p = arr[(l+h) / 2]; // 중간피벗
        while (l<=h) { // l과 h가 교차 되면 종료 (swap 할게 없으면 종료)
            while (arr[l] < p) l++; // l이 p보다 크거나 같은걸 찾을때 까지 증가
            while (arr[h] > p) h--; // h가 p보다 작거나 같은걸 찾을때 까지 감소
            if (l <= h) { // l이 h보다 작으면 swqp
                int tmp = arr[l];
                arr[l] = arr[h];
                arr[h] = tmp;
                l++;
                h--;
            }
        }
        return l;
    }

}
