package baekjoon.step._5_done;

public class Problem15596 {
    long sum(int[] a) {
        long ans = 0;
        for(int i : a){
            ans += i;
        }
        return ans;
    }
}