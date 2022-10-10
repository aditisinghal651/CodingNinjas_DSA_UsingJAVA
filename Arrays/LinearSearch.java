package IntroductionToJava.Arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args){
        System.out.println(linear(arrayInput(), element()));
    }

    private static int linear(int[] arr, int elem) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == elem){
                return i;
            }
        }
        return -1;
    }

    public static int[] arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Test Cases:");
        int t = sc.nextInt();
        int[] arr = new int[0];

        for (int i = 1; i <= t; i++) {
            System.out.println("Enter size of array: ");
            int n = sc.nextInt();
            System.out.println("Enter array elements: ");
            arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int element(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
