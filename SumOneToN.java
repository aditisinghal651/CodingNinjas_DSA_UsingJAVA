package IntroductionToJava;

import java.util.Scanner;

public class SumOneToN {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        evenSum(N);
    }

    private static void evenSum(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i += 2){
            sum += i;
        }
        System.out.println(sum);
    }
}
