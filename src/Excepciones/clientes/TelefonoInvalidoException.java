/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones.clientes;

/**
 *
 * @author gene 
 */

public class TelefonoInvalidoException extends Exception {
    public TelefonoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
