package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class InterestingAlpha {

    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();

        interestingAlphabets(n);
    }

    private static void interestingAlphabets(int n) {
        for(int i = n; i >= 1; i--){
            int startingChar = 'A' + i - 1;
            for(int j = i; j <= n; j++){
                System.out.print((char)startingChar++);
            }
            System.out.println();
        }
    }
}
