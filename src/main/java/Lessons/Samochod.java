package Lessons;

public class Samochod {

    String marka, model;
    int rok_prod, il_drzwi;

    String getMarka() {
        return marka;
    }

    void setMarka(String marka) {
        this.marka = marka;
    }

    String getModel() {
        return model;
    }

    void setModel() {
        this.model = model;
    }

    int getRok_prod() {
        return rok_prod;
    }

    void setRok_prod(int rok_prod) {
        this.rok_prod = rok_prod;
    }

    int getil_drzwi() {
        return il_drzwi;
    }

    void setil_drzwi(int il_drzwi) {
        this.il_drzwi = il_drzwi;
    }

    void rusz() {
        System.out.println("Ruszamy.");
    }

    void zatrzymajSie() {
        System.out.println("Zatrzymujemy się.");
    }

}