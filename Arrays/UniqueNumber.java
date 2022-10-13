package IntroductionToJava.Arrays;

import static IntroductionToJava.Arrays.LinearSearch.arrayInput;

public class UniqueNumber {

    public static void main(String[] args){
        System.out.println(findUnique(arrayInput()));
    }

    private static int findUnique(int[] arr) {
        int num = 0;

        for(int i = 0; i < arr.length; i++){

            boolean flag = false;

            for (int j = 0; j < arr.length; j++){
                if(i == j){
                    continue;
                }else if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                num = arr[i];
            }
        }
        return num;
    }
}
