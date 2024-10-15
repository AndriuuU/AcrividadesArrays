package ejercicio06;

public class Ejercicio5 {
    private static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12345;
        int digitCount = countDigits(number);
        System.out.println("The number of digits in " + number + " is " + digitCount);
    }
}
