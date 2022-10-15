package IntroductionToJava.Arrays;

import static IntroductionToJava.Arrays.ArrangeNumbers.printArray;
import static IntroductionToJava.Arrays.LinearSearch.arrayInput;

public class SortZeroOne {

    public static void main(String[] args){
        printArray(sorting(arrayInput()));
    }

    private static int[] sorting(int[] arr) {
        //Method - 1 : When one can do 2 scans of the array
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                count++;
            }
        }
        for(int i = 0; i < count; i++){
            arr[i] = 0;
        }
        for(int j = count; j < arr.length; j++){
            arr[j] = 1;
        }
        return arr;

        //Method - 2 : When only 1 scan of the arrays is allowed



    }
}
