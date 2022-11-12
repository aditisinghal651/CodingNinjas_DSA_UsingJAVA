package IntroductionToJava.Pattern2;

import java.util.Scanner;

public class TriangleNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        triangularNum(n);
    }

    private static void triangularNum(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

            int startingNum = i;
            for(int k = 1; k <= i; k++){
                System.out.print(startingNum++);
            }

            startingNum = ((2*i) - 2);
            for(int l = 1; l <= i-1; l++){
                System.out.print(startingNum--);
            }
            System.out.println();
        }
    }
}
