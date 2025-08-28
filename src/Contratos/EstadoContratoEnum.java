/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Contratos;

/**
 *
 * @author Marisol
 */
public enum EstadoContratoEnum {
    ACTIVO("Activo"),
    FINALIZADO("Finalizado"),
    CANCELADO("Cancelado");
    
    private final String descripcion;

    private EstadoContratoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return descripcion;
    }
    
}
