/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Marisol
 */
public interface IGestionDatos <T>{
    public boolean agregar(T t);
    public T buscar(Object t);
    public boolean actualizar(T t);
    public boolean eliminar(T t);
}
