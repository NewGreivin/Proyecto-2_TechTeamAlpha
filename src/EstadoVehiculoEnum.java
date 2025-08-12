/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */

/**
 *
 * @author Marisol
 */
public enum EstadoVehiculoEnum {
    DISPONIBLE("Disponible"),
    EN_ALQUILER("En Alquiler"),
    EN_MANTENIMIENTO("En Mantenimiento");
    
    private final String descripcion;

    private EstadoVehiculoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "EstadoVehiculoEnum{" + "ordinal=" + ordinal() + ", name=" + name() + ", descripcion=" + descripcion + '}';
    }
    
    
    
}
