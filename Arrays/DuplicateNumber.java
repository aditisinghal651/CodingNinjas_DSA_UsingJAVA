package IntroductionToJava.Arrays;

import static IntroductionToJava.Arrays.LinearSearch.arrayInput;

public class DuplicateNumber {

    public static void main(String[] args){
        System.out.println(duplicate(arrayInput()));
    }

    private static int duplicate(int[] arr) {
//        int num = 0;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr.length; j++){
//                if(i == j){
//                    continue;
//                }else if(arr[i] == arr[j]){
//                    num = arr[i];
//                }
//            }
//        }
//        return num;

        int num = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    num = arr[i];
                }
            }
        }
        return num;
    }
}
