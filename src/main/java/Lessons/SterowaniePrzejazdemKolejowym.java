package Lessons;

public class SterowaniePrzejazdemKolejowym {

    boolean sygnalizacja = false;
    boolean zapory = false;

    void setSygnalizacja (int sygnal) {
        if (sygnal == 0) {
            System.out.println("Uruchomiono sygnalizację.");
            sygnalizacja = false;
        } else if (sygnal == 1) {
            System.out.println("Wyłączono sygnalizację.");
            sygnalizacja = true;
        } else {
            System.out.println("UWAGA - nierozpoznany sygnał.");
            sygnalizacja = false;
        }
    }

}