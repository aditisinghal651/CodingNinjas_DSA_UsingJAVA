package IntroductionToJava.Pattern2;

import java.util.Scanner;

public class MirrorImageNumber {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        mirrorImage(n);
    }

    private static void mirrorImage(int n) {
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= n - i){
                System.out.print(" ");
                j++;
            }
            j = 1;
            int startingNum = 1;
            while(j <= i){
                System.out.print(startingNum++);
                j++;
            }
            System.out.println();
        }
    }
}
