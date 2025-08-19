/**
 * @author Greivin
 */
package Interfaces;

import Excepciones.EliminacionNoPermitidaException;
import Excepciones.ReservaInvalidaException;

public interface IGestionReservas <T>{
    public boolean agregar(T t) throws ReservaInvalidaException;
    public T buscar(Object t);
    public boolean actualizar(T t) throws ReservaInvalidaException;
    public boolean eliminar(T t) throws EliminacionNoPermitidaException;
}
