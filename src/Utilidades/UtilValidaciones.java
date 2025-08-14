/**
 * @author Greivin
 */
package Utilidades;

import java.time.LocalDate;
import java.time.Period;

public class UtilValidaciones {
    
    public static int calcularEdad(LocalDate fecha){
        return Period.between(fecha, LocalDate.now()).getYears();
    }
    
    public static boolean validarCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return correo != null && correo.matches(regex);
    }


    public static boolean validarTelefono(String telefono) {
        return telefono != null && telefono.matches("^[0-9]{8}$");
    }
}