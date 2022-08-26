package baekjoon.step._7_done;

import java.util.Scanner;

public class Problem10757 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String s1 = "";
        String s2 = "";

        s1 = sc.next();
        s2 = sc.next();

        int[] arr1 = new int[100001];
        int[] arr2 = new int[100001];
        int[] arr3 = new int[100001];

        for(int i=0; i<s1.length(); i++){
            arr1[i] = Integer.parseInt(s1.substring(s1.length()-i-1,s1.length()-i));
        }
        for(int i=0; i<s2.length(); i++){
            arr2[i] = Integer.parseInt(s2.substring(s2.length()-i-1,s2.length()-i));
        }

        int length = s2.length();
        if(s1.length() >= s2.length()) length = s1.length();

        for(int i=0; i<length; i++){
            int bf = arr3[i];
            int n = ((arr1[i] + arr2[i]) % 10) + arr3[i];

            if(n == 10) arr3[i] = 0;
            else arr3[i] = n;

            if(arr1[i]+arr2[i]+bf >= 10){
                arr3[i+1] = 1;
            }
        }

        for(int i=length; i>=0; i--){
            if(i == length){
                if(arr3[length]!=0) System.out.print(arr3[length]);
            } else {
                System.out.print(arr3[i]);
            }
        }
    }
}