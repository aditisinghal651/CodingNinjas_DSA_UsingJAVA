package IntroductionToJava.Arrays2;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the Array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number of test cases: ");
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            System.out.println("Enter the element to be found: ");
            int x = sc.nextInt();
            System.out.println(binarySearch(arr, x));
        }
    }

    private static int binarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end)/2;

        while (start <= end){
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                end = mid-1;
            }else{
                start = mid+1;
            }
            mid = (start + end)/2;
        }
        return -1;
    }
}
