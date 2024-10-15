package ejercicio06;

import java.util.Scanner;

public class Ejercicio14 {

    public static int juntaNumeros(int numero1, int numero2) {
        String numStr1 = Integer.toString(numero1);
        String numStr2 = Integer.toString(numero2);

        String resultadoStr = numStr1 + numStr2;

        return Integer.parseInt(resultadoStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int numero2 = scanner.nextInt();

        int resultado = juntaNumeros(numero1, numero2);

        System.out.println("El numero resultante es: " + resultado);
    }
}
