package IntroductionToJava;

import java.util.Scanner;

public class CharacterCase {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char character = sc.next().charAt(0);

        System.out.println(charCase(character));
    }

    private static int charCase(char c) {
        if(c == 'A' || c == 'B' || c == 'C' || c == 'D' || c == 'E' || c == 'F' || c == 'G' || c == 'H' || c == 'I'
                || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'O' || c == 'P' || c == 'Q' ||
                c == 'R' || c == 'S' || c == 'T' || c == 'U' || c == 'V' || c == 'W' || c == 'X' || c == 'Y' || c == 'Z'){
            return 1;
        }else if(c == 'a' || c == 'b' || c == 'c' || c == 'd' || c == 'e' || c == 'f' || c == 'g' || c == 'h' || c == 'i'
                || c == 'j' || c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'o' || c == 'p' || c == 'q' ||
                c == 'r' || c == 's' || c == 't' || c == 'u' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z'){
            return 0;
        }else{
            return -1;
        }
    }
}
