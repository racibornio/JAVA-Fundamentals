public class NumbersProcessing {
    int number;

    void decimalToBinary() {
        int decimalMin = 0;
        int decimalMax = 100;
        System.out.println("Decimal " + decimalMin + " equals ");
    }

    void binaryToDecimal() {
        int binaryNumber = 0b01010101010;
        String theNumber = "01010101010";
        System.out.println("Binary value " + theNumber + " equals " + binaryNumber);
    }

    void octToDecimal() {
        int octNumber = 0654056;
        String theNumber = "0654056";
        System.out.println("Octal value " + theNumber + " equals " + octNumber);
    }

    void hexToDecimal() {
        int hexNumber = 0x190af;
        String theNumber = "0x190af";
        System.out.println("Hexadecimal value " + theNumber + " equals " + hexNumber);
    }

    void setNumber(int number) {
        this.number = number;
    }

    int getNumber() {
        return number;
    }

    void setByObject (NumbersProcessing numbersProcessing) {
        this.number = numbersProcessing.number;
        System.out.println("Nastąpiło podanie wartości do settera przez obiekt");
        System.out.println(this.number + " - a oto wartość.");
    }
}