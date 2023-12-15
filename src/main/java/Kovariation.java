public class Kovariation {


    private static Long[] numbers;

    public Long[] getNumbers() {
        return numbers;
    }

    //to jest varargs -> i tak musi być na końcu gdy argumentów konstruktor przyjmuje więcej
    //np. Kovariation(String name, Long... numbers)
    Kovariation(Long... numbers) {
        this.numbers = numbers;
    }

}
