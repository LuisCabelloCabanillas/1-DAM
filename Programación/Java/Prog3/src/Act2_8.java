import java.util.Scanner;

public class Act2_8 {
    public static void main(String[] args) {
        int a;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número entero positivo: ");
            a=sc.nextInt();

            if(a<0){
            System.out.println("El número entero debe ser positivo");
            }
        }while(a < 0);
            System.out.println("El número entero es positivo");
    }
}
