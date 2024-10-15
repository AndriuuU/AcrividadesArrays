package ejercicio06;

import java.util.Scanner;

public class Ejercicio10 {
    public static int quitaPorDelante(int numero, int cantidad) {
        String numStr = Integer.toString(numero);

        if (cantidad >= numStr.length()) {
            return 0;
        }

        String resultadoStr = numStr.substring(cantidad);

        return Integer.parseInt(resultadoStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce la cantidad de digitos a quitar por delante: ");
        int cantidad = scanner.nextInt();

        int resultado = quitaPorDelante(numero, cantidad);

        System.out.println("El numero resultante es: " + resultado);
    }
}
