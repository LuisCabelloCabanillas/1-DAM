public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = 0;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String toString() {
        //return getNombre() + " " + getApellido() + ", " + getEdad();
        //return nombre + " " + apellido + " " + edad;
        String mensaje = String.format("La persona es: %s %s, %d", nombre, apellido,edad);
        return mensaje;
    }
    public boolean equals(Object obj) {
        boolean respuesta = ((Persona)obj).nombre.equals(nombre);
        respuesta = respuesta && ((Persona)obj).apellido.equals(apellido);
        respuesta = respuesta && ((Persona)obj).edad==(edad);
        return respuesta;
    }
}
