package Lessons;

public class Main {
    public static void main(String[] args) {

        //1 - first exercise: type 'sout'
        System.out.println("It works!");

        //2 - second exercise: variables
        byte value1 = 3;
        short value2 = 2_000;
        int value3 = 4_000_000;
        long value4 = 490_000_000;
        long value5 = 490_000_000_000_000L;

        //3 - third exercise: display values concatenated
        System.out.println("Byte variable value is " + value1);
        //byte range: -128 to 127
        //short range: -32 768 to 32 767
        //int range: -2 147 483 648 to 2 147 483 647
        //long range: -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807

        //4 - fourth exercise: 'if' conditional statement
        int valueToCheck = 128;

        if (valueToCheck <= 127) {
            System.out.println("The number type is byte.");
        }

        if (valueToCheck <= 127) {
            System.out.println("The number type is byte.");
        } else {
            System.out.println("The numer type is integer.");
        }



    }
}
