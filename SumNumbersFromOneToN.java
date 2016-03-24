import java.util.Scanner;

/**
 * Created by LudTip on 20.3.2016 г..
 */
public class SumNumbersFromOneToN {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Integer n  = reader.nextInt();
        int solution = 0;
        for (int i = 0; i <= n; i++) {
            solution += i;
        }
        System.out.println(solution);

    }
}
