package es.centro.incidencias;

/**
 * Excepción personalizada que se lanza cuando se realiza una búsqueda de una incidencia
 * por su identificador único y esta no existe en el sistema
 *
 * @author Mateo Cotrofe García-Valenciano
 * @version 1.0.0
 * @since 1.0.0
 * @see GestorIncidencias#buscarPorId(String)
 */
public class IncidenciaNoEncontradaException extends Exception {

    /**
     * Construye una nueva excepción indicando el identificador que no ha sido encontrado
     *
     * @param id Identificador de la incidencia que provocó el error
     */
    public IncidenciaNoEncontradaException(String id) {
        super("No existe ninguna incidencia con el identificador " + id + ".");
    }
}