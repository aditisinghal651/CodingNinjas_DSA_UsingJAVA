package IntroductionToJava.Pattern2;

import java.util.Scanner;

public class InvertedNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        invertedNum(n);
    }

    private static void invertedNum(int n) {
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
