package ejercicio06;

public class Ejercicio11 {
    public static int addDigitFromBehind(int number, int digit) {
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("The digit must be between 0 y 9.");
        }
        return number * 10 + digit;
    }

    public static void main(String[] args) {
        int number = 123;
        int digit = 4;
        int result = addDigitFromBehind(number, digit);
        System.out.println("Result: " + result);
    }
}
