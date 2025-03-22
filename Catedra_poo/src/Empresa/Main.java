//Rodrigo Alberto Velasco Herrera - VH1924337

//Manuel Alejandro Chavarria Velasquez CV211229
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

        Cliente cliente3 = new Cliente(3, "Empresa DEF", "34567890", "Corporativo", "345678901", "correo@empresadef.com", "Calle 345", "activo", "Admin", new Date(), new Date(), null);
        Cotizacion cotizacion3 = new Cotizacion(3, cliente3, 300, 12000.0, 3000.0, "en proceso");
        Empleado empleado3 = new Empleado(3, "Carlos Ruiz", "87654322", "Tiempo Completo", "765432109", "carlos@empresa.com", "Avenida 123", "activo", "Admin", new Date(), new Date(), null);
        Asignacion asignacion3 = new Asignacion(3, cotizacion3, empleado3, "Desarrollo Mobile", "IT", 70, 30.0, 200.0);
        Subtarea subtarea3 = new Subtarea(3, asignacion3, "Implementación App", "Crear aplicación móvil");

        Cliente cliente4 = new Cliente(4, "Empresa GHI", "45678901", "Corporativo", "456789012", "correo@empresaghi.com", "Calle 456", "activo", "Admin", new Date(), new Date(), null);
        Cotizacion cotizacion4 = new Cotizacion(4, cliente4, 400, 16000.0, 4000.0, "en proceso");
        Empleado empleado4 = new Empleado(4, "Laura Martinez", "76543210", "Medio Tiempo", "654321098", "laura@empresa.com", "Avenida 456", "activo", "Admin", new Date(), new Date(), null);
        Asignacion asignacion4 = new Asignacion(4, cotizacion4, empleado4, "Desarrollo DevOps", "IT", 80, 35.0, 250.0);
        Subtarea subtarea4 = new Subtarea(4, asignacion4, "Implementación CI/CD", "Crear pipelines de CI/CD");

        Cliente cliente5 = new Cliente(5, "Empresa JKL", "56789012", "Corporativo", "567890123", "correo@empresajkl.com", "Calle 567", "activo", "Admin", new Date(), new Date(), null);
        Cotizacion cotizacion5 = new Cotizacion(5, cliente5, 500, 20000.0, 5000.0, "en proceso");
        Empleado empleado5 = new Empleado(5, "Miguel Torres", "65432109", "Tiempo Completo", "543210987", "miguel@empresa.com", "Avenida 789", "activo", "Admin", new Date(), new Date(), null);
        Asignacion asignacion5 = new Asignacion(5, cotizacion5, empleado5, "Desarrollo QA", "IT", 90, 40.0, 300.0);
        Subtarea subtarea5 = new Subtarea(5, asignacion5, "Implementación Pruebas", "Crear pruebas automatizadas");

        String mensaje =
                cliente1.mostrarInfo() + "\n" +
                cotizacion1.mostrarInfo() + "\n" +
                empleado1.mostrarInfo() + "\n" +
                asignacion1.mostrarInfo() + "\n" +
                subtarea1.mostrarInfo() + "\n\n" +
                cliente2.mostrarInfo() + "\n" +
                cotizacion2.mostrarInfo() + "\n" +
                empleado2.mostrarInfo() + "\n" +
                asignacion2.mostrarInfo() + "\n" +
                subtarea2.mostrarInfo() + "\n\n" +
                cliente3.mostrarInfo() + "\n" +
                cotizacion3.mostrarInfo() + "\n" +
                empleado3.mostrarInfo() + "\n" +
                asignacion3.mostrarInfo() + "\n" +
                subtarea3.mostrarInfo() + "\n\n" +
                cliente4.mostrarInfo() + "\n" +
                cotizacion4.mostrarInfo() + "\n" +
                empleado4.mostrarInfo() + "\n" +
                asignacion4.mostrarInfo() + "\n" +
                subtarea4.mostrarInfo() + "\n\n" +
                cliente5.mostrarInfo() + "\n" +
                cotizacion5.mostrarInfo() + "\n" +
                empleado5.mostrarInfo() + "\n" +
                asignacion5.mostrarInfo() + "\n" +
                subtarea5.mostrarInfo();

        System.out.println(mensaje);
        System.out.println("Los datos se ingresaron correctamente.");
    }
}