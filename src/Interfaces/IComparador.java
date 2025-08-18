package Interfaces;

/**
 * @author Greivin
 */
public interface IComparador<T> {
    /**
     * Compara este objeto con otro del mismo tipo.
     * Devuelve un valor negativo, cero o positivo si este objeto
     * es menor, igual o mayor que el objeto especificado.
     */
    public int compareTo(T t);
}
