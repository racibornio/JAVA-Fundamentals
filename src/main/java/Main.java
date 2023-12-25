import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Kovariation kovariation = new Kovariation(3L, 4L, 5L);

        System.out.println(kovariation.getNumbers());

        int binarka = 0b01101001;
        System.out.println(binarka);

        int decymalka = 0123;
        System.out.println(decymalka);

        int hexadecymalka = 0xaa;
        System.out.println(hexadecymalka);

        NumbersProcessing np = new NumbersProcessing();
        np.octToDecimal(String.valueOf(11));

        /*Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int theBiggestNumberDivisibleByFour = -1;
        int i = 0;

        System.out.println("Wpisuj");
        while (i < n) {
            int element = scanner.nextInt();
            if (element % 4 == 0 && element > theBiggestNumberDivisibleByFour) {
                theBiggestNumberDivisibleByFour = element;
            }
            i++;
        }

        System.out.println(theBiggestNumberDivisibleByFour);
        scanner.close();
         */

    }
}
