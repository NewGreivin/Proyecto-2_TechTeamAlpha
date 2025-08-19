/**
 * @author Greivin
 */
package Reservas;

import Interfaces.IComparador;
import Personas.Clientes.Cliente;
import Vehiculos.Vehiculo;
import java.time.LocalDate;

public class Reserva implements IComparador<Reserva>{
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean confirmada;

    public Cliente getCliente() {
        return cliente;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public LocalDate getFechaInicio() {
        return fechaInicio;
    }
    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public boolean isConfirmada() {
        return confirmada;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }
   
    public Reserva(Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.confirmada = false;
    }

    @Override
    public int compareTo(Reserva r) {
        int comparacion = fechaInicio.compareTo(r.fechaInicio);
        if (comparacion == 0) {
            return fechaFin.compareTo(r.fechaFin);
        }
        return comparacion;
    }
     
}