//Rodrigo Alberto Velasco Herrera - VH1924337

package Empresa;

import java.util.Date;

// La clase Cliente hereda de la clase Persona (Uso de POO: Herencia)
class Cliente extends Persona {
    // Atributo específico de la clase Cliente
    private String tipoPersona; // Tipo de persona (por ejemplo, natural o jurídica)

    // Constructor de la clase Cliente
    public Cliente(int id, String nombre, String documentoIdentificacion, String tipoPersona, String telefono, String correo, String direccion, String estado, String creadoPor, Date fechaCreacion, Date fechaActualizacion, Date fechaInactivacion) {
        // Llama al constructor de la clase padre (Persona) usando super() (Uso de POO: Herencia y reutilización de código)
        super(id, nombre, documentoIdentificacion, telefono, correo, direccion, estado, creadoPor, fechaCreacion, fechaActualizacion, fechaInactivacion);
        // Inicializa el atributo específico de la clase Cliente
        this.tipoPersona = tipoPersona;
    }

    // Sobrescribe el método mostrarInfo() de la clase Persona (Uso de POO: Polimorfismo)
    @Override
    public String mostrarInfo() {
        return "Cliente: " + nombre + // Atributo heredado de Persona
                " - Tipo: " + tipoPersona + // Atributo específico de Cliente
                " - Teléfono: " + telefono + // Atributo heredado de Persona
                " - Correo: " + correo + // Atributo heredado de Persona
                " - Dirección: " + direccion + // Atributo heredado de Persona
                " - Estado: " + estado + // Atributo heredado de Persona
                " - Creado por: " + creadoPor + // Atributo heredado de Persona
                " - Fecha de creación: " + fechaCreacion + // Atributo heredado de Persona
                " - Fecha de actualización: " + fechaActualizacion + // Atributo heredado de Persona
                " - Fecha de inactivación: " + fechaInactivacion; // Atributo heredado de Persona
    }
}