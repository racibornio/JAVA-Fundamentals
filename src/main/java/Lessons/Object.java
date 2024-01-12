package Lessons;

public class Object extends java.lang.Object {

    /**
     * Klasa Object w Javie pełni kilka bardzo ważnych funkcji:
     * <p>
     * Bazowa klasa dla wszystkich obiektów: W Javie każda klasa jest pochodną klasy Object, nawet jeśli nie jest to jawnie zadeklarowane. Oznacza to, że każdy obiekt w Javie dziedziczy metody z klasy Object. To zapewnia, że każdy obiekt będzie miał pewien podstawowy zestaw metod, takich jak toString(), equals(), hashCode(), i getClass().
     * <p>
     * Metody wspólne dla wszystkich obiektów: Klasa Object definiuje metody, które są wspólne i użyteczne dla wszystkich obiektów, niezależnie od ich specyficznych rodzajów i funkcji. Na przykład:
     * toString() zwraca reprezentację ciągu znaków obiektu, co jest bardzo pomocne w debugowaniu i logowaniu.
     * equals(Object obj) pozwala na porównywanie obiektów pod kątem równości.
     * hashCode() zapewnia kod hash, który jest wykorzystywany przez struktury danych oparte na hash, takie jak HashMap.
     * getClass() zwraca obiekt Class, który reprezentuje klasę, do której należy dany obiekt.
     * wait(), notify(), i notifyAll() są używane w programowaniu wielowątkowym.
     * <p>
     * Mechanizm polimorfizmu: Klasa Object pozwala na polimorfizm na najwyższym poziomie. Możesz użyć odniesienia typu Object do przechowywania odniesienia do dowolnego typu obiektu. Dzięki temu, funkcje, które przyjmują lub zwracają Object, mogą pracować z obiektami dowolnego typu.
     * <p>
     * Standardowa klasa bazowa: Umożliwia tworzenie struktur danych i algorytmów, które są w pełni ogólne i mogą pracować z dowolnymi typami obiektów.
     * <p>
     * Zasadniczo, klasa Object jest fundamentalnym elementem, który zapewnia jednolitość i ogólność w obiektowym modelu programowania Javy. Każdy obiekt w Javie jest na pewnym poziomie obiektem Object, co jest kluczowym aspektem architektury języka Java.
     */


    public static void main(String[] args) {
        //metody domyślne

        java.lang.Object object = new java.lang.Object();
        object.equals(object);
        object.hashCode();
        object.toString();
        object.getClass();

    }


}