package IntroductionToJava.Arrays2;

import java.util.Scanner;

public class TernarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 13, 14, 15};
        System.out.println(ternarySearch(arr, x));
    }

    private static int ternarySearch(int[] arr, int x) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid1 = start + (end - start)/3;
            int mid2 = end - (end - start)/3;

            if(x == arr[mid1]){
                return mid1;
            }else if(x == arr[mid2]){
                return mid2;
            }else if(x < arr[mid1]){
                end = mid1-1;
            }else if(x > arr[mid2]){
                start = mid2 + 1;
            }else{
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }
}
