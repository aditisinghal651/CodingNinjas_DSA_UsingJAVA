package IntroductionToJava;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        multiplyTable(n, e);
    }

    private static void multiplyTable(int n, int e) {
        for(int i = 1; i <= e; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
