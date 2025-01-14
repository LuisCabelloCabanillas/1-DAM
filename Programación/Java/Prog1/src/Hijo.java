public class Hijo extends Persona {
    private Persona padre;
    private Persona madre;

    public Hijo(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public Hijo(String nombre, String apellido, int edad, Persona padre, Persona madre) {
        super(nombre, apellido, edad);
        this.padre = padre;
        this.madre = madre;
    }
    public Persona setPadre() {
        return padre;
    }
    public Persona setMadre() {
        return madre;
    }
    public String toString() {
        String salida = super.toString();
        return salida +"\n \tPadre: "+ padre + "\n \tMadre: "+ madre;
    }
}

