package IntroductionToJava.Arrays;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int x = sc.nextInt();

            System.out.println(pairSum(arr, x));
        }
    }

    private static int pairSum(int[] arr, int x) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if(x == arr[i] + arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
