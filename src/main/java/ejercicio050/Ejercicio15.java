package ejercicio050;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        var mesas = new HashMap<>();
        Random random = new Random();

        for (var i = 0; i < 10; i++) {
            var inicial = random.nextInt(0, 4);
            mesas.put(i, inicial);
        }
        while (true) {
            System.out.println("¿Cuántos son? Introduzca -1 para salir del programa:");
            Scanner escaner = new Scanner(System.in);
            var comensales = escaner.nextInt();
            if (comensales < 0) {
                break;
            }
            var found = true;
            while (found) {
                for (var i = 0; i < 10; i++) {
                    int plazas = (int) mesas.get(i);
                    var libre = plazas - comensales;
                    if (libre >= 0) {
                        mesas.put(i, plazas + comensales);
                        System.out.println("Porfavor siéntese en la mesa " + i);
                        found = false;
                    }
                }
            }
        }
    }
}

