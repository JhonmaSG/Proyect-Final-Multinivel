CREATE TABLE EMPLEADO (
  `Id_Em` INT PRIMARY KEY NOT NULL,
  `Nombre_Em` VARCHAR(30) NOT NULL,
  `Apellido_Em` VARCHAR(30) NOT NULL,
  `Cargo` VARCHAR(30) NOT NULL,
  'Tel_Em' DOUBLE NOT NULL,
  'correo_Em' VARCHAR(45) NOT NULL,
  `Des_Pension` DOUBLE NOT NULL,
  `Des_Salud` DOUBLE NOT NULL,
  `Salario` DOUBLE NOT NULL
  );
  
CREATE TABLE INVENTARIO (
  `Cod_Mp` DOUBLE PRIMARY KEY NOT NULL DEFAULT 123456,
  `Nombre_Mp` VARCHAR(45) NOT NULL DEFAULT 'algodon',
  `Descrip_Mp` VARCHAR(50) NOT NULL DEFAULT 'algodon',
  `Cant_Exist_Mp` INT NOT NULL DEFAULT 100
  );

  CREATE TABLE FACTURAS (
  `No_Fv` INT NOT NULL,
  `Fecha_Hora_Fv` DATETIME NOT NULL,
  `Descrip_Fv` VARCHAR(50) NOT NULL,
  'Metodo_Fv' VARCHAR(20) NOT NULL,
  `Total_Pagar_Fv` DOUBLE NOT NULL
  );
  

INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1000, 'Lana','', 5);
INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1050, 'Sintetico','', 6);
INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1100, 'Cuero','', 3);
INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1150, 'Cuerina','', 4);
INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1200, 'Tela','', 2);
INSERT INTO INVENTARIO (Cod_Mp, Nombre_Mp, Descrip_Mp, Cant_Exist_Mp) VALUES (1320, 'Impermeable','', 6);
-- SELECT * FROM INVENTARIO;

INSERT INTO EMPLEADO (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario) 
VALUES (111, 'Daniel', 'Gutierrez','Costurero',3204516582, 'danielgutierres@gmail.com',44000,44000, 1200000);
INSERT INTO EMPLEADO (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario) 
VALUES (153, 'Carlos', 'Ramirez','Costurero',3104782154,'carlosramirez@gmail.com',44000,44000, 1200000);
INSERT INTO EMPLEADO (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario) 
VALUES (172, 'Alejandro', 'Cuerdo','Control de Calidad',3058951240,'alejandrocuerdo@hotmail.com',44000,44000, 1200000);
INSERT INTO EMPLEADO (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario) 
VALUES (182, 'Maria', 'Sanchez','Costurero',3186400201,'mariosanchez@hotmail.com',44000,44000, 1200000);
INSERT INTO EMPLEADO (Id_Em, Nombre_Em, Apellido_Em, Cargo, Tel_Em, correo_Em ,Des_Pension, Des_Salud, Salario) 
VALUES (195, 'Angela', 'Perez','Fileteador',3209761240,'angelaperez@gmail.com',44000,44000, 1200000);
-- SELECT * FROM EMPLEADO;

INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (100,'2023-04-05 09:10:00','Efectivo' , '',  1000000);
INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (101,'2023-04-20 12:05:00','Tarjeta' , '', 'Tarjeta' , 950000);
INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (102,'2023-04-27 15:00:00','Efectivo' , '', 'Efectivo' , 1200000);
INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (103,'2023-05-05 11:55:00','Tarjeta' , '', 'Tarjeta' , 1500000);
INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (104,'2023-05-10 12:30:00','Efectivo' , '', 'Efectivo' , 2000000);
INSERT INTO FACTURAS(No_Fv, Fecha_Hora_Fv, Metodo_Fv, Descrip_Fv ,Total_Pagar_Fv) VALUES (105,'2023-05-10 11:30:00','Efectivo' , '', 'Efectivo' , 2000000);
-- SELECT * FROM FACTURAS;