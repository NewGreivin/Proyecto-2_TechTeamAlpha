/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas.Empleados;

import Personas.Empleados.Empleado;
import Interfaces.IGestionDatos;
import Utilidades.UtilValidaciones;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Ricardo Chaves
 */
public class GestionEmpleado implements IGestionDatos <Empleado>{
    private ArrayList<Empleado> Empleado = new ArrayList<>();
    @Override
    public boolean agregar(Empleado t) {
        if(buscar(t.getCedula())!=null){
            return false;
        }
        
        if(UtilValidaciones.calcularEdad(t.getFechaNacimiento())<18){
            return false;
        }
        
        if(UtilValidaciones.validarTelefono(t.getTelefono())){
            return false;
        }
        
        if(UtilValidaciones.validarCorreo(t.getCorreo())){
            return false;
        }
        
        if(Empleado.add(t));
        return true;
    }

    @Override
    public Empleado buscar(Object t) {
        for(Empleado e:Empleado){
            if(e.getCedula().equals(t)){
                return e;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Empleado t) {
        Empleado existe = buscar(t.getCedula());
            if(existe == null){
                return false;
            }
        
        existe.setPuesto(t.getPuesto());
        existe.setCorreo(t.getCorreo());
        existe.setTelefono(t.getTelefono());
        return true;
        
    }

    @Override
    public boolean eliminar(Empleado t) {
        return Empleado.remove(t);
    }
    
    public HashSet<String> getPuesto(){
        HashSet<String> set = new HashSet<>();
        for (Empleado empleado : Empleado) {
            set.add(empleado.getPuesto());
        }
        return set;
    }
    
}
