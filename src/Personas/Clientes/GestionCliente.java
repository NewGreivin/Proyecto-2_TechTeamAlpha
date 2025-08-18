/**
 * @author Greivin
 */
package Personas.Clientes;

import Interfaces.IGestionDatos;
import Utilidades.UtilValidaciones;
import java.util.ArrayList;

public class GestionCliente implements IGestionDatos<Cliente> {
    private ArrayList<Cliente> clientes = new ArrayList<>();
    
    @Override
    public boolean agregar(Cliente t) {
        if (buscar(t.getCedula()) != null) {
            return false;
        }
        
        if (UtilValidaciones.calcularEdad(t.getFechaNacimiento()) < 18) {
            return false;
        }
        
        if (!UtilValidaciones.validarCorreo(t.getCorreo())) {
            return false;
        }
        
        if (!UtilValidaciones.validarTelefono(t.getTelefono())) {
            return false;
        }
        
        if (t.getLicencia() == null || t.getLicencia().getLicencia().isEmpty()) {
            return false;
        }
        clientes.add(t);
        return true;
    }

    @Override
    public Cliente buscar(Object t) {
        for (Cliente c : clientes) {
            if (c.getCedula().equals(t)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean actualizar(Cliente t) {
        Cliente existe = buscar(t.getCedula());
        if (existe == null) {
            return false;
        }
        
        existe.setTelefono(t.getTelefono());
        existe.setCorreo(t.getCorreo());
        existe.setLicencia(t.getLicencia());
        return true;
    }

    @Override
    public boolean eliminar(Cliente t) {
         return clientes.remove(t);
}
    
}