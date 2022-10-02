package IntroductionToJava;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        binaryNum(n);
    }

    private static void binaryNum(int n) {
        ArrayList arr = new ArrayList();

        while(n > 0){
            int rem = n % 2;
            n = n / 2;
            arr.add(rem);
        }
        for (int i = arr.size()-1; i >= 0; i--){
            System.out.print(arr.get(i));
        }
    }
}
