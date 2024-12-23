package Lessons;

public class TablicaASCII {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            char znak = (char) i;
            System.out.println(i + " = " + znak);
        }
    }
}
