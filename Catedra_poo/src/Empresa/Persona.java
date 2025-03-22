//Rodrigo Alberto Velasco Herrera - VH1924337

package Empresa;

import java.util.Date;

// La clase Persona es abstracta (Uso de POO: Abstracción y clases abstractas)
abstract class Persona {
    // Atributos protegidos (accesibles por las clases hijas) (Uso de POO: Encapsulamiento y herencia)
    protected int id; // Identificador único de la persona
    protected String nombre; // Nombre de la persona
    protected String documentoIdentificacion; // Documento de identificación de la persona
    protected String telefono; // Teléfono de la persona
    protected String correo; // Correo electrónico de la persona
    protected String direccion; // Dirección de la persona
    protected String estado; // Estado de la persona (por ejemplo, "Activo", "Inactivo")
    protected String creadoPor; // Usuario que creó el registro de la persona
    protected Date fechaCreacion; // Fecha de creación del registro
    protected Date fechaActualizacion; // Fecha de última actualización del registro
    protected Date fechaInactivacion; // Fecha de inactivación del registro

    // Constructor de la clase Persona
    public Persona(int id, String nombre, String documentoIdentificacion, String telefono, String correo, String direccion, String estado, String creadoPor, Date fechaCreacion, Date fechaActualizacion, Date fechaInactivacion) {
        this.id = id;
        this.nombre = nombre;
        this.documentoIdentificacion = documentoIdentificacion;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estado = estado;
        this.creadoPor = creadoPor;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.fechaInactivacion = fechaInactivacion;
    }

    // Método abstracto que debe ser implementado por las clases hijas (Uso de POO: Polimorfismo y abstracción)
    public abstract String mostrarInfo();
}