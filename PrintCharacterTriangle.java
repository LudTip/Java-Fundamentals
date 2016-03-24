import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

import java.util.Scanner;

/**
 * Created by LudTip on 20.3.2016 г..
 */
public class PrintCharacterTriangle {
    public static void main(String[] args) {

       Scanner reader = new Scanner(System.in);
        Integer num  = reader.nextInt();
        int counter = 1;
        char alfa = 'a';

        for (int i = 0; i < num; i++){
            for (int j = 0; j < counter; j++){
                System.out.printf("%c ", alfa);
                alfa++;
            }
            System.out.println();
            alfa = 'a';
            counter += 1;
        }
        counter -= 1;

        for (int i = 0; i < num; i++){
            counter -= 1;
            for (int j = 0; j < counter; j++){
                System.out.printf("%c ", alfa);
                alfa++;
            }
            System.out.println();
            alfa = 'a';

        }


    }
}
