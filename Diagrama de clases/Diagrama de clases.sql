/*
Aquí esta lo necesario para crear la base de datos del proyecto
Creado por:
Emerson Gudiel---GM171814
Manuel Velásquez---CV211229
Joel Aguilar---AC223047
Rodrigo Herrera---VH192433
Kevin Del Cid---DP191337
*/

-- Crear la base de datos
CREATE DATABASE MultiWorksDB;
USE MultiWorksDB;

-- Tabla de clientes
CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY, -- Llave primaria autoincremental
    nombre VARCHAR(45) NOT NULL,
    documento_identificacion VARCHAR(10) UNIQUE NOT NULL, -- Debe ser único
    tipo_persona VARCHAR(25) NOT NULL,
    telefono VARCHAR(20),
    correo VARCHAR(50),
    direccion TEXT, -- Se usa TEXT en lugar de NVARCHAR(MAX)
    estado VARCHAR(10) NOT NULL DEFAULT 'activo', -- Valor por defecto
    creado_por VARCHAR(45) NOT NULL,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP, -- Fecha de creación automática
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP, -- Se actualiza automáticamente
    fecha_inactivacion DATETIME NULL -- Puede ser nulo
);

-- Tabla de empleados
CREATE TABLE empleados (
    id_empleado INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL,
    documento_identificacion VARCHAR(10) UNIQUE NOT NULL,
    tipo_persona VARCHAR(25) NOT NULL,
    tipo_contratacion VARCHAR(25) NOT NULL,
    telefono VARCHAR(20),
    correo VARCHAR(50),
    direccion TEXT,
    estado VARCHAR(10) NOT NULL DEFAULT 'activo',
    creado_por VARCHAR(45) NOT NULL,
    fecha_creacion DATETIME DEFAULT CURRENT_TIMESTAMP,
    fecha_actualizacion DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    fecha_inactivacion DATETIME NULL
);

-- Tabla de cotizaciones
CREATE TABLE cotizaciones (
    id_cotizacion INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    cantidad_horas INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    costo_asignaciones DECIMAL(10,2) NOT NULL,
    costos_adicionales DECIMAL(10,2) NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    estado VARCHAR(15) NOT NULL DEFAULT 'en proceso',
    CONSTRAINT fk_cotizaciones_clientes FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE
);

-- Tabla de asignaciones
CREATE TABLE asignaciones (
    id_asignacion INT AUTO_INCREMENT PRIMARY KEY,
    id_cotizacion INT NOT NULL,
    titulo_actividad VARCHAR(100) NOT NULL,
    id_empleado INT NOT NULL,
    area_asignada VARCHAR(50) NOT NULL,
    costo_por_hora DECIMAL(10,2) NOT NULL,
    fecha_inicio DATETIME NOT NULL,
    fecha_fin DATETIME NOT NULL,
    cantidad_horas INT NOT NULL,
    costo_base DECIMAL(10,2) NOT NULL,
    incremento_extra DECIMAL(5,2) NOT NULL,
    total DECIMAL(10,2) NOT NULL,
    CONSTRAINT fk_asignaciones_cotizaciones FOREIGN KEY (id_cotizacion) REFERENCES cotizaciones(id_cotizacion) ON DELETE CASCADE,
    CONSTRAINT fk_asignaciones_empleados FOREIGN KEY (id_empleado) REFERENCES empleados(id_empleado) ON DELETE CASCADE
);

-- Tabla de subtareas
CREATE TABLE subtareas (
    id_subtarea INT AUTO_INCREMENT PRIMARY KEY,
    id_asignacion INT NOT NULL,
    titulo_subtarea VARCHAR(50) NOT NULL,
    descripcion TEXT NOT NULL,
    CONSTRAINT fk_subtareas_asignaciones FOREIGN KEY (id_asignacion) REFERENCES asignaciones(id_asignacion) ON DELETE CASCADE
);

-- Inserción de datos en clientes
INSERT INTO clientes (nombre, documento_identificacion, tipo_persona, telefono, correo, direccion, creado_por)
VALUES ('Square Enix Company', 'SEC042003', 'Empresarial', '+81 1-800-715-2450', 'creators@us.square-enix.com', 'Shibuya, Tokio, Japón', 'Yasuhiro Fukushima, Masashi Miyamoto');

-- Inserción de empleados
INSERT INTO empleados (nombre, documento_identificacion, tipo_persona, tipo_contratacion, telefono, correo, direccion, creado_por)
VALUES 
('Joel Aguilar', 'AC223047', 'Natural', 'Permanente', '+503 6163-7484', 'ac223047@alumno.udb.edu.sv', 'Dirección Joel', 'Admin'),
('Emerson Gudiel', 'GM171814', 'Natural', 'Permanente', '+503 7296-6192', 'emerson_gudiel@yahoo.es', 'Dirección Emerson', 'Admin'),
('Manuel Velásquez', 'CV211229', 'Natural', 'Permanente', '+503 7580-1138', 'manuelitovelasquez1332@gmail.com', 'Dirección Manuel', 'Admin'),
('Rodrigo Herrera', 'VH192433', 'Natural', 'Por Horas', '+503 7236-9961', 'rodriherrera037@gmail.com', 'Dirección Rodrigo', 'Admin'),
('Kevin Del Cid', 'DP191337', 'Natural', 'Por Horas', '+503 7599-2211', 'kevin_alexander25@hotmail.com', 'Dirección Kevin', 'Admin');

-- Inserción en cotizaciones
INSERT INTO cotizaciones (id_cliente, cantidad_horas, fecha_inicio, fecha_fin, costo_asignaciones, costos_adicionales, total)
VALUES (1, 40, '2025-01-01', '2025-01-08', 1000.00, 200.00, 1200.00);

-- Inserción en asignaciones
INSERT INTO asignaciones (id_cotizacion, titulo_actividad, id_empleado, area_asignada, costo_por_hora, fecha_inicio, fecha_fin, cantidad_horas, costo_base, incremento_extra, total)
VALUES (1, 'Implementación de cableado', 1, 'Redes', 25.00, '2025-01-01 08:00:00', '2025-01-05 17:00:00', 40, 1000.00, 10.00, 1100.00);

-- Inserción en subtareas
INSERT INTO subtareas (id_asignacion, titulo_subtarea, descripcion)
VALUES (1, 'Crear red de datos', 'Se realizará la instalación del cableado estructurado para la red de datos en la empresa.');
