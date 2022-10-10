package IntroductionToJava.Arrays;

import java.util.Scanner;

public class ArrangeNumbers {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;

        for(int i = 1; i <= t; i++){
            n = sc.nextInt();
            int[] arr = new int[n];
            arrangeNum(arr, n);
        }
    }

    private static void arrangeNum(int[] arr, int n) {

    }
}
