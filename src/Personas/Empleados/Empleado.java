/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Empleados;

import Personas.Persona;
import java.time.LocalDate;

/**
 *
 * @author Ricardo Chaves
 */
public class Empleado extends Persona  {
    private String puesto;
    private double salario;

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Empleado(String cedula, String nombre, LocalDate fechaNacimiento, String telefono, String correo, String puesto, double salario) {
        super(cedula, nombre, fechaNacimiento, telefono, correo);
        this.puesto = puesto;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + super.toString() + "puesto=" + puesto + ", salario=" + salario + '}';
    }
    
}
