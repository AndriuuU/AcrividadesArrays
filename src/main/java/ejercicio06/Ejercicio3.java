package ejercicio06;

public class Ejercicio3 {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int nextPrime(int number) {
        int next = number + 1;
        while (true) {
            if (isPrime(next)) {
                return next;
            }
            next++;
        }
    }

    public static void main(String[] args) {
        int number = 10;
        int nextPrimeNumber = nextPrime(number);
        System.out.println("The next prime number after " + number + " is " + nextPrimeNumber);
    }
}
