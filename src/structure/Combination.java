package structure;

public class Combination {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int r = 3;
        combination(arr, r);
    }


    public static void combination(int[] arr, int r) {
        int[] index = new int[r];

        for (int i=0; i<r; i++) {
            index[i] = i;
        }

        while (true) {
            for (int i=0; i<r; i++) {
                System.out.print(arr[index[i]] + " ");
            }
            System.out.println();

            int i = r-1; // 2

            while (i >= 0) {
                if (index[i] == arr.length-r+i) i--;
                else break;
            }

            if (i < 0) break;

            index[i]++;
            for (int j= i+1; j<r; j++) {
                index[j] = index[j - 1] + 1;
            }
        }
    }
}