package IntroductionToJava;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(decimalNum(n));
    }

    private static int decimalNum(int n) {
        int pv = 1;
        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans + (rem*pv);
            pv = pv * 2;
        }
        return ans;
    }
}
