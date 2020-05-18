# Practica-de-laboratorio-03-Agenda-Telefonica-con-MVC-y-DAO

Esta aplicación permite de manera basica, registrar un usuario, luego agregar numeros de teléfono fijo o movil a su cuenta solo después de haber ingresado a ella mediante la introducción de su correo y contraseña proporcionados originalmente en el registro. Además permite editar estos contactos al aplicar los métodos Crear Ediar Actualizar e Imprimir(CRUD).

La misma emplea el patrón de diseño Modelo Vista Controlador(MVC) y el patrón de diseño Object mediante el componenete de software Objecto de Acceso de DaTos(DAO) en su estructura.
# Herramientas
- IDE: NeatBEans 11.3

# Descripción del desarrollo de la Práctica

- Familiarización con lo temas a abordar: 
   1. Colecciones
   2. Diccionarios
   3. Patrones de Diseño de Software Modelo Vista COntrolador(MVC) y Objeto de Acceso de Datos(DAO)
- Planteamiento del gdiagrama(UML).
- Generación de paquetes en base a los requerimientos de los paradigmas de programación empleados.
- Programación de las Clases Usuario y Teléfono.
- Generación del Controlador para Usuario y otro para Teléfono.
- Creación de las Interfaces "IUsuarioDAO" e "ITelefonoDAO".
- Creación de las Clases "DAOUsuario" y "DAOTelefono. 
- Implemetación de las interfaces mencionadas en las clases "DAOUsuario" y "DAOTelefono.

# Resultados Obtenidos

Bienvenido! !!


    MENÚ

1.Registrarse


2.Iniciar sesión


3.Salir


1


REGISTRO DE USUARIO


Su Cédula:


0102027125


Su Nombre:


Andres


Su Apellido:


Abad


Su correo:


jabad@gmail.com


Escriba su Contraseña:


Andres123


    MENÚ

1.Registrarse


2.Iniciar sesión


3.Salir


1
REGISTRO DE USUARIO


Su Cédula:


0104728688


Su Nombre:


Bertha


Su Apellido:


Chimbo


Su correo:


lucinda61@gmail.com


Escriba su Contraseña:


Lucinda123



    MENÚ

1.Registrarse


2.Iniciar sesión


3.Salir


2


Su correo electrónico:


jabad@gmail.com


Su contraseña:


Andres123


Hola !


  MENÚ DE USUARIO


1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


1


Código:


0102


Su número:


0995113347
Tipo movil/convencional:


movil


Su Operadora:


claro


Usuario: [cedula=0102027125, nombre=Andres, apellido=Abad, correo=jabad@gmail.com, contrasena=Andres123]



Hola !



  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


1


Código:


0103


Su número:


0986112306


Tipo movil/convencional:


movil


Su Operadora:


movistar


Usuario: [cedula=0102027125, nombre=Andres, apellido=Abad, correo=jabad@gmail.com, contrasena=Andres123][-Telefono:


[código=102, número=0995113347, tipo=movil, operadora=claro]]


Hola !

  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


7

    MENÚ

1.Registrarse


2.Iniciar sesión


3.Salir


2
Su correo electrónico:


lucinda61@gmail.com


Su contraseña:


Lucinda123


Hola !

  MENÚ DE USUARIO
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto




4.Eliminar Contacto




5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


1


Código:


0104


Su número:


072815423


Tipo movil/convencional:


convencional


Su Operadora:


etapa


Usuario: [cedula=0104728688, nombre=Bertha, apellido=Chimbo, correo=lucinda61@gmail.com, contrasena=Lucinda123][]

Hola !

  MENÚ DE USUARIO

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas

7.Salir
1


Código:


0105


Su número:


0982884520


Tipo movil/convencional:


movil
Su Operadora:


claro


Usuario: [cedula=0104728688, nombre=Bertha, apellido=Chimbo, correo=lucinda61@gmail.com, contrasena=Lucinda123]

[-Telefono:
[código=104, número=072815423, tipo=convencional, operadora=etapa]]



Hola !



  MENÚ DE USUARIO



1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir
2




Código de contacto:
104


-Telefono:
[código=104, número=072815423, tipo=convencional, operadora=etapa]


Hola !

  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


5


-Telefono:
[código=104, número=072815423, tipo=convencional, operadora=etapa]


-Telefono:
[código=105, número=0982884520, tipo=movil, operadora=claro]



Hola !

  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


6
Clave: 1  -> Valor: -Telefono:
[código=102, número=0995113347, tipo=movil, operadora=claro]


Clave: 2  -> Valor: -Telefono:
[código=103, número=0986112306, tipo=movil, operadora=movistar]


Clave: 3  -> Valor: -Telefono:
[código=104, número=072815423, tipo=convencional, operadora=etapa]


Clave: 4  -> Valor: -Telefono:
[código=105, número=0982884520, tipo=movil, operadora=claro]


Hola !

  MENÚ DE USUARIO
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


3


Código:


104


Su número:


099998777


Tipo movil/convencional:


movil


Su Operadora:


movistar


Actualizació exitosa: 


-Telefono:

[código=104, número=099998777, tipo=movil, operadora=movistar]



Hola !

  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


5
-Telefono:
[código=104, número=099998777, tipo=movil, operadora=movistar]


-Telefono:
[código=105, número=0982884520, tipo=movil, operadora=claro]



Hola !

  MENÚ DE USUARIO
  
  

1.Agregar contacto


2.Buscar Contacto


3.Actualizar Contacto


4.Eliminar Contacto


5.Listar Contactos de Usuario


6.Listar Contactos de todas las Cuentas


7.Salir


7


    MENÚ

1.Registrarse


2.Iniciar sesión


3.Salir


3
------------------------------------------------------------------------

# Conclusiones

- El empleo de Diccionarios mejoró la estruxtura del Proyecto en lo que respecta a registros.
- En base a que en esta Práctica aplicamos de manera diferente el paradima de MVC debido a la aplicación del DAO, las propiedades de la POO se evidencian mucho mejor en comparació a la última páctica.

# Recomendaciones

- Realizar ejercicios con Diccionarios previo a la práctica afianzaría la fluidez con la que se realizan los Proyectos.

