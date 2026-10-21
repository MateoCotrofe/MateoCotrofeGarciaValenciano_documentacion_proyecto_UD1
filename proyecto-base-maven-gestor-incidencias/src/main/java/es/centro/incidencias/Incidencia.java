package es.centro.incidencias;

import java.util.Locale;

/**
 * Representa una incidencia de soporte técnico dentro del centro educativo.
 * Contiene información detallada sobre su identificador, título descriptivo,
 * nivel de prioridad y estado actual (abierta o cerrada)
 *
 * @author Mateo Cotrofe García-Valenciano
 * @version 1.0.0
 * @since 1.0.0
 */
public final class Incidencia {

    private final String id;
    private final String titulo;
    private final String prioridad;
    private final boolean abierta;

    /**
     * Construye una nueva instancia de {@code Incidencia}
     *
     * @param id Identificador único de la incidencia (ej. {@code INC-001})
     * @param titulo Descripción breve del problema o tarea
     * @param prioridad Nivel de urgencia (ej. baja, media, alta)
     * @param abierta Estado de la incidencia: {@code true} si está abierta, {@code false} si está cerrada
     */
    public Incidencia(String id, String titulo, String prioridad, boolean abierta) {
        this.id = id;
        this.titulo = titulo;
        this.prioridad = prioridad;
        this.abierta = abierta;
    }

    /**
     * Obtiene el identificador único de la incidencia
     *
     * @return El identificador de la incidencia
     */
    public String getId() {
        return id;
    }

    /**
     * Obtiene el título o descripción corta de la incidencia
     *
     * @return El título de la incidencia
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el nivel de prioridad asignado a la incidencia
     *
     * @return La prioridad de la incidencia
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * Comprueba si la incidencia se encuentra abierta
     *
     * @return {@code true} si está abierta, {@code false} en caso contrario
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Comprueba si el texto especificado coincide con el identificador o el título
     * de la incidencia (sin distinguir entre mayúsculas y minúsculas)
     *
     * @param texto Texto de búsqueda a comprobar
     * @return {@code true} si hay coincidencia; {@code false} en caso contrario
     */
    public boolean coincideCon(String texto) {
        String criterio = texto.toLowerCase(Locale.ROOT);
        return id.toLowerCase(Locale.ROOT).contains(criterio)
                || titulo.toLowerCase(Locale.ROOT).contains(criterio);
    }
}