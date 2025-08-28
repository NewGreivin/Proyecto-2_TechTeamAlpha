/**
 * @author Greivin
 */
package Personas.Clientes;

import Excepciones.EliminacionNoPermitidaException;
import Interfaces.IGestionDatos;
import Reservas.GestionReserva;
import Reservas.Reserva;
import Utilidades.UtilValidaciones;
import java.util.ArrayList;

public class GestionCliente implements IGestionDatos<Cliente> {
    private ArrayList<Cliente> clientes;

    public GestionCliente() {
        clientes = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
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
    public boolean eliminar(Cliente t) throws EliminacionNoPermitidaException {
    GestionReserva gestorReserva = new GestionReserva(); 
    Reserva hayActiva = gestorReserva.buscar(t);

    if (hayActiva != null) {
        throw new EliminacionNoPermitidaException("No se puede eliminar el cliente, tiene reservas activas.");
    }

    return clientes.remove(t);
}
    
}