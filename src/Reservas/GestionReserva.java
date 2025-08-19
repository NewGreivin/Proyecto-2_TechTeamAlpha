/**
 * @author Greivin
 */
package Reservas;

import Excepciones.EliminacionNoPermitidaException;
import Excepciones.ReservaInvalidaException;
import Interfaces.IGestionReservas;
import Personas.Clientes.Cliente;
import Vehiculos.Vehiculo;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;

public class GestionReserva implements IGestionReservas<Reserva> {
    private Queue<Reserva> reservasPendientes;
    private TreeSet<Reserva> reservasOrdenadas;

    public GestionReserva() {
        this.reservasPendientes = new LinkedList<>();
        this.reservasOrdenadas = new TreeSet<>();
    }
    
    private void validarReserva (Cliente cliente, Vehiculo vehiculo, LocalDate inicio, LocalDate fin) throws ReservaInvalidaException {
        if (cliente == null) throw new ReservaInvalidaException("Cliente no registrado.");
        if (vehiculo == null) throw new ReservaInvalidaException("Vehículo no registrado.");
        if (inicio.isBefore(LocalDate.now())) throw new ReservaInvalidaException("La fecha de inicio no puede ser anterior a hoy.");
        if (!fin.isAfter(inicio)) throw new ReservaInvalidaException("La fecha de fin debe ser posterior a la de inicio.");
        if (inicio.plusDays(30).isBefore(fin)) throw new ReservaInvalidaException("No se permiten reservas mayores a 30 días.");

        // Verificar disponibilidad
        for (Reserva r : reservasOrdenadas) {
            if (r.getVehiculo().equals(vehiculo) && !(fin.isBefore(r.getFechaInicio()) || inicio.isAfter(r.getFechaFin()))){
                throw new ReservaInvalidaException("El vehículo ya está reservado en ese rango de fechas.");
            }
        }
    }

    @Override
    public boolean agregar(Reserva t) throws ReservaInvalidaException {
            validarReserva(t.getCliente(), t.getVehiculo(), t.getFechaInicio(), t.getFechaFin());
            reservasPendientes.add(t);
            reservasOrdenadas.add(t);
            return true;
    }

    @Override
    public boolean actualizar(Reserva t) throws ReservaInvalidaException{
        if (reservasOrdenadas.contains(t)) {
            reservasOrdenadas.remove(t);
            reservasPendientes.remove(t);
            return agregar(t);
        }
        return false;
    }
    
    @Override
    public boolean eliminar(Reserva t) throws EliminacionNoPermitidaException{
        if (t != null && LocalDate.now().isBefore(t.getFechaInicio())) {
            return reservasPendientes.remove(t) && reservasOrdenadas.remove(t);
        }
        throw new EliminacionNoPermitidaException("No se puede eliminar la reserva ya iniciada o no existente");
    }
    
    @Override
    public Reserva buscar(Object dato) {
        if (dato instanceof Cliente cliente) { //Se hacen validacion del tipo de dato obtenido 
            for (Reserva r : reservasOrdenadas) {
                if (r.getCliente().equals(cliente)) 
                    return r;
            }
        } else if (dato instanceof LocalDate fecha) {
            for (Reserva r : reservasOrdenadas) {
                if (!fecha.isBefore(r.getFechaInicio()) && !fecha.isAfter(r.getFechaFin())) {
                    return r;
                }
            } 
        }
        return null;
    }
    
    public boolean confirmarReserva(Reserva r) throws ReservaInvalidaException {
        if (r == null){
            throw new ReservaInvalidaException("Reserva no encontrada.");
        }
        r.isConfirmada();
        return true;
        //Faltan lineas para enviar info al de contrato
    }
}