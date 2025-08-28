/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contratos;

import Personas.Clientes.Cliente;
import Vehiculos.EstadoVehiculoEnum;
import Vehiculos.Vehiculo;
import java.time.LocalDate;
import java.time.Period;

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

    public Contrato(String numContrato, Cliente cliente, Vehiculo vehiculo, LocalDate fechaInicio, LocalDate fechaFin, double tarifaDiaria) {
        this.numContrato = numContrato;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = calcularMonto(tarifaDiaria);
        this.estado = EstadoContratoEnum.ACTIVO;
    }
    
    private double calcularMonto(double tarifaDiaria){
        Period p = Period.between(fechaInicio, fechaFin);
        int dias = p.getDays()+(p.getMonths()*30)+ (p.getYears()*365);
        if(dias <= 0){
            dias = 1;
        }
        return tarifaDiaria * dias;
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
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
    
    

