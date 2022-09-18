package IntroductionToJava;

import java.util.Scanner;

public class PowerOfNumber {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        Power(x, n);
    }

    private static void Power(int x, int n) {
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= x;
        }
        System.out.println(ans);
    }
}
