create database empresadservicios;

use empresadservicios;

create table FACTURA
(
cod_fact int not null,
VlrLitroAgua_fact int not null,
VlrKilvLuz_fact int not null,
FechInicio_fact date not null,
FechFinal_fact date not null,
identificacion_fact int not null,
direccion_fact varchar (80) not null,
nombrecompleto_fact varchar (80) not null,
Apellido1_fact varchar (80) not null,
Apellido2_fact varchar(80),
primary key (cod_fact)
);

create table USUARIO
(
idUsuar_usu integer not null,
identificacion_usu int not null,
direccion_usu varchar (80) not null,
nombrecompleto_usu varchar (80) not null,
Apellido1_usus varchar (80) not null,
Apellido2_usu varchar(80),
cod_fact int not null,
primary key (idUsuar_usu),
foreign key (cod_fact) references FACTURA (cod_fact)
);

create table CONTABLES
(
idContadorCliente_cont int,
precioKilvLuz_cont int,
precioLitrAgua_cont int ,
idCuentaIngreso_cont int ,
idCuentaCXC_cont int,
idCuentaActivoLuz_cont int ,
idCuentaActivoagua_cont int ,
idCuentaPasivoLuz_cont int ,
idCuentaPasivoAgua_cont int ,
CantidadKilvLuz_cont int ,
CantidadLitrAgua_cont int,
cod_fact int not null,
primary key (idContadorCliente_cont),
foreign key (cod_fact) references FACTURA (cod_fact)
);

create table CONTADORES
(
idcontadores_conts int,
cantidadAguaxLitro_conts int,
cantidadLuzxKilv_conts int,
idcontsAgua_conts int,
idcontsLuz_conts int,
idContadorCliente_cont int,
cod_fact int not null,
primary key (idcontadores_conts),
foreign key (cod_fact) references FACTURA (cod_fact)
);

show tables;

insert into FACTURA(cod_fact,VlrLitroAgua_fact,VlrKilvLuz_fact,FechInicio_fact,FechFinal_fact,identificacion_fact,direccion_fact,nombrecompleto_fact,Apellido1_fact,Apellido2_fact) values (0001,1500,2000,"2025-01-01","2025-01-31",76543222,"cl 34","Leonardo Rincon","sanchez","parra");
insert into FACTURA(cod_fact,VlrLitroAgua_fact,VlrKilvLuz_fact,FechInicio_fact,FechFinal_fact,identificacion_fact,direccion_fact,nombrecompleto_fact,Apellido1_fact,Apellido2_fact) values (0002,1500,2000,"2025-01-01","2025-01-31",4323455,"cr 54","Mariana","Dias","Mora");
SELECT * FROM FACTURA;

insert into USUARIO(idUsuar_usu,identificacion_usu,direccion_usu,nombrecompleto_usu,Apellido1_usus,Apellido2_usu,cod_fact) values (0100,76543222,"cl 34","Leonardo Rincon","sanchez","parra",0001);
insert into USUARIO(idUsuar_usu,identificacion_usu,direccion_usu,nombrecompleto_usu,Apellido1_usus,Apellido2_usu,cod_fact) values (0110,4323455,"cr 54","Mariana","Dias","Mora",0002);

SELECT * FROM USUARIO;

insert into CONTADORES(idcontadores_conts,cantidadAguaxLitro_conts,cantidadLuzxKilv_conts,idcontsAgua_conts,idcontsLuz_conts,idContadorCliente_cont,cod_fact) values (0100,234,432,010100,020100,010,000001);
insert into CONTADORES(idcontadores_conts,cantidadAguaxLitro_conts,cantidadLuzxKilv_conts,idcontsAgua_conts,idcontsLuz_conts,idContadorCliente_cont,cod_fact) values (0110,987,657,020100,020200,020,000002);

insert into CONTABLES(idContadorCliente_cont,precioKilvLuz_cont,precioLitrAgua_cont,idCuentaIngreso_cont,idCuentaCXC_cont,idCuentaActivoLuz_cont,idCuentaActivoagua_cont,idCuentaPasivoLuz_cont,idCuentaPasivoAgua_cont,CantidadKilvLuz_cont,CantidadLitrAgua_cont,cod_fact) values (010,2000,1500,9001,2001,3001,3002,2010,2020,432,554,000001);
insert into CONTABLES(idContadorCliente_cont,precioKilvLuz_cont,precioLitrAgua_cont,idCuentaIngreso_cont,idCuentaCXC_cont,idCuentaActivoLuz_cont,idCuentaActivoagua_cont,idCuentaPasivoLuz_cont,idCuentaPasivoAgua_cont,CantidadKilvLuz_cont,CantidadLitrAgua_cont,cod_fact) values (020,2000,1500,9001,2001,3001,3002,2010,2020,567,654,000002);
SELECT * FROM CONTABLES;