package IntroductionToJava.Arrays;

import java.util.Scanner;

public class ArrayIntersection {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int n1 = sc.nextInt();
            int[] arr1 = new int[n1];
            for (int j = 0; j < n1; j++){
                arr1[j] = sc.nextInt();
            }
            int n2 = sc.nextInt();
            int[] arr2 = new int[n2];
            for (int j = 0; j < n2; j++){
                arr2[j] = sc.nextInt();
            }
            intersectionArr(arr1, arr2);
        }
    }

    private static void intersectionArr(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
}
