package IntroductionToJava.Test1;

import java.util.Scanner;

public class ZerosAndStarsPattern {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        pattern(n);
    }

    private static void pattern(int n) {
        int i, j;
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
            }
            System.out.print("*");
            j--;

            while (j >=1){
                if(i == j){
                    System.out.print("*");
                }else{
                    System.out.print("0");
                }
                j--;
            }
            System.out.println();
        }
    }
}
