import java.util.Scanner;
import java.util.Locale;

/**
 * Created by LudTip on 20.3.2016 г..
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) {
        //PrintCharacters.printCharacters();

        // Problem 5* output:
        // Enter number from 1 - 26
        Scanner console = new Scanner(System.in).useLocale(Locale.ENGLISH);
        int input = console.nextInt();
        //PrintCharacterTriangle.printCharacterTriangle(input);

        // Problem 6 output:
        int inputProblemSix = console.nextInt();
        //SumNumbersFromOneToN.sumNumbersFromOneToN(inputProblemSix);

        // Problem 7* output:
        // Enter numbers
        String inputProblemSeven = console.next();
        GhettoNumeralSystem.ghettoNumeralSystem(inputProblemSeven);


    }

    private static void ghettoNumeralSystem(String input) {
        char[] chars = new char[input.length()];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            chars[i] = input.charAt(i);
        }

        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '0': sb.append("Gee"); break;
                case '1': sb.append("Bro"); break;
                case '2': sb.append("Zuz"); break;
                case '3': sb.append("Ma"); break;
                case '4': sb.append("Duh"); break;
                case '5': sb.append("Yo"); break;
                case '6': sb.append("Dis"); break;
                case '7': sb.append("Hood"); break;
                case '8': sb.append("Jam"); break;
                case '9': sb.append("Mack"); break;
                default: break;
            }
        }

        String output = sb.toString();
        System.out.println(output);
    }
}

