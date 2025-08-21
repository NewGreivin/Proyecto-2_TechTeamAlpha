/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Marisol
 */
public enum TipoVehiculoEnum {
    SEDAN("Sedan"),
    SUV("SUV"),
    PICKUP("Pick-up");
    
    private final String descripcion;

    private TipoVehiculoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion ;
    }
    
    
}
