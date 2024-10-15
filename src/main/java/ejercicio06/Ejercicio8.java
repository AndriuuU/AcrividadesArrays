package ejercicio06;

import java.util.Scanner;

public class Ejercicio8 {

    public static int posicionDeDigito(int numero, int digito) {
        String numStr = Integer.toString(numero);
        String digitoStr = Integer.toString(digito);

        int posicion = numStr.indexOf(digitoStr);
        return (posicion != -1) ? posicion : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce el digito a buscar: ");
        int digito = scanner.nextInt();

        int posicion = posicionDeDigito(numero, digito);

        if (posicion != -1) {
            System.out.println("La posicion del digito " + digito + " en el numero " + numero + " es: " + posicion);
        } else {
            System.out.println("El digito " + digito + " no se encuentra en el numero " + numero);
        }
    }
}
