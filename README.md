# AirUs
# Proyecto realizado con JSP, Servlets y JPA para el RTF 1 de Arquitectura de Software, Universidad de Antioquia, 2015.1.

# Proyecto General

Una importante Aerolínea que provee servicios a nivel global desea desarrollar un nuevo sistema integrado para la gestión de vuelos, reservas y socios.

Dentro del alcance de dicho sistema se incluye: 

1. Puntos de venta: Estos puntos de venta proveerán servicios de compra y reserva de pasajes, y gestión de socios. Existirán entre 5 y 20 oficinas de la Aerolínea en al menos 100 ciudades del mundo.

2. Servicios on-line: A partir de una aplicación Web se proveerán servicios de compra y reserva de pasajes. Es posible que se puedan hacer check – in a través del móvil del usuario.

3. Gestión en aeropuertos: En cada aeropuerto existirán entre 10 y 50 computadores ubicados en los puntos de check-in y en las puertas de embarque que serán utilizados por empleados de la aerolínea.

4. Gestión Operativa: Las mismas del punto anterior.

5.  Aplicación Movil.  El usuario podrá hacer consulta de vuelos, reservas, pagos y check in por medio de su smatphone o tablet. Cabe anotar que el check -  in tendrá generado además un código QR para escaneo en los filtros del aeropuerto. 

6. Seguridad: El módulo estará formado por: la definición y configuración de un certificado digital mediante SSL (Secure Socket Layer) y por medio del protocolo HTTPS que deberá instalarse en el servidor de aplicaciones; además, comprenderá la definición de políticas de acceso, autenticación y autorización de usuarios del sistema, los cuales estarán configurados por roles. También se deberá configurar el acceso por sesiones, las cuales estarán gestionadas por el servidor de aplicaciones. El sistema contendrá una pantalla de ingreso con login y password (Este deberá estar debidamente encriptado en la base de datos). 

Este módulo realizará la integración de los demás módulos del sistema garantizando que los roles de los usuarios se ajusten a las 

distintas opciones de cada menú o formulario. Se contempla la identificación y desarrollo de los casos de uso relacionados con la seguridad así como el análisis de requisitos y el diseño del modulo.

# Servicios on-line [Modulo programado en este repositorio]

Se deberá proveer los siguientes servicios a los clientes mediante una aplicación web: 

1. RF1. Consulta de vuelos (itinerarios, tarifas, disponibilidad de asientos, etc.) 

2. RF2. Reserva y compra crédito de pasajes (compra pasaje con tarjeta crédito). 

3. RF3. Compra y canje de millas (compra pasaje con millas). 

4. RF4. Registro de socios. 

5. RF5. Modificación datos socios. 

6- RF6- Reserva de sillas en la cabina. (Tener en cuenta si es clase turista o ejecutiva)

7- RF7. Realización de check-in por el móvil del usuario (Requisito opcional).

8- RF8- Generación e impresión de pasabordo del usuario con código de barras de control. 

Los requerimientos funcionales RF3 y RF5 requieren que el usuario previamente se autentique en el sistema utilizando su 

identificador de socio y contraseña. Para estos requerimientos además, el sistema deberá enviar al socio un correo electrónico 

notificando el resultado de la transacción. 

Los aspectos de seguridad son vitales para lograr una buena imagen de la empresa y para que los socios puedan utilizar los 

servicios on-line frecuentemente sin riesgos. 

Adicionalmente, debido a la intensa competencia que presentan otras aerolíneas, es deseable que el sitio web sea sumamente 

eficiente y visualmente atractivo para los usuarios. Por eso mismo también es necesario lograr que los usuarios se familiaricen 

rápidamente con el sistema on-line y que el mismo esté disponible las 24 horas del día, los 7 días de la semana.

Restricciones Técnicas

El sistema será implementado utilizando el lenguaje Java con las APIs de JEE ver 6 o 7. El IDE será Netbeans 7.3 o superior . El 

servidor de Aplicaciones será Glasfish ver 3 .1  o superior. 

El sistema deberá contar con por lo menos 5 capas definidas de la siguiente manera:

1. Capa Web: Deberá utilizarse el framework JSF 2.2 con PRIMEFACES. 

2. Capa Seguridad: Estará compuesta por un componente de acceso por login y password utilizando roles y permisos 

de acceso. Esta capa incluye la autenticación, autorización e integración con todos los módulos del sistema. También 

deberá utilizarse certificados digitales. Se recomienda un sistema centralizado de control de usuarios por medio de 

directorios activos como LDAP, por lo que se utilizará el software OpenDS (Opensource). 

3. Capa Lógica de Negocio: Estará compuesta por Session Beans. 

4. Capa Persistencia: Estará compuesta por Entity Beans y utilizarà un framework de acceso a datos y ORM (Object 

Relational Mapping) como Hibernate o JPA.

5. Capa de Datos: Esta compuesta por las entidades y relaciones que integran  la Base de Datos y que deberá estar 

gestionada por el DBMS.
