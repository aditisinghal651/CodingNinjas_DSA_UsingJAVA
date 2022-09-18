package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class SquarePattern {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        square(n);
    }

    private static void square(int n) {
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
