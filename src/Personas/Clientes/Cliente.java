/**
 * @author Greivin
 */
package Personas.Clientes;

import Personas.Persona;
import java.time.LocalDate;

public class Cliente extends Persona {
    private String licencia;

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public Cliente(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo, String licencia) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Cliente"+ super.toString() + "Licencia:" + licencia;
    }
      
}