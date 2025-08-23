/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contratos;

import Excepciones.EliminacionNoPermitidaException;
import Interfaces.IGestionDatos;
import Utilidades.UtilValidaciones;
import java.util.HashMap;

/**
 *
 * @author Marisol
 */
public class GestionContrato implements IGestionDatos<Contrato> {
    private HashMap<String, Contrato> contratos;

    public GestionContrato() {
        this.contratos = new HashMap<>();
    }

    @Override
    public boolean agregar(Contrato t) throws Exception {
        for(Contrato c : contratos.values()){
            if(c.getCliente().getCedula().equals(c.getCliente().getCedula())){
                return false;
            }
        }
            if (UtilValidaciones.calcularEdad(t.getCliente().getFechaNacimiento()) < 18) {
                return false;
        }
        
            if (!UtilValidaciones.validarCorreo(t.getCliente().getCorreo())) {
                return false;
        }
        
            if (!UtilValidaciones.validarTelefono(t.getCliente().getTelefono())) {
                return false;
        }
        
        ///if(t.getCliente().getLicencia() == null || t.getCliente().)){
            
        //}
        
        contratos.put(t.getNumContrato(), t);
        return true;
    }

    @Override
    public Contrato buscar(Object t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizar(Contrato t) throws Exception {
        if(!contratos.containsKey(t.getNumContrato())){
            throw new Exception("El contrato no existe, no se puede actualizar");
        }
        contratos.put(t.getNumContrato(), t);
        return true;
    }

    @Override
    public boolean eliminar(Contrato t) throws EliminacionNoPermitidaException {
        if(!contratos.containsKey(t.getNumContrato())){
            throw new EliminacionNoPermitidaException("El contrato no existe, no se puede eliminar");
        }
        contratos.remove(t.getNumContrato());
        return true;
    }
    
    
}
