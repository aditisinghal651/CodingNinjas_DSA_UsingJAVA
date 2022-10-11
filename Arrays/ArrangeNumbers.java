package IntroductionToJava.Arrays;

import java.util.Scanner;

public class ArrangeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            printArray(arrangeNum(arr, n));
        }
    }

    private static int[] arrangeNum(int[] arr, int n) {
        //Method - 1
        int val = 1;
        int start = 0;
        int end = n-1;

        while (start <= end){
            if(start == end){
                arr[start] = val;
                return arr;
            }
            arr[start] = val;
            val++;
            arr[end] = val;
            val++;
            start++;
            end--;
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
