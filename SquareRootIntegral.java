package IntroductionToJava;

import java.util.Scanner;

public class SquareRootIntegral {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        squareRoot(n);
    }

    private static void squareRoot(int n) {
        for(int i = 1; i <= n; i++){
            int num = i * i;

            if(num == n){
                System.out.println(i);
                break;
            }else if(num > n){
                System.out.println(i-1);
                break;
            }
        }
    }
}
