CREATE TABLE cobrador (
  idCobrador INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nombre VARCHAR(20)  NULL    ,
PRIMARY KEY(idCobrador));



CREATE TABLE Usuario (
  idUsuario INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  nombre VARCHAR(20)  NOT NULL  ,
  clave VARCHAR(255)  NOT NULL  ,
  tipo VARCHAR(20)  NOT NULL    ,
PRIMARY KEY(idUsuario));



CREATE TABLE deudor (
  idDeudor INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  cobrador_idCobrador INTEGER UNSIGNED  NOT NULL  ,
  nombre VARCHAR(20)  NULL  ,
  direccion VARCHAR(20)  NULL  ,
  saldo FLOAT  NULL    ,
PRIMARY KEY(idDeudor, cobrador_idCobrador)  ,
INDEX deudor_FKIndex1(cobrador_idCobrador),
  FOREIGN KEY(cobrador_idCobrador)
    REFERENCES cobrador(idCobrador)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE abono (
  id INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  deudor_idDeudor INTEGER UNSIGNED  NOT NULL  ,
  deudor_cobrador_idCobrador INTEGER UNSIGNED  NOT NULL  ,
  cantidad FLOAT  NULL  ,
  fecha DATE  NULL    ,
PRIMARY KEY(id, deudor_idDeudor, deudor_cobrador_idCobrador)  ,
INDEX abono_FKIndex1(deudor_idDeudor, deudor_cobrador_idCobrador),
  FOREIGN KEY(deudor_idDeudor, deudor_cobrador_idCobrador)
    REFERENCES deudor(idDeudor, cobrador_idCobrador)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);



CREATE TABLE deuda (
  idDeuda INTEGER UNSIGNED  NOT NULL   AUTO_INCREMENT,
  deudor_cobrador_idCobrador INTEGER UNSIGNED  NOT NULL  ,
  deudor_idDeudor INTEGER UNSIGNED  NOT NULL  ,
  monto FLOAT  NULL  ,
  fecha INTEGER UNSIGNED  NULL    ,
PRIMARY KEY(idDeuda, deudor_cobrador_idCobrador, deudor_idDeudor)  ,
INDEX deuda_FKIndex1(deudor_idDeudor, deudor_cobrador_idCobrador),
  FOREIGN KEY(deudor_idDeudor, deudor_cobrador_idCobrador)
    REFERENCES deudor(idDeudor, cobrador_idCobrador)
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);




