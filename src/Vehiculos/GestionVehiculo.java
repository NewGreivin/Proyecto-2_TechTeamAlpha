/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Excepciones.VehiculoNoDisponibleException;
import Interfaces.IGestionDatos;
import java.util.HashMap;

/**
 *
 * @author Marisol
 */
public class GestionVehiculo implements IGestionDatos<Vehiculo>{
    private HashMap<String, Vehiculo> map;

    public GestionVehiculo() {
        this.map = new HashMap<>();
    }

    public HashMap<String, Vehiculo> getMap() {
        return map;
    }
    
    @Override
    public boolean agregar(Vehiculo t) {
        if(map.containsKey(t.getPlaca())) {
            return false;
        }
        int anioActual = java.time.Year.now().getValue();
        int antiguedad = anioActual - t.getAnio();
        
        if(antiguedad > 20){
            return false;
        }
        
        map.put(t.getPlaca(), t);
        return true;
    }

    @Override
    public Vehiculo buscar(Object placa) {
        String strPlaca = String.valueOf(placa);
        return map.get(strPlaca);
    }

    @Override
    public boolean actualizar(Vehiculo t) {
        if(!map.containsKey(t.getPlaca())) {
            return false;
        }
        Vehiculo v = map.get(t.getPlaca());
        v.setModelo(t.getModelo());
        v.setTipo(t.getTipo());
        v.setEstado(t.getEstado());
        return true;
    }

    @Override
    public boolean eliminar(Vehiculo t) throws VehiculoNoDisponibleException {
        if(!map.containsKey(t.getPlaca())){
            return false;
        }
        Vehiculo v = map.get(t.getPlaca());
        if(EstadoVehiculoEnum.EN_ALQUILER.equals(v.getEstado())){
            throw new VehiculoNoDisponibleException(
                "No se puede eliminar el vehiculo: esta alquilado"
            );
        }
        map.remove(t.getPlaca());
        return true;
    }
    
}
