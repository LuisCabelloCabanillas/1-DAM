public class p {

    public static void main(String[] args) {
        String original = "Hola Mundo";
        StringBuilder sb = new StringBuilder(original);

        String invertida = sb.reverse().toString();
        System.out.println("Cadena invertida: " + invertida);
    }
}
