package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        reverseNum(n);
    }

    private static void reverseNum(int n) {
        for(int i = 1; i <= n; i++){
            int startingNum = i;
            for(int j = 1; j <= i; j++){
                System.out.print(startingNum--);
            }
            System.out.println();
        }
    }
}
