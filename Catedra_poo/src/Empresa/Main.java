//Rodrigo Alberto Velasco Herrera - VH1924337

package Empresa;

import java.util.Date;

class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1, "Empresa XYZ", "12345678", "Corporativo", "123456789", "correo@empresa.com", "Calle 123", "activo", "Admin", new Date(), new Date(), null);
        Cotizacion cotizacion1 = new Cotizacion(1, cliente1, 100, 4000.0, 1000.0, "en proceso");
        Empleado empleado1 = new Empleado(1, "Juan Perez", "87654321", "Tiempo Completo", "987654321", "juan@empresa.com", "Avenida 456", "activo", "Admin", new Date(), new Date(), null);
        Asignacion asignacion1 = new Asignacion(1, cotizacion1, empleado1, "Desarrollo Backend", "IT", 50, 20.0, 100.0);
        Subtarea subtarea1 = new Subtarea(1, asignacion1, "Implementación API", "Crear endpoints para usuarios");

        Cliente cliente2 = new Cliente(2, "Empresa ABC", "23456789", "Corporativo", "234567890", "correo@empresaabc.com", "Calle 234", "activo", "Admin", new Date(), new Date(), null);
        Cotizacion cotizacion2 = new Cotizacion(2, cliente2, 200, 8000.0, 2000.0, "en proceso");
        Empleado empleado2 = new Empleado(2, "Ana Gomez", "98765432", "Medio Tiempo", "876543210", "ana@empresa.com", "Avenida 789", "activo", "Admin", new Date(), new Date(), null);
        Asignacion asignacion2 = new Asignacion(2, cotizacion2, empleado2, "Desarrollo Frontend", "IT", 60, 25.0, 150.0);
        Subtarea subtarea2 = new Subtarea(2, asignacion2, "Implementación UI", "Crear interfaces de usuario");


        String mensaje = cliente1.mostrarInfo() + "\n" +
                cotizacion1.mostrarInfo() + "\n" +
                empleado1.mostrarInfo() + "\n" +
                asignacion1.mostrarInfo() + "\n" +
                subtarea1.mostrarInfo() + "\n\n" +
                cliente2.mostrarInfo() + "\n" +
                cotizacion2.mostrarInfo() + "\n" +
                empleado2.mostrarInfo() + "\n" +
                asignacion2.mostrarInfo() + "\n" +
                subtarea2.mostrarInfo() + "\n\n" +


        System.out.println(mensaje);
        System.out.println("Los datos se ingresaron correctamente.");
    }
}