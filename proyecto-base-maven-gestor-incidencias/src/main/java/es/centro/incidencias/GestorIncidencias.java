package es.centro.incidencias;

import java.util.List;

/**
 * Gestiona el listado y las operaciones de consulta sobre las incidencias del centro.
 * Permite listar todas las incidencias, filtrar las abiertas, realizar búsquedas por texto
 * o recuperar elementos específicos de forma segura mediante excepciones.
 *
 * @author Mateo Cotrofe García-Valenciano
 * @version 1.0.0
 * @since 1.0.0
 */
public final class GestorIncidencias {

    private final List<Incidencia> incidencias;

    /**
     * Inicializa el gestor cargando un conjunto de incidencias predeterminadas de ejemplo.
     */
    public GestorIncidencias() {
        incidencias = List.of(
                new Incidencia("INC-001", "No se puede iniciar sesión", "alta", true),
                new Incidencia("INC-002", "Actualizar el navegador", "media", false),
                new Incidencia("INC-003", "Impresora sin conexión", "baja", true),
                new Incidencia("INC-004", "Fallo de red en el aula", "alta", true)
        );
    }

    /**
     * Devuelve la lista completa de incidencias registradas.
     *
     * @return Una {@link List} con todas las incidencias.
     */
    public List<Incidencia> listar() {
        return incidencias;
    }

    /**
     * Filtra y devuelve únicamente las incidencias que se encuentran en estado abierto.
     *
     * @return Una {@link List} con las incidencias abiertas.
     */
    public List<Incidencia> listarAbiertas() {
        return incidencias.stream()
                .filter(Incidencia::isAbierta)
                .toList();
    }

    /**
     * Busca incidencias cuyo identificador o título coincidan con el texto introducido.
     *
     * @param texto Texto o palabra clave a buscar.
     * @return Una {@link List} con las incidencias que coinciden con el criterio.
     */
    public List<Incidencia> buscar(String texto) {
        return incidencias.stream()
                .filter(incidencia -> incidencia.coincideCon(texto))
                .toList();
    }

    /**
     * Busca una incidencia específica a partir de su identificador único.
     *
     * @param id Identificador único de la incidencia.
     * @return La {@link Incidencia} encontrada.
     * @throws IncidenciaNoEncontradaException si no existe ninguna incidencia con ese ID.
     */
    public Incidencia buscarPorId(String id) throws IncidenciaNoEncontradaException {
        return incidencias.stream()
                .filter(incidencia -> incidencia.getId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new IncidenciaNoEncontradaException(id));
    }

    /**
     * @deprecated Desde la versión 1.0.0, este método está obsoleto porque oculta los errores
     * devolviendo {@code null} en lugar de propagar la excepción.
     * Utilice {@link #buscarPorId(String)} en su lugar para gestionar correctamente el error mediante
     * {@link IncidenciaNoEncontradaException}.
     *
     * @param id Identificador de la incidencia.
     * @return La incidencia encontrada o {@code null} si no se encuentra.
     * @see #buscarPorId(String)
     */
    @Deprecated(since = "1.0.0", forRemoval = false)
    public Incidencia obtenerIncidencia(String id) {
        try {
            return buscarPorId(id);
        } catch (IncidenciaNoEncontradaException excepcion) {
            return null;
        }
    }
}