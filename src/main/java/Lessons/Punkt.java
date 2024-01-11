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

}