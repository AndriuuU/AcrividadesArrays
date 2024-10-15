package ejercicio06;

public class Ejercicio1 {
    public static void main(String[] args){
        int number = 123921;
        if (isPalindromicNumber(number)){
            System.out.println(number + " is a palindromic number.");
        }else {
            System.out.println(number + " is not a palindromic number.");
        }
    }
    private static boolean isPalindromicNumber(int numberGiven){
        StringBuilder numberGivenToString = new StringBuilder(Integer.toString(numberGiven));
        int reversedNumberGiven = Integer.parseInt(numberGivenToString.reverse().toString());
        return numberGiven == reversedNumberGiven;
    }
}
