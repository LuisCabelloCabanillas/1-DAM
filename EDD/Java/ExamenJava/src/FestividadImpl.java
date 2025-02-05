public class FestividadImpl {
    private String nombreFiesta;
    private String mes;

    public FestividadImpl(String nombreFiesta, String mes) {
        this.nombreFiesta = nombreFiesta;
        this.mes = mes;
    }

    public String getNombreFiesta() {
        return nombreFiesta;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return nombreFiesta + ", en " + mes + ".";
    }
}
