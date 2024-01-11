package Lessons;

public class ObjectEquals extends Object {

    public static void main(String[] args) {
        ObjectEquals o1 = new ObjectEquals();
        ObjectEquals o2 = o1;

        boolean areObjectsEqual = false;
        if (o1.hashCode() == o2.hashCode()) {
            areObjectsEqual = true;
            System.out.println("Obiekty mają ten sam hashcode");
        } else {
            areObjectsEqual = false;
            System.out.println("Hashcode obiektów jest różny");
        }



    }

}
