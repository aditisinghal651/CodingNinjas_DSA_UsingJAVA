package IntroductionToJava;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reverseNum(n);
    }

    private static void reverseNum(int n) {
        int rem = 0;
        while(n > 0){
            rem = n % 10;
            n = n / 10;
            if(rem == 0){
                continue;
            }else{
                System.out.print(rem);
            }
        }
    }
}
