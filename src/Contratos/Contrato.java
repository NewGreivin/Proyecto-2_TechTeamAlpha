/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contratos;

import java.time.LocalDate;

/**
 *
 * @author Marisol
 */
public class Contrato {
    private String numContrato;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate fechaInicio;
    private double monto;
    private EstadoContratoEnum estado;
}
