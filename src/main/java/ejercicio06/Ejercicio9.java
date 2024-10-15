package ejercicio06;

public class Ejercicio9 {
     private static int removeDigitsFromRight(int number, int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count must be non-negative.");
        }

        int divisor = (int) Math.pow(10, count);
        int numberWithoutDigits = number / divisor;

        return numberWithoutDigits * divisor;
    }

    public static void main(String[] args) {
        int number = 123456789;
        int count = 3;

        int newNumber = removeDigitsFromRight(number, count);
        System.out.println("Original number: " + number);
        System.out.println("Resulting number: " + newNumber);
    }
}
