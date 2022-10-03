package IntroductionToJava;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        checkSequence(arr);
    }

    private static boolean checkSequence(int[] arr) {

    }
}
