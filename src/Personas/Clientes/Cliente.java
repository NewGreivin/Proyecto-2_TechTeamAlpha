/**
 * @author Greivin
 */
package Personas.Clientes;

import Personas.Persona;
import java.time.LocalDate;

public class Cliente extends Persona {
    private LicenciasEnum licencia;

    public LicenciasEnum getLicencia() {
        return licencia;
    }

    public void setLicencia(LicenciasEnum licencia) {
        this.licencia = licencia;
    }

    public Cliente(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo, LicenciasEnum licencia) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return "Cliente"+ super.toString() + "Licencia:" + licencia;
    }
      
}