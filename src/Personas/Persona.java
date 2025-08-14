/**
 * @author Greivin
 */
package Personas;

import java.time.LocalDate;

public abstract class Persona {
    protected String cedula;
    protected String nombre;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    protected String correo;

    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Persona(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cedula: " + cedula + ", Nombre: " + nombre + ", FechaNacimiento: " + fechaNacimiento + ", Telefono: " + telefono + ", Correo: " + correo;
    }
      
}