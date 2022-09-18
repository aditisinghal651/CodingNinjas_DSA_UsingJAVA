package IntroductionToJava;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();

        converter(S, E, W);
    }

    private static void converter(int s, int e, int w) {
        for(int fah = s; fah <= e; fah += w){
            int cel = ((fah - 32)*5)/9;
            System.out.println(fah + " " + cel);
        }
    }
}
