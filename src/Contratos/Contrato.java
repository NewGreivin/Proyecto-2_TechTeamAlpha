/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contratos;

import Personas.Clientes.Cliente;
import Vehiculos.EstadoVehiculoEnum;
import Vehiculos.Vehiculo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Marisol
 */
public class Contrato {
    private String numContrato;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double monto;
    private EstadoContratoEnum estado;

    public Contrato(String numContrato, Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, double monto, double tarifaDiaria) {
        this.numContrato = numContrato;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);
        
        this.monto = tarifaDiaria * dias;
        this.estado = EstadoContratoEnum.ACTIVO;
        
        this.vehiculo.setEstado(EstadoVehiculoEnum.EN_ALQUILER);
    }

    public String getNumContrato() {
        return numContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public double getMonto() {
        return monto;
    }

    public EstadoContratoEnum getEstado() {
        return estado;
    }
    
    public void finalizar(){
        if(estado == EstadoContratoEnum.ACTIVO){
            estado = EstadoContratoEnum.FINALIZADO;
            vehiculo.setEstado(EstadoVehiculoEnum.DISPONIBLE);
        }
    }
    public void cancelar(){
        if(estado != EstadoContratoEnum.FINALIZADO){
            estado = EstadoContratoEnum.CANCELADO;
            vehiculo.setEstado(EstadoVehiculoEnum.DISPONIBLE);
        }
    }
}
    
    

