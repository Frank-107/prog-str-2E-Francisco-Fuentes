import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = pedirNumero();
        int suma = sumarHasta(numero);

        System.out.println("La suma de los números es: " + suma);
    }

    public static int pedirNumero() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = leer.nextInt();
        return numero;
    }

    public static int sumarHasta(int n) {
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma = suma + i;
        }

        return suma;
    }
}
