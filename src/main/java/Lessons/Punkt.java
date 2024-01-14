package Lessons;

public class Punkt {

    //private
    int x;
    //private
    int y;

    void wyswietlWspolrzedne() {
        System.out.println("X wynosi " + x);
        System.out.println("Y wynosi " + y);
    }

    int pobierzX() {
        return x;
    }

    int pobierzY() {
        return y;
    }

    void ustawX(int wsplX) {
        x = wsplX;
    }

    void ustawY(int wsplY) {
        y = wsplY;
    }

    void ustawXY(int wsplX, int wsplY) {
        x = wsplX;
        y = wsplY;
    }

    void ustawXY(Punkt punkt) {
        x = punkt.x;
        y = punkt.y;
    }

    Punkt pobierzWspolrzedne() {
        Punkt punkt = new Punkt();
        punkt.x = x;
        punkt.y = y;
        return punkt;
    }

    static void metodaStatycna() {
        System.out.println("Test metody statycznej - dostępnej dla klasy bez instancjonowania obiektu.");
    }

    static int poleStatyczneTypuInt;

    int dodawaj(int a, int b) {
        int suma = a + b;
        return suma;
    }

    int dodawaj(int a, int b, int c) {
        int suma = a + b + c;
        return suma;
    }

    int dodawaj(int a, int b, int c, int d) {
        int suma = a + b + c + d;
        return suma;
    }



}