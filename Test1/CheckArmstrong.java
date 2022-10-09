package IntroductionToJava.Test1;

import java.util.Scanner;

public class CheckArmstrong {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(armstrong(num));
    }

    private static boolean armstrong(int num) {
        int n = 0;
        int temp = num;
        while(temp > 0){
            //int rem = num%10;
            n++;
            temp = temp/10;
        }
        int number = num;
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += Math.pow(rem, n);
            num = num/10;
        }

        if(sum == number){
            return true;
        }else {
            return false;
        }
    }
}
