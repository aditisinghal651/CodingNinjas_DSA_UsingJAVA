package IntroductionToJava;

import java.util.Scanner;

public class NumberSequence {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(checkSequence(arr));
    }

    private static boolean checkSequence(int[] arr) {
        boolean isDec = true;

        for (int i = 1; i < arr.length; i++) {
            int prev = arr[i - 1];
            int curr = arr[i];

            if (prev == curr) {
                return false;
            }
            if (isDec && curr > prev) {
                isDec = false;
            } else if (!isDec && curr < prev) {
                return false;
            }
        }
        return true;
    }
}