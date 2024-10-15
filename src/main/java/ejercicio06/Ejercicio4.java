package ejercicio06;

public class Ejercicio4 {
    public static double potencia(double base, int exponente) {
        double resultado = 1;

        if (exponente < 0) {
            base = 1 / base;
            exponente = -exponente;
        }

        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }

        return resultado;
    }

    public static void main(String[] args) {
        double base = 2;
        int exponente = 3;
        System.out.println(base + "^" + exponente + " = " + potencia(base, exponente));
    }
}
