//Manuel Alejandro Chavarria Velasquez CV211229
package Empresa;

class Subtarea {
    // Atributos de la clase Subtarea
    private int idSubtarea; // Identificador único de la subtarea
    private Asignacion asignacion; // Objeto de tipo Asignacion asociado a la subtarea (Uso de POO: Composición)
    private String tituloSubtarea; // Título de la subtarea
    private String descripcion; // Descripción de la subtarea

    // Constructor de la clase Subtarea
    public Subtarea(int idSubtarea, Asignacion asignacion, String tituloSubtarea, String descripcion) {
        this.idSubtarea = idSubtarea; // Asigna el ID de la subtarea
        this.asignacion = asignacion; // Asigna la asignación asociada (Uso de POO: Relación entre objetos)
        this.tituloSubtarea = tituloSubtarea; // Asigna el título de la subtarea
        this.descripcion = descripcion; // Asigna la descripción de la subtarea
    }

    // Método que devuelve una cadena con la información de la subtarea
    public String mostrarInfo() {
        return "Subtarea ID: " + idSubtarea +
                " - Título: " + tituloSubtarea +
                " - Descripción: " + descripcion +
                " - Asignación: " + asignacion; // Muestra la información de la asignación asociada (Uso de POO: Reutilización de objetos)
    }
}