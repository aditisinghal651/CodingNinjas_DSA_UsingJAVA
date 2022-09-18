package IntroductionToJava;

import java.util.Scanner;

public class TotalSalary {

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int basic = sc.nextInt();
            char grade = sc.next().charAt(0);
            totSal(basic, grade);
        }
    }

    private static void totSal(int basic, char grade) {
        double totalSal = 0;
        double hra = (20.0/100)*basic;
        double da = (50.0/100)*basic;
        double pf = (11.0/100)*basic;

        int allow;
        if(grade == 'A'){
            allow = 1700;
        }else if(grade == 'B'){
            allow = 1500;
        }else{
            allow = 1300;
        }

        totalSal = (basic + hra + da + allow) - pf;
        System.out.println(Math.round(totalSal));
    }
}
