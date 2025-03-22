//Manuel Alejandro Chavarria Velasquez CV211229
package Empresa;

class Cotizacion {
    // Atributos de la clase Cotizacion
    private int idCotizacion; // Identificador único de la cotización
    private Cliente cliente; // Objeto de tipo Cliente asociado a la cotización (Uso de POO: Composición)
    private int cantidadHoras; // Cantidad de horas cotizadas
    private double costoAsignaciones; // Costo base de las asignaciones
    private double costosAdicionales; // Costos adicionales
    private double total; // Total de la cotización (calculado automáticamente)
    private String estado; // Estado de la cotización (por ejemplo, "Pendiente", "Aprobada", "Rechazada")

    // Constructor de la clase Cotizacion
    public Cotizacion(int idCotizacion, Cliente cliente, int cantidadHoras, double costoAsignaciones, double costosAdicionales, String estado) {
        this.idCotizacion = idCotizacion; // Asigna el ID de la cotización
        this.cliente = cliente; // Asigna el cliente asociado (Uso de POO: Relación entre objetos)
        this.cantidadHoras = cantidadHoras; // Asigna la cantidad de horas
        this.costoAsignaciones = costoAsignaciones; // Asigna el costo base de las asignaciones
        this.costosAdicionales = costosAdicionales; // Asigna los costos adicionales
        this.estado = estado; // Asigna el estado de la cotización
        this.total = calcularTotal(); // Calcula el total de la cotización (Uso de POO: Encapsulamiento de lógica)
    }

    // Método para calcular el total de la cotización
    public double calcularTotal() {
        return costoAsignaciones + costosAdicionales; // Suma el costo base y los costos adicionales
    }

    // Método que devuelve una cadena con la información de la cotización
    public String mostrarInfo() {
        return "Cotización ID: " + idCotizacion +
                " - Cliente: " + cliente.nombre + // Muestra el nombre del cliente (Uso de POO: Acceso a atributos de otro objeto)
                " - Cantidad de Horas: " + cantidadHoras +
                " - Costo Asignaciones: " + costoAsignaciones +
                " - Costos Adicionales: " + costosAdicionales +
                " - Total: " + total +
                " - Estado: " + estado;
    }
}