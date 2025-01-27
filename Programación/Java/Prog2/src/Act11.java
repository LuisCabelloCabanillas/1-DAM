import java.util.Scanner;

public class Act11 {
<<<<<<< HEAD
        public static int calcularFactorial(int n) {
            if (n == 0) {
                return 1;
            }
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            return factorial;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingresa un número entero: ");
            int numero = scanner.nextInt();

            int resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
}
=======
        public static long calcularFactorial(int numero) {
            long factorial = 1;
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            return factorial;
        }

        public static void main(String[] args) {
            int numero = 5;
            long resultado = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + resultado);
        }
    }
>>>>>>> 62485d1b4f3d9fe1eac995e0124d91db4b8f6109
