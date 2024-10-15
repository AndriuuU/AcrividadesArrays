package ejercicio06;

public class Ejercicio6 {
    public static int voltea(int numero) {
        int invertido = 0;
        while (numero != 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }

    public static void main(String[] args) {
        int numero = 12345;
        System.out.println("Numero original: " + numero);
        System.out.println("Numero invertido: " + voltea(numero));
    }
}
