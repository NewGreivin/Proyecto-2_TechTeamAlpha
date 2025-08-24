/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contratos;

import Interfaces.IGestionDatos;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Marisol
 */
public class GestionContrato implements IGestionDatos<Contrato> {
    private HashMap<String, Contrato> contratos;

    public GestionContrato(HashMap<String, Contrato> contratos) {
        this.contratos = new HashMap<>();
    }

    @Override
    public boolean agregar(Contrato contrato) {
        if(contratos.containsKey(contrato.getNumContrato())){
            return false;
        }
        contratos.put(contrato.getNumContrato(), contrato);
        return true;
    }

    @Override
    public Contrato buscar(Object t)  {
        return contratos.get(String.valueOf(t));
    }

    @Override
    public boolean actualizar(Contrato contrato){
        if(contratos.containsKey(contrato.getNumContrato())){
            contratos.put(contrato.getNumContrato(), contrato);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminar(Contrato t) throws Exception {
        if(contratos.containsKey(String.valueOf(t))){
            contratos.remove(String.valueOf(t));
            return true;
        }
        return false;
    }
    
    public Collection<Contrato> listar(){
        return contratos.values();
    }
    
    
}
