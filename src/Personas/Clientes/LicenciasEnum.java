/**
 * @author Greivin
 */
package Personas.Clientes;

public enum LicenciasEnum {
    A1("A1"),
    A2("A2"),
    A3("A3"),
    B1("B1"),
    B2("B2"),
    B3("B3"),
    C1("C1"),
    C2("C2");
    
    private String licencia;

    public String getLicencia() {
        return licencia;
    }

    private LicenciasEnum(String licencia) {
        this.licencia = licencia;
    }

    @Override
    public String toString() {
        return licencia;
    }
    
}