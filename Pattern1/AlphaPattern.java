package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class AlphaPattern {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        alpha(n);
    }

    private static void alpha(int n) {
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A' + i - 1));
            }
            System.out.println();
        }
    }
}
