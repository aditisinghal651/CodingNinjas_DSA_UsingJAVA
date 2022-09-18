package IntroductionToJava;

import java.util.Scanner;

public class SumEvenOdd {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sumEvenOdd(n);
    }

    private static void sumEvenOdd(int n) {
        int sumEven = 0;
        int sumOdd = 0;

        while(n > 0){
            int num = n%10;
            n = n/10;
            if(num % 2 == 0){
                sumEven += num;
            }else{
                sumOdd += num;
            }
        }
        System.out.println(sumEven + " " + sumOdd);
    }
}
