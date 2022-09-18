package IntroductionToJava.Pattern1;

import java.util.Scanner;

public class CharacterPattern {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        character(n);
    }

    private static void character(int n) {
        for(int i = 1; i <= n; i++){
            char startingChar = (char)('A' + i - 1);
            for(int j = 1; j <= i; j++){
                System.out.print(startingChar++);
            }
            System.out.println();
        }
    }
}
