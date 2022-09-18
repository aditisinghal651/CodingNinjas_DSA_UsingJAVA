package IntroductionToJava;

import java.util.Scanner;

public class NFibonacciNumber {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        fibonacciNum(n);
    }

    private static void fibonacciNum(int n) {
        int f1 = 1;
        int f2 = 1;
        int fn = 1;

        for(int i = 3; i <= n; i++){
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        System.out.println(fn);
    }
}
