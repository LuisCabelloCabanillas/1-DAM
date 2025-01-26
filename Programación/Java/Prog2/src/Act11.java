import java.util.Scanner;

public class Act11 {
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
