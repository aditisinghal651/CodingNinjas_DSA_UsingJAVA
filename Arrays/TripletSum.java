package IntroductionToJava.Arrays;

import java.util.Scanner;

public class TripletSum {
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

            System.out.println(tripletSum(arr, x));
        }
    }

    private static int tripletSum(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                for (int k = j+1; k < arr.length; k++){
                    if(x == arr[i] + arr[j] + arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
