package ejercicio06;

import java.util.Scanner;

public class Ejercicio12 {

    public static int pegaPorDelante(int numero, int digito) {
        String numStr = Integer.toString(numero);
        String digitoStr = Integer.toString(digito);

        String resultadoStr = digitoStr + numStr;

        return Integer.parseInt(resultadoStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce el digito a pegar por delante: ");
        int digito = scanner.nextInt();

        int resultado = pegaPorDelante(numero, digito);

        System.out.println("El numero resultante es: " + resultado);
    }
}
