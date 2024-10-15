package ejercicio050;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        //Actividad 16

        int[] numeros = new int[20];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(401);
        }

        System.out.println("Array original:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n¿Qué numeros quiere resaltar? (1 - los multiplos de 5, 2 - los multiplos de 7): ");
        int opcion = scanner.nextInt();

        System.out.println("\nArray con numeros resaltados:");
        for (int num : numeros) {
            if (opcion == 1 && num % 5 == 0) {
                System.out.print("[" + num + "] ");
            } else if (opcion == 2 && num % 7 == 0) {
                System.out.print("[" + num + "] ");
            } else {
                System.out.print(num + " ");
            }
        }


    }
}