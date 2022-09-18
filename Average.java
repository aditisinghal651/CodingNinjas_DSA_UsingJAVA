package IntroductionToJava;

import java.util.Scanner;

public class Average {

    public static void average(int m1, int m2, int m3, char name){
        int avg = (m1 + m2 + m3)/3;
        System.out.println(name + " "+ avg);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char name = sc.next().charAt(0);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        average(m1, m2, m3, name);
    }
}
