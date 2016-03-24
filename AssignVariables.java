import java.util.Scanner;

public class AssignVariables {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);

         int integerValue = 2000000000;
         char characterValue = 'c';
         boolean boolValue = false;
         double doubleValue = 0.1234567891011;
         String stringValue = "Palo Alto, CA";
         short shortValue = 32767;
         long longValue = 919827112351L;
         float floatValue = 0.5f;
         byte byteValue = 127;

         System.out.println(integerValue + ", " + doubleValue);
         System.out.println(characterValue + ", " + boolValue + ", " + stringValue);
         System.out.println(shortValue + ", " + longValue);
         System.out.println(byteValue + ", " + floatValue);







     }
}
