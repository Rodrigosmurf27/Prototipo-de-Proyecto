//Manuel Alejandro Chavarria Velasquez CV211229
package Empresa;

class Asignacion {
    // Atributos de la clase Asignacion
    private int idAsignacion; // Identificador único de la asignación
    private Cotizacion cotizacion; // Objeto de tipo Cotizacion asociado a la asignación (Uso de POO: Composición)
    private Empleado empleado; // Objeto de tipo Empleado asociado a la asignación (Uso de POO: Composición)
    private String tituloActividad; // Título de la actividad asignada
    private String areaAsignada; // Área a la que se asigna la actividad
    private int cantidadHoras; // Cantidad de horas asignadas para la actividad
    private double costoPorHora; // Costo por hora de la actividad
    private double incrementoExtra; // Incremento adicional al costo total
    private double total; // Costo total de la asignación (calculado automáticamente)

    // Constructor de la clase Asignacion
    public Asignacion(int idAsignacion, Cotizacion cotizacion, Empleado empleado, String tituloActividad, String areaAsignada, int cantidadHoras, double costoPorHora, double incrementoExtra) {
        this.idAsignacion = idAsignacion; // Asigna el ID de la asignación
        this.cotizacion = cotizacion; // Asigna la cotización asociada (Uso de POO: Relación entre objetos)
        this.empleado = empleado; // Asigna el empleado asociado (Uso de POO: Relación entre objetos)
        this.tituloActividad = tituloActividad; // Asigna el título de la actividad
        this.areaAsignada = areaAsignada; // Asigna el área asignada
        this.cantidadHoras = cantidadHoras; // Asigna la cantidad de horas
        this.costoPorHora = costoPorHora; // Asigna el costo por hora
        this.incrementoExtra = incrementoExtra; // Asigna el incremento extra
        this.total = (cantidadHoras * costoPorHora) + incrementoExtra; // Calcula el costo total (Uso de POO: Encapsulamiento de lógica)
    }

    // Método que devuelve una cadena con la información de la asignación
    public String mostrarInfo() {
        return "Asignación ID: " + idAsignacion +
                " - Cotización: " + cotizacion.toString() + // Muestra la información de la cotización (Uso de POO: Reutilización de métodos)
                " - Empleado: " + empleado.toString() + // Muestra la información del empleado (Uso de POO: Reutilización de métodos)
                " - Título Actividad: " + tituloActividad +
                " - Área Asignada: " + areaAsignada +
                " - Cantidad de Horas: " + cantidadHoras +
                " - Costo por Hora: " + costoPorHora +
                " - Incremento Extra: " + incrementoExtra +
                " - Total: " + total; // Muestra el costo total calculado
    }
}