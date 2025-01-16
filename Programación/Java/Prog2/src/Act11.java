import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        System.out.println("Escribe un número para hacer su factorial: " );
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (; a <= 1 ; a--) {
            System.out.println(a);
        }
    }
}
