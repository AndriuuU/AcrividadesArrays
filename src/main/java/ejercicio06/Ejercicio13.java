package ejercicio06;

public class Ejercicio13 {
     public static int numberFragment(int numb, int start, int end) {
        String numbStr = String.valueOf(numb);

        if (start < 0 || end >= numbStr.length() || start > end) {
            throw new IllegalArgumentException("Invalid positions.");
        }

        String subStr = numbStr.substring(start, end);
        return Integer.parseInt(subStr);
    }
    public static void main(String[] args) {
        int numb = 123456;
        int start = 2;
        int end = 5;
        int result = numberFragment(numb, start, end);
        System.out.println("Result: " + result);
    }
}
