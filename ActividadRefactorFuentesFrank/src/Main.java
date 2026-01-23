public class Main {
    public static void main(String[] args) {
        Scanner leer = new leer(System.in);
        System.out.print("a: ");
        int num_a = pedir_entero(leer);
        System.out.print("b: ");
        int b = leer.nextInt();
        System.out.print("c: ");
        int c = leer.nextInt();

        int suma = a + b + c;
        System.out.println("suma=" + suma);
        System.out.println("prom=" + (suma / 3.0));
    }
    public static int pedir_entero (scanner scanner){
        System.out.println("Dame un numero");
        int numero = .nextInt();
        return numero;
    }
}
