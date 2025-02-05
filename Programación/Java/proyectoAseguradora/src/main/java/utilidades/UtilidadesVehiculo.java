package utilidades;

import modelos.Vehiculo;

import java.time.LocalDate;
import java.time.Period;

public class UtilidadesVehiculo {
    public static int calculaEdad(Vehiculo vehiculo) {
        LocalDate fecha = LocalDate.now();
        LocalDate fechaInicio = vehiculo.getFechaMatriculacion();
        return Period.between(fechaInicio, fecha).getYears();
    }

    public static boolean validaFechaMatriculacion(LocalDate fecha){
        LocalDate fechaI = LocalDate.now();
        return fechaI.isAfter(fecha);
    }

}
