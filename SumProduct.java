package IntroductionToJava;

import java.util.Scanner;

public class SumProduct {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();

        System.out.println(sumProd(n, c));
    }

    private static int sumProd(int n, int c) {
        switch (c){
            case 1:
                int sum = 0;
                for(int i = 1; i <= n; i++){
                    sum += i;
                }
                return sum;

            case 2:
                int prod = 1;
                for(int i = 1; i < n; i++){
                    prod *= i;
                }
                return prod;

            default:
                return -1;
        }
    }
}
