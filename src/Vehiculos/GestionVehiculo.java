/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

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
        map.put(t.getPlaca(), t);
        return true;
    }

    @Override
    public boolean eliminar(Vehiculo t) {
        if(!map.containsKey(t.getPlaca()))
            return false;
        map.remove(t.getPlaca(), t);
            return true;
    }
    
}
