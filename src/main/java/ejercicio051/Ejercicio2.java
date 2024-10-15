package ejercicio051;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Actividad 2
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        System.out.println("Introduce 20 números enteros:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] sumasFilas = new int[4];
        int[] sumasColumnas = new int[5];
        int sumaTotal = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumasFilas[i] += matriz[i][j];
                sumasColumnas[j] += matriz[i][j];
            }
        }

        for (int i = 0; i < 4; i++) {
            sumaTotal += sumasFilas[i];
        }

        System.out.println("\nMatriz con sumas parciales:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("| Suma Fila " + i + ": " + sumasFilas[i]);
        }

        for (int j = 0; j < 5; j++) {
            System.out.print("Suma Columna " + j + ": " + sumasColumnas[j] + "\t");
        }
        System.out.println("| Suma Total: " + sumaTotal);

    }
}