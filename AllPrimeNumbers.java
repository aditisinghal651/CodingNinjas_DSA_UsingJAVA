package IntroductionToJava;

import java.util.Scanner;

public class AllPrimeNumbers {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printPrimeNum(n);
    }

    private static void printPrimeNum(int n) {
        for(int i = 2; i < n; i++){
            int flag = 0;
            for(int d = 2; d < i; d++){
                if(i % d == 0){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(i);
            }
        }
    }
}
