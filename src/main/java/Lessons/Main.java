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

        //5 - variable life cycle throughout the computer program lifecycle
        int myVariable = 8;
        System.out.println(myVariable);
        myVariable = -90;
        System.out.println(myVariable);

        //6 - other primitive types

        //each decimal in Java is stored as double so to point it explicitly to be float the value must be followed with 'F'
        float floatVariableNo1 = 4.3232F;
        double doubleVariableNo1 = 6.3246422;

        //7 - 'for' loop

        for (int licznik = 0; licznik < 10; licznik++) {
            System.out.println("napis");
        }

        //8 - 'while' loop

        int liczba = 0;

        while (liczba <= 10) {
            System.out.println("Liczba to " + liczba);
            liczba++;
        }

        //9 - 'while' and 'do-while' loop

        int kolejnaLiczba = 10;

        while (kolejnaLiczba > 0) {
            System.out.println("Wartość to " + kolejnaLiczba);
            kolejnaLiczba --;
        }

        for (kolejnaLiczba = 10; kolejnaLiczba > 0; kolejnaLiczba--) {
            System.out.println("Wartość to " + kolejnaLiczba);
        }

    }
}
