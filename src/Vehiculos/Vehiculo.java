/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Marisol
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private TipoVehiculoEnum tipo;
    private EstadoVehiculoEnum estado;

    public Vehiculo(String placa, String marca, String modelo, int anio, TipoVehiculoEnum tipo, EstadoVehiculoEnum estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public TipoVehiculoEnum getTipo() {
        return tipo;
    }

    public EstadoVehiculoEnum getEstado() {
        return estado;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setTipo(TipoVehiculoEnum tipo) {
        this.tipo = tipo;
    }

    public void setEstado(EstadoVehiculoEnum estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", tipo=" + tipo + ", estado=" + estado + '}';
    }
}
