import java.util.*;

public class Main {
    public static double pi = 3.1416;

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular area de un rectuangulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");

            choice = leer.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Seleccionaste Calcular el IMC");
                    System.out.println("Su imc es de " + imc(leer));

                    break;
                case 2:
                    System.out.println("Seleccionaste Calcular el area de un rectangulo");
                    System.out.println("El area de tu rectangulo es de " + arearectangulo(leer) + " unidades cuadradas");
                    break;
                case 3:
                    System.out.println("Seleccionaste Convertir C a F");
                    System.out.println("Eso es equivalente a " + farenheit(leer) + " grados fahrenheit");
                    break;
                case 4:
                    System.out.println("Seleccionaste Calcular area del circulo");
                    System.out.println("El area del circulo es " + circulo(leer));
                    break;
                case 5:
                    System.out.println("Seleccionaste Salir");
                    break;
                default:
                    System.out.println("Eleccion invalida, por favor elija de nuevo");
            }
            System.out.println();

        } while (choice != 5);

        leer.close();
    }

    /**
     * Calcula el índice de masa corporal del usuario.
     *
     * @param leer Scanner utilizado para leer el peso y la altura
     * @return El valor del IMC calculado
     */
    public static Double imc(Scanner leer) {
        System.out.println("Cual es tu peso ?");
        double peso = leer.nextDouble();
        System.out.println("Cual es tu altura ?");
        double altura = leer.nextDouble();
        return peso / (altura * altura);
    }

    /**
     * Calcula el área de un rectángulo.
     *
     * @param leer Scanner utilizado para leer la base y la altura
     * @return El área total del rectángulo
     */
    public static Double arearectangulo(Scanner leer) {
        System.out.println("Cual es la base del rectangulo ?");
        double base = leer.nextDouble();
        System.out.println("Cual es la altura de su rectangulo ?");
        double altura = leer.nextDouble();
        return base * altura;
    }

    /**
     * Convierte grados Celsius a grados Fahrenheit.
     *
     * @param leer Scanner utilizado para leer los grados en Celsius
     * @return El valor convertido a Fahrenheit
     */
    public static Double farenheit(Scanner leer) {
        System.out.println("Dime los grados en C que quieres convertir");
        double grados = leer.nextDouble();
        return (grados * 1.8) + 32;
    }

    /**
     * Calcula el área de un círculo.
     *
     * @param leer Scanner utilizado para leer el radio del círculo
     * @return El área del círculo calculada
     */
    public static Double circulo(Scanner leer) {
        System.out.println("Cual es el radio del circulo?");
        double radio = leer.nextDouble();
        return pi * radio * radio;
    }
}