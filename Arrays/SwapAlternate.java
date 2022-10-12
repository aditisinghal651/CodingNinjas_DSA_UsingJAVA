package IntroductionToJava.Arrays;

import static IntroductionToJava.Arrays.ArrangeNumbers.printArray;
import static IntroductionToJava.Arrays.ArraySum.arrayInput;

public class SwapAlternate {

    public static void main(String[] args){
        swapNumbers(arrayInput());
    }

    private static void swapNumbers(int[] arr) {
        if(arr.length%2 == 0){
            for (int i = 0; i < arr.length; i=i+2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            printArray(arr);
        }else{
            for (int i = 0; i < arr.length-1; i=i+2){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            printArray(arr);
        }
    }
}
