//Rodrigo Alberto Velasco Herrera - VH1924337

package Empresa;

import java.util.Date;

// La clase Empleado hereda de la clase Persona (Uso de POO: Herencia)
class Empleado extends Persona {
    // Atributo específico de la clase Empleado
    private String tipoContratacion; // Tipo de contratación del empleado (por ejemplo, "Tiempo Completo", "Medio Tiempo")

    // Constructor de la clase Empleado
    public Empleado(int id, String nombre, String documentoIdentificacion, String tipoContratacion, String telefono, String correo, String direccion, String estado, String creadoPor, Date fechaCreacion, Date fechaActualizacion, Date fechaInactivacion) {
        // Llama al constructor de la clase padre (Persona) usando super() (Uso de POO: Herencia y reutilización de código)
        super(id, nombre, documentoIdentificacion, telefono, correo, direccion, estado, creadoPor, fechaCreacion, fechaActualizacion, fechaInactivacion);
        // Inicializa el atributo específico de la clase Empleado
        this.tipoContratacion = tipoContratacion;
    }

    // Sobrescribe el método mostrarInfo() de la clase Persona (Uso de POO: Polimorfismo)
    @Override
    public String mostrarInfo() {
        return "Empleado: " + nombre + // Atributo heredado de Persona
                " - Contratación: " + tipoContratacion + // Atributo específico de Empleado
                " - Teléfono: " + telefono + // Atributo heredado de Persona
                " - Correo: " + correo + // Atributo heredado de Persona
                " - Dirección: " + direccion + // Atributo heredado de Persona
                " - Estado: " + estado + // Atributo heredado de Persona
                " - Creado por: " + creadoPor + // Atributo heredado de Persona
                " - Fecha de Creación: " + fechaCreacion + // Atributo heredado de Persona
                " - Fecha de Actualización: " + fechaActualizacion + // Atributo heredado de Persona
                " - Fecha de Inactivación: " + fechaInactivacion; // Atributo heredado de Persona
    }
}