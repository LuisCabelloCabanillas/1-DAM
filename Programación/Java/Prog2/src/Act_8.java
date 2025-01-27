import java.util.Scanner;

public class Act_8 {
        public int contarDigitos(int numero) {
            return String.valueOf(numero).length();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número entero positivo: ");
            int numero = scanner.nextInt();

            Act_8 contador = new Act_8();
            int cantidadDigitos = contador.contarDigitos(numero);

            System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");
        }
}
