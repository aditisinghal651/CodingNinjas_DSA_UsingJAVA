package IntroductionToJava.Arrays;

import java.util.Scanner;

public class ArraySum {

    public static void main(String args[]) {
        arrayInput();
    }

    private static void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Test Cases:");
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter array elements: ");
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            arraySum(arr);
        }
    }

    private static void arraySum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
