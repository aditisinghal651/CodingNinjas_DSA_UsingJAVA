package IntroductionToJava;

import java.util.Scanner;

public class TermsOfAP {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();

        TermsAP(x);
    }

    private static void TermsAP(int x) {
        int count = 0;
        for(int i = 1; count < x; i++){
            int num = 3 * i + 2;
            if(num % 4 != 0){
                System.out.print(num + " ");
                count++;
            }
        }
    }
}
