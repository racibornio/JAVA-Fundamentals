package Lessons;

public class Main {
    public static void main(String[] args) {

        //1 - type 'sout'
        System.out.println("It works!");

        //2 - variables
        byte value1 = 3;
        short value2 = 2_000;
        int value3 = 4_000_000;
        long value4 = 490_000_000;

        //each long in Java is stored on int so as soon as the size exceeds int it must be followed by 'l' or 'L'
        long value5 = 490_000_000_000_000L;

        //3 - display values concatenated
        System.out.println("Byte variable value is " + value1);
        //byte (stored on 1 byte) range: -128 to 127
        //short (stored on 2 bytes) range: -32 768 to 32 767
        //int (stored on 4 bytes) range: -2 147 483 648 to 2 147 483 647
        //long (stored on 8 bytes) range: -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807

        //3a - variables casting

        byte zm = (byte) 333;
        System.out.println("Wartość po rzutowaniu to " + zm);

        //4 - 'if' conditional statement
        int valueToCheck = 128;

        if (valueToCheck <= 127) {
            System.out.println("The number type is byte.");
        }

        if (valueToCheck <= 127) {
            System.out.println("The number type is byte.");
        } else {
            System.out.println("The number type is integer.");
        }

        //4 exercise

        String napis = "Cokolwiek: A - Z, a - z, 0 - 9, !@#$%^&*()_+-=~`[]{}|;':<>?,./ i w dowolnej długości";

        char znakD = 'd';
        char znakProcenta = '%';
        char znak = 1;

        String kolor = "";

        if (kolor == "Zielony") {
            System.out.println("Jedź");
        } else if (kolor == "Czerwony") {
            System.out.println("Stój");
        } else {
            System.out.println("Nieokreślony sygnał.");
        }

        //5 - variable life cycle throughout the computer program lifecycle
        int myVariable = 8;
        System.out.println(myVariable);
        myVariable = -90;
        System.out.println(myVariable);

        //6 - other primitive types

        //each decimal in Java is stored as double so to point it explicitly to be float
        // the value must be followed with 'F'
        float floatVariableNo1 = 4.3232F;
        double doubleVariableNo1 = 6.3246422;

        //7 - 'for' loop

        for (int licznik = 0; licznik < 10; licznik++) {
            System.out.println("Napis po raz " + licznik);
        }

        //8 - 'while' loop

        int liczba = 0;

        while (liczba <= 10) {
            System.out.println("Liczba to " + liczba);
            liczba++;
        }

        //9 - 'while' and 'do-while' loop

        int kolejnaLiczba = -1;

        while (kolejnaLiczba > 0) {
            kolejnaLiczba --;
            System.out.println("Wartość z pętli 'while' to " + kolejnaLiczba);
        }

        kolejnaLiczba = -1;

        do {
            System.out.println("Wartość z pętli 'do-while' to " + kolejnaLiczba);
            kolejnaLiczba --;
        } while (kolejnaLiczba > 0);


        //10 - modulo division
        int numberToCheck = 101;

        if (numberToCheck % 2 == 0) {
            System.out.println("Liczba jest parzysta.");
        } else {
            System.out.println("Liczba jest nieparzysta.");
        }

        //10 - exercise
        int myValue = 843208435;
        int iloscLiczb = 0;

        while (myValue > 0) {
            myValue /= 10;
            iloscLiczb++;
        }
        System.out.println("Cyfr jest " + iloscLiczb);

        //10 - exercise
        int liczbaDoZsumowaniaCyfr = 38290;
        int sumaCyfr = 0;
        while (liczbaDoZsumowaniaCyfr > 0) {
            sumaCyfr += liczbaDoZsumowaniaCyfr%10;
            liczbaDoZsumowaniaCyfr /= 10;
        }
        System.out.println("Suma cyfr to " + sumaCyfr);

        //11 - logical type
        boolean sygnalizacja = false;
        boolean zapory = false;
        if (sygnalizacja && zapory) {
            System.out.println("Można jechać.");
        }

        int temeratura = 9;
        if (temeratura <= 0) {
            System.out.println("Jest zimno - weź czapkę.");
        } else {
            System.out.println("Życzę słonecznego dnia.");
        }

        int przekroczenie = 0;
        if (przekroczenie > 0 && przekroczenie <=10) {
            System.out.println("Informacja");
        } else if (przekroczenie > 10) {
            System.out.println("Ostrzeżenie");
        }

        int[] tablicaNaInt = new int[10];
        System.out.println(tablicaNaInt.length);
        for (int i = 0; i < tablicaNaInt.length; i++) {
            tablicaNaInt[i] = i;
        }
        for (int i = 0; i < tablicaNaInt.length; i++) {
            System.out.println(tablicaNaInt[i]);
        }

        String[] tablicaStringow = {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};
        for (int i = 0; i < tablicaStringow.length; i++) {
            System.out.println(tablicaStringow[i]);
        }

        char operacja = '+';
        int a = 3, b = 9;
        switch (operacja) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Błędny znak lub wartość.");
        }

        Kwadraty kwadrat1 = new Kwadraty();
        kwadrat1.wyswietlDlugosciBokow();

    }
}
