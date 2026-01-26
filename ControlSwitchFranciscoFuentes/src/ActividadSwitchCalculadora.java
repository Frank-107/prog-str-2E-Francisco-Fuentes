import java.util.*;
public class ActividadSwitchCalculadora {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Que desea hacer?");
        System.out.println(" 1) Sumar\n 2) Restar\n 3) Multiplicar\n 4) Dividir ");
        int opcion = leer.nextInt();
        if (opcion > 4 || opcion < 0){
            System.out.println("Opcion no valida");
            return;
        }
        switch (opcion) {
            case 1:
                System.out.println("El resultado es: "+ suma(leer));
                break;
            case 2:
                System.out.println("El resultado es: "+ resta(leer));
                break;
            case 3:
                System.out.println("El resultado es: "+ multiplicar(leer));
                break;
            case 4:
                System.out.println("El resultado es: "+ dividir(leer));
                break;
        }


    }
    public static double suma(Scanner leer){
        double variablea, variableb = 0;
        System.out.println("Opcion elegida: SUMA");
        System.out.println("¿Cual es el primer numero para su operacion?");
        variablea = leer.nextDouble();
        System.out.println("¿Cual es el segundo numero para su operacion?");
        variableb = leer.nextDouble();
        return variablea+variableb;
    }
    public static double resta(Scanner leer){
        double variablea, variableb = 0;
        System.out.println("Opcion elegida: RESTA");
        System.out.println("¿Cual es el primer numero para su operacion?");
        variablea = leer.nextDouble();
        System.out.println("¿Cual es el segundo numero para su operacion?");
        variableb = leer.nextDouble();
        return variablea-variableb;
    }
    public static double multiplicar(Scanner leer){
        double variablea, variableb = 0;
        System.out.println("Opcion elegida: MULTIPLICAR");
        System.out.println("¿Cual es el primer numero para su operacion?");
        variablea = leer.nextDouble();
        System.out.println("¿Cual es el segundo numero para su operacion?");
        variableb = leer.nextDouble();
        return variablea*variableb;
    }
    public static double dividir(Scanner leer){
        double variablea, variableb = 0;
        System.out.println("Opcion elegida: DIVIDIR");
        System.out.println("¿Cual es el primer numero para su operacion?");
        variablea = leer.nextDouble();
        System.out.println("¿Cual es el segundo numero para su operacion?");
        variableb = leer.nextDouble();
        if (variableb==0){
            System.out.println("No se puede dividir entre 0");
            return 0;
        }
        return variablea/variableb;
    }
}
