package ejercicio06;

public class Ejercicio7 {
    private static int getDigitAtPosition(int number, int position) {
        String numberToString = Integer.toString(number);

        if (position < 0) {
            throw new IllegalArgumentException("Position cannot be negative.");
        }else if (position > numberToString.length()){
            throw new IllegalArgumentException("Position cannot be bigger than the digits the number has.");
        }

        return Integer.parseInt(String.valueOf(numberToString.charAt(position - 1)));
    }

    public static void main(String[] args) {
        int number = 9875;
        int position = 4;

        int extractedDigit = getDigitAtPosition(number, position);

        System.out.println("The digit at position " + position + " in " + number + " is " + extractedDigit);
    }
}
