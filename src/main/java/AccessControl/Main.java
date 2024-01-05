package AccessControl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int haslo;
        int licznikNiepoprawnychProbPodaniaHasla = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj hasło");
        haslo = scanner.nextInt();

        if (haslo == 123) {
            System.out.println("Witamy w systemie.");
            licznikNiepoprawnychProbPodaniaHasla = 0;
        } else {
            while (licznikNiepoprawnychProbPodaniaHasla < 2) {
                licznikNiepoprawnychProbPodaniaHasla++;
                System.out.println("Niepoprawne hasło. Spróbuj jeszcze raz.");
                haslo = scanner.nextInt();
                if (haslo == 123) {
                    System.out.println("Witamy w systemie.");
                    licznikNiepoprawnychProbPodaniaHasla = 0;
                    break;
                }
                if (licznikNiepoprawnychProbPodaniaHasla >= 2) {
                    System.out.println("Dostęp został zablokowany.");
                }
            }
        }
    }
}
